package fr.the3dx900.minebydaylight;

import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class MineByDaylight extends JavaPlugin {

    @Getter
    private static Plugin instance;

    @Override
    public void onLoad() {
        super.onLoad();

        instance = this;
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
