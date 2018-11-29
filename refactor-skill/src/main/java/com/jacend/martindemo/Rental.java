package com.jacend.martindemo;

/**
 * 租赁
 *
 * @author fengxf
 * @since 2018-11-17
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public double getCharge() {
        double result = 0;
        switch (this.get_movie().get_priceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (this.get_daysRented() > 2) {
                    result += (this.get_daysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += this.get_daysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (this.get_daysRented() > 3) {
                    result += (this.get_daysRented() - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return result;
    }
}
