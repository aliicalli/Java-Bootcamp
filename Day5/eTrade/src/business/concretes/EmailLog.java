package business.concretes;

import business.abstracts.Logger;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class EmailLog implements Logger {
    List<String> mail = new ArrayList<>();

    public boolean log(User user) {
        return verify(user);
    }

    public void email(User user) {
        System.out.println("Doğrulama e postası gönderilmiştir");
        mail.add(user.getEmail());
    }

    public boolean verify(User user) {
        if (mail.contains(user.getEmail())) {
            return true;
        } else {
            return false;
        }
    }

}
