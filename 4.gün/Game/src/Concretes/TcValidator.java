package Concretes;

import Abstracts.BaseValidator;
import Entites.User;

public class TcValidator implements BaseValidator {
    @Override
    public void checkIfRealPerson(User user) {
        System.out.println("Tc sorgulama doğrulandı " +user.getFirstName());
    }
}
