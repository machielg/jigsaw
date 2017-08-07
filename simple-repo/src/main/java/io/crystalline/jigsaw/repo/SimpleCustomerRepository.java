package io.crystalline.jigsaw.repo;

import io.crystalline.jigsaw.client.needs.Customer;
import io.crystalline.jigsaw.client.needs.CustomerRepository;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class SimpleCustomerRepository implements CustomerRepository {

    @Override
    public Iterable<Customer> allCustomers() {
        SimpleCustomer customer1 = new SimpleCustomer(1, "John Doe");
        return Arrays.asList(customer1);
    }

    private static class SimpleCustomer implements Customer {

        private final Integer id;
        private final String name;

        SimpleCustomer(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public Integer getId() {
            return id;
        }
    }
}
