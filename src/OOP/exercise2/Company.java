package OOP.exercise2;

import java.util.ArrayList;

/**
 * A telecommunications company is characterized by providing different services,
 * such as cellular telephony. One of its units is in charge of serving the
 * company's clients and helps solve problems that they have with any service they offer.
 * The response speed of customer service operators is crucial since this can generate a
 * call for attention by the telecommunication superintendence.
 * There was a case in which Maria (an operator) took more than 20 days to respond to a
 * claim request, which is why Honorato Orfebre, one of the best clients, filed a complaint.
 */
public class Company {
    private ArrayList<Unit> units;
    private ArrayList<Service> services;

    public Company() {
        units = new ArrayList<>();
        services = new ArrayList<>();
    }
}
