package com.controllerdao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.pojo.Employee;
import com.pojo.Passport;

public class EmployeeDAO {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("abbas");
		emp.setDesignation("associate");
		emp.setCompany("tcs");
		emp.setSalary("40k");
		Passport passport = new Passport();
		passport.setName(emp.getName());
		passport.setPlaceofissue("hyderabad");
		passport.setPassportnumbear("312gjklsf");
		passport.setIssuedate("12345");
		//passport.setValidupto("2030");
		emp.setPassport(passport);
		Configuration configure = new AnnotationConfiguration().configure("hibernate.config.xml");
		SessionFactory sessionFactory = configure.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Serializable save = session.save(emp);
		transaction.commit();

	}

}
