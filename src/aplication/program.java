package aplication;

import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("====== TEST 1: seller findById=======");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

    }

}
