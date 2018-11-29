package com.jacend.martindemo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 *
 * @author fengxf
 * @since 2018-11-17
 */
public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String get_name() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + get_name() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            double thisAmount = each.getCharge();

            frequentRenterPoints++;

            if (each.get_movie().get_priceCode() == Movie.NEW_RELEASE &&
                    each.get_daysRented() > 1) {
                frequentRenterPoints++;
            }

            result += "\t" + each.get_movie().get_title() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }
}
