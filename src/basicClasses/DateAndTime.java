/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;
import java.util.GregorianCalendar;

/**
 *
 * @author Abdelhalim
 */
public class DateAndTime {

    Date date = new Date();
    SimpleDateFormat simpleDateFormat;

    public DateAndTime() {
        simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    }

    public Date getDate() {
        return this.date;
    }

    public String getDateFormat() {
        return simpleDateFormat.format(this.date);
    }

    public void convertStringIntoDateFormate() {

        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = "2007-05-10";
        String input = stringDate.length() == 0 ? "1818-11-11" : stringDate;
        System.out.println(input + " parses as");
        Date t;
        try {
            t = simpleFormat.parse(input);
            System.out.println(t);
        } catch (ParseException parseException) {
            System.out.println("UnParseable Using" + parseException);
        }
    }

    public void sleepBetweenTwoDates() {
        try {
            System.out.println("The Date now is = " + new Date());
            Thread.sleep(60 * 10 * 5);
            System.out.println("The Date now is = " + new Date());
        } catch (Exception exp) {
            System.out.println("Have Exception tell you that, " + exp);
        }
    }

    public void calculateElapsedTime() {
        try {
            long start = System.currentTimeMillis();
            System.out.println("The Date now is = " + new Date());
            Thread.sleep(60 * 10 * 5);
            System.out.println("The Date now is = " + new Date());
            long end = System.currentTimeMillis();
            long difference = end - start;
            System.out.println("the Elapsed time = " + (difference / 60));
        } catch (Exception exp) {
            System.out.println("Have Exception tell you that, " + exp);
        }
    }

    public void getCalender() {
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        int year;
        // Create a Gregorian calendar initialized
        // with the current date and time in the
        // default locale and timezone.
        GregorianCalendar calender = new GregorianCalendar();
        // Display the current time and date information
        System.out.print("Date : ");
        System.out.print(""+months[calender.get(calender.MONTH)]);
        System.out.print(""+calender.get(calender.DATE));
        
        year = calender.get(calender.YEAR);
        System.out.println(""+ year);
        System.out.print("Time : ");
        System.out.print(calender.get(calender.HOUR)+":");
        System.out.print(calender.get(calender.MINUTE)+":");
        System.out.println(calender.get(calender.SECOND));
        
        // test is the current year is a leap year
        if(calender.isLeapYear(year)){
            System.out.println("the year is a leap year");
        }else{
            System.out.println("the year is not a leap year");
        }
    }
}

/** Main Code
 * 
        DateAndTime date = new DateAndTime();
        System.out.println("" + date.getDate().toString());
        System.out.println("Current Date = "+date.getDateFormat());
        date.convertStringIntoDateFormate();
        date.sleepBetweenTwoDates();
        date.calculateElapsedTime();
        date.getCalender();
* 
 */
