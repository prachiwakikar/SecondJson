package com.soft;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    	try {
    	Employee emp = new Employee();
    	emp.setId(101);
    	emp.setName("sam");
    	List<String> addrelist = new ArrayList<>();
    	addrelist.add("pune");
    	addrelist.add("Nashik");
    	addrelist.add("mumbai");
    	
    	emp.setAddress(addrelist);
    	
    	emp.setPhno(1440);
    	
    	ObjectMapper om = new ObjectMapper();
    	
        String jsondata =	om.writeValueAsString(emp);
        
        System.out.println(jsondata);
    	
    	
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
}
