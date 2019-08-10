package fr.the3dx900.minebydaylight.game;

import fr.the3dx900.minebydaylight.game.killer.Hex;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

public class Totem {

    @Getter
    private Location location;

    @Getter
    @Setter
    private Hex hex;

    public Totem(Location location) {
        this(location, null);
    }

    public Totem(Location location, Hex hex) {
        this.location = location;
        this.hex = hex;
    }

    public void makeHex(Hex hex) {
        this.hex = hex;
        //TODO: Faire apparaîte le feu sur le totem.
    }

    public boolean isHex() {
        return hex != null;
    }
}
