package business.concretes;

import business.abstracts.Authentication;
import dataAccess.abstracts.BaseUserDao;
import entities.concretes.User;

import java.util.List;

public class GoogleAuth implements Authentication {
    BaseUserDao baseUserDao;

    public GoogleAuth( BaseUserDao baseUserDao) {
        this.baseUserDao = baseUserDao;
    }

    public void add(User user) {
        if (uniq(user, baseUserDao.getAll())) {
            baseUserDao.add(user);
            System.out.println("Kullanıcı kaydı başaryıla gerçekleşti");
        } else {
            System.out.println("Kullanıcı  maili başarısız");
        }
    }

    public boolean uniq(User user, List<User> users) {
        if (users.contains(user.getEmail())) {
            System.out.println("Bu mail daha önce kullanılmıştır");
            return false;
        } else {
            return true;
        }
    }
}

