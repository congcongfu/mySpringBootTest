package com.baldurtech.controller;

import com.baldurtech.entity.User;
import com.baldurtech.entity.Contact;
import com.baldurtech.dbManager.DbManager;

import java.awt.image.Raster;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.jdbc.core.JdbcTemplate;


@EnableAutoConfiguration
@Controller
@RequestMapping("/contact")
public class ContactController 
{

    @RequestMapping("/{id}")
    private String view(@PathVariable("id") Long id, @RequestParam("name") String name, Model model) 
    {
        User user = new User();
        user.setId(id);
        user.setName(name);
        model.addAttribute("user", user);
        return "helloWorld";
    }
    
    @RequestMapping("list")
    private String contactList(Model model) 
    {       
    	System.out.println("gg hello");
        DbManager dbManager = new DbManager();
        List<Contact> results = dbManager.executeQuery();
        model.addAttribute("contact", results);
        System.out.println("this hello contactlist");
        return "contactList";
    }
    
    @RequestMapping("lists")
    private ModelAndView contactList() 
    {       
    	System.out.println("gg hello");
        DbManager dbManager = new DbManager();
        List<Contact> results = dbManager.executeQuery();
        System.out.println("gg hello contactlist");
        return new ModelAndView("contactlist", "contactlist", results);
    }
    
    @RequestMapping("show")
    private String contactShow(@RequestParam("id") Long id, Model model)
    {
        DbManager dbManager = new DbManager();
        Contact contact = new Contact();
        contact.setId(id);
        model.addAttribute("contact", dbManager.executeQueryById(contact));
        return "show";
        
    }
    
}
