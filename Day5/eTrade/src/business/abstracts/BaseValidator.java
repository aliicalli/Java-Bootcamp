package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface BaseValidator {
    boolean check(User user, List<User> users);
}
