package io.crystalline.jigsaw;


import io.crystalline.jigsaw.client.Client;
import io.crystalline.jigsaw.repo.SimpleCustomerRepository;


public class Application {

    public static void main(String[] args) {
        SimpleCustomerRepository repo = new SimpleCustomerRepository();
        Client app = new Client(repo);
        app.demonstrate();
    }
}
