import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getFirstName() + " Kişi başarıyla eklendi.");
    }

    public void update(User user) {
        System.out.println(" Kişi başarıyla güncellendi.");
    }

    public void delete(User user) {

        System.out.println(" Kişi başarıyla silindi.");
    }

}
