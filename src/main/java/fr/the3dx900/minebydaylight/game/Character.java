package fr.the3dx900.minebydaylight.game;

import fr.the3dx900.minebydaylight.game.object.Offering;
import fr.the3dx900.minebydaylight.game.perk.Perk;
import fr.the3dx900.minebydaylight.game.survivor.Survivor;

public interface Character {

    Type getType();

    Survivor.State getState();

    void setState(Survivor.State state);

    Perk[] getPerks();

    Offering getOffering();

    void setOffering(Offering offering);

    enum Type {
        KILLER, SURVIVOR
    }
}
