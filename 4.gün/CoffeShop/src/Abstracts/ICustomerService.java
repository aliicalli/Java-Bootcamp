package Abstracts;

import Entities.Customer;

import java.rmi.RemoteException;

public interface ICustomerService {

    void save(Customer customer) throws NumberFormatException, RemoteException;
}
