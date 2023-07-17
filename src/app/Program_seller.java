package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

import java.util.List;

public class Program_seller {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("=== TEST 2 seller findAll ===");
        List<Seller> list = sellerDao.findAll();

        for (Seller obj : list){
            System.out.println(obj);
        }

    }
}
