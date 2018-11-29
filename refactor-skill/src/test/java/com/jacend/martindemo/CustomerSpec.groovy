package com.jacend.martindemo
/**
 *
 * @author fengxf
 * @since 2018-11-17
 */
class CustomerSpec {

    def "Statement"() {
        given:
        Movie movie = new Movie("绿野仙踪", Movie.NEW_RELEASE)
        Rental rental = new Rental(movie, 4)
        Customer customer = new Customer("jacend")
        customer.addRental(rental)

        String result = "Amount owed is 12\n"
        result += "You earned 1  frequent renter points"

        expect:
        result == customer.statement()
    }
}
