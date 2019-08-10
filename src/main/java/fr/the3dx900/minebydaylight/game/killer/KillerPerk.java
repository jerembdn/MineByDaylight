package fr.the3dx900.minebydaylight.game.killer;

import fr.the3dx900.minebydaylight.game.Character;
import fr.the3dx900.minebydaylight.game.perk.Perk;
import lombok.Getter;
import lombok.Setter;

public abstract class KillerPerk implements Perk {

    private String name;
    private String[] description;

    private Character character;

    @Getter
    @Setter
    private Hex hex;

    public KillerPerk() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String[] getDescription() {
        return new String[0];
    }

    @Override
    public Character getCharacter() {
        return null;
    }

    public boolean isHex() {
        return hex != null;
    }
}
