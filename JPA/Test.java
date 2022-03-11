package com.ia.employeecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sathya");
		
		EntityManager entity=factory.createEntityManager(); 
		
		//persist()-->save or insert, merge()-->update, remove()-->delte, find()==>selct fetch
		
		Employee emp= new Employee(123, "ravi", 1000, "hyd");
		
		entity.getTransaction().begin();
		
		entity.persist(emp);
		
	
		
		
		entity.getTransaction().commit();
		
	}

}
