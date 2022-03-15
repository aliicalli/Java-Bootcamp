package business.concretes;

import business.abstracts.BaseValidator;
import business.abstracts.Logger;
import dataAccess.abstracts.BaseUserDao;
import entities.concretes.User;

public class UserManager {
    BaseUserDao baseUserDao;
    BaseValidator validator;
    Logger emailLog;

    public UserManager(BaseUserDao baseUserDao, BaseValidator validator, Logger emailLog) {
        this.baseUserDao = baseUserDao;
        this.validator = validator;
        this.emailLog = emailLog;
    }

    public void register(User user) {
        if (validator.check(user, baseUserDao.getAll()) && emailLog.log(user)) {
            baseUserDao.add(user);
            System.out.println("Başarılı bir şekilde kayıt olundu");
        } else {
            System.out.println("Kullanıcı kaydı başarısız oldu");
        }
    }

    public void login(User user) {
        boolean result = false;
        for (User users : baseUserDao.getAll()) {
            if (users.getEmail() == user.getEmail() && user.getPassword() == user.getPassword()) {
                result = true;
            }
        }
        if (result) {

            System.out.println("Giriş başarıyla yapıldı");
        } else {

            System.out.println("Giriş yapılamadı şifre veya mail yanlış");
        }

    }


}
