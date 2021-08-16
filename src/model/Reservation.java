package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Reservation {
    Customer customer;
    IRoom room;
    public Date checkInDate;
    public Date checkOutDate;

    private String dateRegex= "^\\d{2}-\\d{2}-\\d{4}$";
    private Pattern pattern = Pattern.compile(dateRegex);

   public Reservation(Customer customer, IRoom room, String checkInDate, String checkOutDate) throws ParseException {
       if(!pattern.matcher(checkInDate).matches()){
           throw new IllegalArgumentException("Invalid checkin date");
       }
       if(!pattern.matcher(checkOutDate).matches()){
           throw new IllegalArgumentException("Invalid checkout date");
       }
        this.customer = customer;
        this.room = room;


       if(new SimpleDateFormat("dd-MM-yyyy").parse(checkInDate).before(new SimpleDateFormat("dd-MM-yyyy").parse(checkOutDate))){
           try {
               this.checkInDate = new SimpleDateFormat("dd-MM-yyyy").parse(checkInDate);
           } catch (ParseException e) {
               e.printStackTrace();
           }
           try {
               this.checkOutDate = new SimpleDateFormat("dd-MM-yyyy").parse(checkOutDate);
           } catch (ParseException e) {
               e.printStackTrace();
           }
       }
       else
           throw new IllegalArgumentException("Invalid period!!!");
   }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", room=" + room +
                ", checkInDate=" + DateFormat.getDateInstance().format(checkInDate) +
                ", checkOutDate=" + DateFormat.getDateInstance().format(checkOutDate) +
                '}';
    }
}
