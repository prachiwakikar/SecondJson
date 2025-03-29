package com.soft;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App2 {
	public static void main(String[] args) {
		
		try {
		Employee emp = new Employee();
		
		String jsonData = "{\"id\":101,\"name\":\"sam\",\"address\":[\"pune\",\"Nashik\",\"mumbai\"],\"phno\":1440}";
		
			ObjectMapper om = new ObjectMapper();
		
		emp = om.readValue(jsonData, Employee.class);
		
		System.out.println(emp);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
