package oop.java.fundamental.application;

import oop.java.fundamental.data.Company; // Importing Company class from the data package

public class CompanyApp { // Declaration Company Class
    public static void main(String[] args) { // Main method

        // Creating an instance of Company class
        Company company = new Company();
        company.setName("Adriannbhp");

        // Creating an instance of inner class Employee
        Company.Employee employee = company.new Employee();
        employee.setName("Adrian");

        System.out.println(employee.getName()); // Printing the name of the employee
        System.out.println(employee.getCompany()); // Printing the name of the company

        // Creating another instance of Company class
        Company company2 = new Company();
        company2.setName("Ada gk yh");

        // Creating another instance of inner class Employee
        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Naizar");

        System.out.println(employee2.getName()); // Printing the name of the second employee
        System.out.println(employee2.getCompany()); // Printing the name of the company associated with the second employee
    }
}
