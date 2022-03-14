package Abstracts;

import Entites.Campaign;
import Entites.Game;
import Entites.User;

public interface BaseSaleManager {
    void sell(User user, Game game, Campaign campaign);
}
