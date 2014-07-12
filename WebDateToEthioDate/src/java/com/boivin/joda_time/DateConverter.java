package com.boivin.joda_time;

import java.io.Serializable;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.joda.time.DateTime;
import org.joda.time.chrono.EthiopicChronology;

/**
 * Hello world!
 *
 */
@ManagedBean
@SessionScoped
public class DateConverter implements Serializable {

    int year;
    int month;
    int day;
    private int maximumDay = 31;
    private int minimum = 1;
    private int maximumMonth = 12;
    String response = null;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximumMonth() {
        return maximumMonth;
    }

    public void setMaximumMonth(int maximumMonth) {
        this.maximumMonth = maximumMonth;
    }

    public int getMaximumDay() {
        return maximumDay;
    }

    public void setMaximumDay(int maximumDay) {
        this.maximumDay = maximumDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

//    public static void main(String[] args) {
////        Chronology coptic = CopticChronology.getInstance();
////        Chronology ethiopian = EthiopicChronology.getInstance();
////        Chronology gregorian = GregorianChronology.getInstance();
////
////        // current time with ethiopian chronology
////        DateTime dtEthiopian = new DateTime(ethiopian);
////
////        int yearEthiopian = dtEthiopian.getYear();   // gets the current ethiopian year
////        int monthEthiopian = dtEthiopian.getMonthOfYear(); // gets the current ethiopian month
////        int dayOfMonthEthiopian = dtEthiopian.getDayOfMonth(); // gets the current ethiopian day of month
////        dtEthiopian.getMonthOfYear();
////
////        System.out.println("yearEthiopian " + yearEthiopian + " monthEthiopian " + monthEthiopian
////                + " dayOfMonthEthiopian " + dayOfMonthEthiopian);
////
////        // current time with gregorian chronology
////        DateTime dtGregorian = new DateTime(gregorian);
////
////        int yearGregorian = dtGregorian.getYear();   // gets the current gregorian year
////        int monthGregorian = dtGregorian.getMonthOfYear(); // gets the current gregorian month
////        int dayOfMonthGregorian = dtGregorian.getDayOfMonth(); // gets the current gregorian day of month
////
////        System.out.println("yearGregorian " + yearGregorian + " monthGregorian " + monthGregorian + " dayOfMonthGregorian "
////                + dayOfMonthGregorian);
//
//
//        System.out.println("Input the year of interest: ");
//        Scanner scan = new Scanner(System.in);
//        int year = scan.nextInt();
//        System.out.println("Input the month of interest: ");
//        int month = scan.nextInt();
//        System.out.println("Input the day of interest: ");
//        int day = scan.nextInt();
//
////        DateTime dtEthiopic;
////        dtEthiopic = getResponse(year, month, day);
////
////        System.out.println("Ethiopian Calendar Date: " + dtEthiopic.getMonthOfYear() + "/" + dtEthiopic.getDayOfMonth() + "/"
////                + dtEthiopic.getYear());
//    }

    public String getResponse() {
        // setup date object for midday on May Day 2004 (ISO year 2004)
        DateTime dtISO = new DateTime(year, month, day, 12, 0, 0, 0);

// find out what the same instant is using the Ethiopic Chronology
        DateTime dtEthiopic = dtISO.withChronology(EthiopicChronology.getInstance());

        return "Ethiopian Calendar Date: " + dtEthiopic.getMonthOfYear() + "/" + dtEthiopic.getDayOfMonth() + "/"
                + dtEthiopic.getYear();
    }
}
