package fr.the3dx900.minebydaylight.game;

import fr.the3dx900.minebydaylight.game.object.Addon;
import fr.the3dx900.minebydaylight.game.object.Item;
import lombok.Getter;

public class Loadout {

    @Getter
    private Item item;
    @Getter
    private Addon[] addons;

    public Loadout(Item item, Addon[] addons) {
        this.item = item;
        Addon[] finalAddons = new Addon[2];
        for (int i = 0; i < finalAddons.length; i++) {
            finalAddons[i] = addons[i];
        }
        this.addons = finalAddons;
    }
}
