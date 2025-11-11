package theater;

import java.util.List;

/**
 * Class representing an invoice for a customer.
 */
public class Invoice {

    private String customer;
    private List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Performance> getPerformances() {
        return performances;
    }
}
