package business.abstracts;

import entities.concretes.User;

public interface Logger {
    boolean log(User user);
}
