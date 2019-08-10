package fr.the3dx900.minebydaylight.game;

import fr.the3dx900.minebydaylight.game.survivor.Survivor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

public class Generator {

    @Getter
    private Location location;

    @Getter
    @Setter
    private double activation;
    @Getter
    private Survivor[] workers = new Survivor[4];

    public Generator(Location location) {
        this.location = location;
        activation = 0.0;
    }

    public void addWorker(Survivor survivor) {
        workers[workers.length - 1] = survivor;
    }

    public void removeWorker(Survivor survivor) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getUniqueId().equals(survivor.getUniqueId()))
                workers[i] = null;
        }
    }
}
