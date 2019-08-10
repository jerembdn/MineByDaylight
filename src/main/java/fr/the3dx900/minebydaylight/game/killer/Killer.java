package fr.the3dx900.minebydaylight.game.killer;

import fr.the3dx900.minebydaylight.game.Character;
import fr.the3dx900.minebydaylight.game.Loadout;
import fr.the3dx900.minebydaylight.game.survivor.Survivor;
import lombok.Getter;

public abstract class Killer implements Character {

    @Getter
    private Loadout loadout;
    @Getter
    private KillerPerk[] perks;

    public Killer(Loadout loadout, KillerPerk[] perks) {
        this.loadout = loadout;
        this.perks = perks;
    }

    @Override
    public KillerPerk[] getPerks() {
        return perks;
    }

    public void hitSurvivor(Survivor survivor) {
        switch (survivor.getState()) {
            case NORMAL:
                survivor.setState(Survivor.State.HURT);
            case HURT:
                survivor.setState(Survivor.State.CRITICAL);
        }
        //TODO: Hit animation & Delay.
    }
}
