package fr.the3dx900.minebydaylight.game.survivor;

import fr.the3dx900.minebydaylight.game.Character;
import fr.the3dx900.minebydaylight.game.Generator;
import fr.the3dx900.minebydaylight.game.Loadout;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.UUID;

public abstract class Survivor implements Character {

    @Getter
    private Player player;
    @Getter
    private UUID uniqueId;

    @Getter
    @Setter
    private State state;

    @Getter
    private Loadout loadout;
    @Getter
    private SurvivorPerk[] perks;

    public Survivor(Loadout loadout, SurvivorPerk[] perks) {
        state = State.NORMAL;
        this.loadout = loadout;
        this.perks = perks;
    }

    public void heal() {
        heal(this);
    }

    public void heal(Survivor survivor) {
    }

    public void workingGenerator(Generator generator) {
        generator.addWorker(this);
    }

    public void stopWorkingGenerator() {
    }

    public enum State {
        NORMAL, HURT, CRITICAL
    }
}