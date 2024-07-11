package view;

import business.concretes.CustomerManager;
import dao.concretes.CustomerDao;
import entities.Customer;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //Dependency Injection bu şekilde yönetildi.
        CustomerManager customerManager = new CustomerManager(new CustomerDao());


        /*
        Customer customer = new Customer();
        customer.setName("Spring Dersleri");
        customer.setMail("test@patika.dev");
        customer.setGender(Customer.Gender.FEMALE);
        customer.setOnDate(LocalDate.now());

        customerManager.save(customer);
         */


        /*Customer firstCustomer = customerManager.findById(1);
        System.out.println(firstCustomer.toString());
         */

        //customerManager.deleteById(2);

        ///UPDATE İŞLEMİ
        //Customer customer = customerManager.findById(1);
        //customer.setMail("test@patika.dev");

        List<Customer> customerList = customerManager.findAll();
        System.out.println(customerList.toString());

    }
}
