package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer,Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Jone1","jone1@gmail.com","America1"));
        customers.put(2,new Customer(2,"Jone2","jone2@gmail.com","America2"));
        customers.put(3,new Customer(3,"Jone3","jone3@gmail.com","America3"));
        customers.put(4,new Customer(4,"Jone4","jone4@gmail.com","America4"));
        customers.put(5,new Customer(5,"Jone5","jone5@gmail.com","America5"));
    }

    @Override
    public List<Customer> findAll(){
      return new ArrayList<Customer>(customers.values());
    }

    @Override
    public void save(Customer customer){
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.replace(id,customer);
    }

    @Override
    public void remove(int id) {
       customers.remove(id);
    }

}
