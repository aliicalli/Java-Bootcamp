package business.concretes;

import business.abstracts.BaseValidator;
import entities.concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class Validator implements BaseValidator {


    public boolean check(User user, List<User> users) {
        return (name(user) && emailCheck(user) && uniqEmail(user, users) && password(user));
    }

    //tamam
    public boolean password(User user) {
        if (user.getPassword().length() >= 6 && !user.getPassword().isEmpty()) {
            return true;
        } else {
            System.out.println("Parolayı en az 6 karakterden fazla olacak şekilde boş bırakmadan dolduruz.");
            return false;
        }
    }

    //tamam
    public boolean name(User user) {
        if (user.getLastName().length() > 2 && user.getFirstName().length() > 2 && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()) {
            return true;
        } else {
            System.out.println("İsim bilgilerinizi doğru bir şekilde giriniz.");
            return false;
        }
    }

    private boolean emailCheck(User user) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        if (user.getEmail().isEmpty()) {
            System.out.println("Email alanı boş bırakılamaz");
            return false;
        } else {
            if (pattern.matcher(user.getEmail()).find() == false) {
                System.out.println("Girilen email adresi formata uygun değil");
                return false;
            }
        }
        return true;

    }

    //tamam
    public boolean uniqEmail(User user, List<User> users) {
        boolean result = false;
        for (User userl : users){
            if (userl.getEmail() == user.getEmail()){
                result = true;
            }
        }

        if (!result) {
            System.out.println("Bu mail daha önce kullanılmıştır");
            return false;
        } else {
            return true;
        }
    }


}
