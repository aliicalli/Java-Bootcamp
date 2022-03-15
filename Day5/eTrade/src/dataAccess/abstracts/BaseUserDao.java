package dataAccess.abstracts;

import entities.concretes.User;

import java.util.List;

public interface BaseUserDao {
    void add(User user);

    void update(User user);

    void delete(User user);

    List<User> getAll();

}
