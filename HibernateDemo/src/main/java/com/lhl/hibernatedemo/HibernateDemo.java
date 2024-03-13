/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lhl.hibernatedemo;

import com.lhl.pojo.Category;
import com.lhl.pojo.Product;
import com.lhl.repository.impl.CategoryRepositoryImpl;
import com.lhl.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;


/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        try (Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            cates.forEach(c -> System.out.printf("%d - %s\n", c.getId(), c.getName()));
//        }

        CategoryRepositoryImpl ss = new CategoryRepositoryImpl();
        ss.getCategories().forEach(c -> System.out.println(c.getName()));

        ProductRepositoryImpl s = new ProductRepositoryImpl();
        
        Product p = new Product();
        p.setName("ABC");
        p.setPrice(12000000l);
        p.setCategoryId(ss.getCategoryById(1));
        s.addOrUpdate(p);
//        
//        Map<String, String> params = new HashMap<>();
//        params.put("fromPrice", "18000000");
//        params.put("toPrice", "21000000");
//        params.put("cateId", "2");
//        
//        s.getProducts(params).forEach(p -> System.out.printf("%s - %d - %s\n", 
//                p.getName(), p.getPrice(), p.getCategoryId().getName()));


        
    }
}
