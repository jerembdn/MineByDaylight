package fr.the3dx900.minebydaylight.game.survivor;

import fr.the3dx900.minebydaylight.game.Character;
import fr.the3dx900.minebydaylight.game.perk.Perk;

public abstract class SurvivorPerk implements Perk {

    private String name;
    private String[] description;

    private Character character;

    public SurvivorPerk() {
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
}
