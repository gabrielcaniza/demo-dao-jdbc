package aplication;


import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class program {

    public static void main(String[] args) {

        
        SellerDao sellerDao= DaoFactory.createSellerDao();
        Seller seller= sellerDao.findById(1);
        System.out.println(seller);

    }

}
