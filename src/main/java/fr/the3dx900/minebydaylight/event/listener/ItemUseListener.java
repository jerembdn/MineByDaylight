package fr.the3dx900.minebydaylight.event.listener;

import fr.the3dx900.minebydaylight.event.ItemUseEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ItemUseListener implements Listener {

    @EventHandler()
    public void onItemUse(ItemUseEvent event) {
        event.getItem().use(true);
    }
}
