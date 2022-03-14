package Concretes;

import Abstracts.BaseCampaignManager;
import Entites.Campaign;
import Entites.Game;
import Entites.User;

public class CampaignManager implements BaseCampaignManager {

    @Override
    public void add(Campaign campaign) {

        System.out.println(campaign.getCampaignName() + " : Adlı Kampanya Başarıyla eklendi");
    }

    @Override
    public void update(Campaign campaign) {

        System.out.println(campaign.getCampaignName() + " : Adlı Kampanya Başarıyla güncellenfdi");
    }

    @Override
    public void delete(Campaign campaign) {


        System.out.println(campaign.getCampaignName() + " :  Adlı Kampanya Başarıyla silindi");
    }

    public int campaignPrice(Campaign campaign, Game game) {
        System.out.println(game.getPrice() + " TL olan oyunun indirim uygulanabilecek tutar : " + campaign.getDiscount() + " TL");
        return (game.getPrice()-campaign.getDiscount());
    }

}
