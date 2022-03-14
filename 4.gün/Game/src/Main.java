import Concretes.*;
import Entites.Campaign;
import Entites.Game;
import Entites.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Ali", "Çallı", "1999", "12315423523");
        Game game = new Game(1, "GTA", 100);
        Campaign campaign = new Campaign(1, "Sana özel", 20);

        UserManager userManager = new UserManager(new TcValidator());
        userManager.add(user);
        userManager.update(user);
        userManager.delete(user);

        System.out.println("------------------");
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.update(game);
        gameManager.delete(game);

        System.out.println("------------------");
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.delete(campaign);
        campaignManager.update(campaign);
        System.out.println("------------------");
        SaleManager saleManager = new SaleManager(new CampaignManager());
        saleManager.sell(user,game,campaign);


    }
}
