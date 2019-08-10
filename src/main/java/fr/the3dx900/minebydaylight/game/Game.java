package fr.the3dx900.minebydaylight.game;

import fr.the3dx900.minebydaylight.game.killer.Killer;
import fr.the3dx900.minebydaylight.game.killer.KillerPerk;
import fr.the3dx900.minebydaylight.game.survivor.Survivor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    @Getter
    private Killer killer;
    @Getter
    private Survivor[] survivors = new Survivor[4];

    @Getter
    private List<Totem> totems = new ArrayList<>();
    @Getter
    private List<Generator> generators = new ArrayList<>();

    public Game() {
    }

    public void init() {
        spawnTotems();
    }

    private void spawnTotems() {
        //TODO: Faire apparaître tous les totems de la map à leur location.
        for (KillerPerk perk : killer.getPerks()) {
            if (perk.isHex()) {
                int number = new Random(totems.size()).nextInt();
                Totem totem = totems.get(number);
                totem.makeHex(perk.getHex());
            }
        }
    }

    public void start() {
    }
}
