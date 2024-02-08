package model.dao;

import Connection.DB;
import model.impl.SellerDaoJdbc;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJdbc(DB.getConnection());
    }
}
