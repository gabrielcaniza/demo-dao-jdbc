package aplication;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class program {

    public static void main(String[] args) {

        Department obj = new Department(1, "books");
        Seller seller= new Seller(21, "BOB", "bob@gmail.com", new Date(), 300.00, obj);
        System.out.println(seller);

    }

}
