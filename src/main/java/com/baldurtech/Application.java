package com.baldurtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.baldurtech.entity.Contact;
import com.baldurtech.entity.Department;
import com.baldurtech.dbManager.DbManager;
import com.baldurtech.dbManager.RowMapperImpl;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application 
{
    public static void main(String[] args) 
    {
        SpringApplication.run(Application.class);
        DbManager dbManager = new DbManager();
        System.out.println("executeQuery");
        
        Contact contact = new Contact();
        contact.setId(2L);
        contact = dbManager.executeQueryById(contact);  
        System.out.println(contact);
        
        List<Contact> contacts = dbManager.executeQuery();
        System.out.println(contacts);
        
//        com.baldurtech.dbManager.admin.DbManager dbManager2 = new com.baldurtech.dbManager.admin.DbManager();
////        List<Department> departments = dbManager2.executeQuery();
////        System.out.println(departments);
//        Department department = new Department();
//        department.setAddress("zhejiangshengquzhoushi");
//        department.setMemo("test usage");
//        department.setName("Eric");
//        department.setParent("your sister");
//        dbManager2.insert(department);
        
        /*DbManager dbManager = new DbManager();
        
        Contact contact = new Contact();
        contact.setName("mengguizhen");
        contact.setMobile("18235408753");
        contact.setEmail("123@qq.com");
        contact.setHomeAddress("shanxi");
        contact.setOfficeAddress("taiyuan");
        contact.setMemo("zanwu");
        contact.setJob("HR");
        contact.setJobLevel(3L);
        
        dbManager.insert(contact);;
        System.out.println(contact);*/
        
    }
}
