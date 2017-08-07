package io.crystalline.jigsaw.client;

import io.crystalline.jigsaw.client.needs.CustomerRepository;

public class Client {
    private CustomerRepository repo;

    public Client(CustomerRepository repo) {
        this.repo = repo;
    }

    public void demonstrate() {

        repo.allCustomers().forEach(c -> {
            System.out.println(c.name());
        });
    }

}
