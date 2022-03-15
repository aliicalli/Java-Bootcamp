import business.concretes.EmailLog;
import business.concretes.GoogleAuth;
import business.concretes.UserManager;
import business.concretes.Validator;
import dataAcces.concretes.HibernateUserDao;
import dataAccess.abstracts.BaseUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        EmailLog emailLog = new EmailLog();
        Validator validator = new Validator();
        HibernateUserDao hibernateUserDao = new HibernateUserDao();

        UserManager userManager = new UserManager(hibernateUserDao, validator, emailLog);
        User user1 = new User(1, "alicalli@gmail.com", "1234567", "Ali", "Çallı");
        User user2 = new User(2, "alicalli@gmail.com", "1234567", "Ahmet", "Çallı");
        User user3 = new User(3, "deneme@gmail.com", "1234567", "Mehmet", "Çallı");
        emailLog.email(user1);
        emailLog.email(user2);
        emailLog.email(user3);
        GoogleAuth googleAuth = new GoogleAuth(hibernateUserDao);
        googleAuth.add(user1);
        System.out.println("-----------------------------");
        userManager.register(user1);
        userManager.register(user2);
        userManager.register(user3);

        System.out.println("---------------------");
        userManager.login(user1);


    }
}
