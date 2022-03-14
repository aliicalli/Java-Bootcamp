package Abstracts;

import Entites.Campaign;
import Entites.Game;


public interface BaseCampaignManager {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    int campaignPrice(Campaign campaign, Game game);
}
