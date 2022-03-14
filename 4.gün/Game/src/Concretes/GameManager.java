package Concretes;

import Abstracts.BaseGameManager;
import Entites.Game;

public class GameManager implements BaseGameManager {

    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " Başarıyla eklendi");
    }

    @Override
    public void update(Game game) {

        System.out.println(game.getName() + " Başarıyla güncellendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " Başarıyla silindi");

    }
}
