package Concretes;

import Abstracts.BaseCampaignManager;
import Abstracts.BaseSaleManager;
import Entites.Campaign;
import Entites.Game;
import Entites.User;

public class SaleManager implements BaseSaleManager {

    BaseCampaignManager baseCampaignManager ;

    public SaleManager(BaseCampaignManager baseCampaignManager) {
        this.baseCampaignManager = baseCampaignManager;
    }

    @Override
    public void sell(User user, Game game, Campaign campaign) {
        System.out.println(user.getFirstName()+" sana özel kapmanya ile" +game.getName() + " oyununu " +
                baseCampaignManager.campaignPrice(campaign,game) +" TL olarak alıyorsun" );
    }
}
