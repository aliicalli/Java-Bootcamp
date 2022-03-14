package Abstracts;

import Entities.Customer;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService{
    public void save(Customer customer) throws NumberFormatException, RemoteException {
        System.out.println("Veri taban�na kaydedildi : " +customer.getFirstName());

    }


}
