package aplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("====== TEST 1: seller findById=======");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("====== TEST 2: seller SellerfindById=======");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("====== TEST 3: seller SellerfindAll=======");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("====== TEST 4: seller Seller Insert=======");
        Seller newSeller = new Seller(0, "GREG", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Insert new id = " + newSeller.getId());

        System.out.println("====== TEST 5: Seller Insert=======");
        seller = sellerDao.findById(1);
        seller.setName("belly linda");
        sellerDao.update(seller);
        System.out.println("updated Complete! ");

        System.out.println("====== TEST 6: Seller Delete=======");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed");

        sc.close();

    }
}
