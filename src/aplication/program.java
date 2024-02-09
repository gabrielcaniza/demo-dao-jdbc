package aplication;

import java.util.Date;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class program {

    public static void main(String[] args) {

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
    }
}
