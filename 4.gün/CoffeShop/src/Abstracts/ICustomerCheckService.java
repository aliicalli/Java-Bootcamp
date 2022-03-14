package Abstracts;

import Entities.Customer;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws RemoteException, NumberFormatException;
}
