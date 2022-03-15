package dataAcces.concretes;

import dataAccess.abstracts.BaseUserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements BaseUserDao {
    List<User> users = new ArrayList<>();


    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " / " + user.getLastName() + " Başarıyla eklendi.");

    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " / " + user.getLastName() + " Başarıyla güncellendi.");
    }

    @Override
    public void delete(User user) {

        System.out.println(user.getFirstName() + " / " + user.getLastName() + " Başarıyla eklendi.");
        users.remove(user);
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
