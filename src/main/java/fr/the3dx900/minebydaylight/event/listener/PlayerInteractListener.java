package fr.the3dx900.minebydaylight.event.listener;

import fr.the3dx900.minebydaylight.event.ClickPressedEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    @EventHandler()
    public void onPlayerInteract(PlayerInteractEvent event) {
        switch (event.getAction()) {
            case RIGHT_CLICK_AIR:
            case RIGHT_CLICK_BLOCK:
                ClickPressedEvent clickEvent = new ClickPressedEvent(event.getPlayer(), event.getItem(), event.getAction());
                Bukkit.getServer().getPluginManager().callEvent(clickEvent);
                break;
            case LEFT_CLICK_AIR:
            case LEFT_CLICK_BLOCK:
                break;
        }
    }
}
