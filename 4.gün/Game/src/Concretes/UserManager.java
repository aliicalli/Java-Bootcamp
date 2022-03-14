package Concretes;

import Abstracts.BaseUserManager;
import Abstracts.BaseValidator;
import Entites.User;

public class UserManager implements BaseUserManager {
    BaseValidator validator;

    public UserManager(BaseValidator validator) {
        this.validator = validator;
    }

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " Eklendi");
        validator.checkIfRealPerson(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
