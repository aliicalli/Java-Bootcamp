package Abstracts;

import Entites.User;

public interface BaseUserManager {
    void add(User user);
    void update(User user);
    void delete(User user);
}
