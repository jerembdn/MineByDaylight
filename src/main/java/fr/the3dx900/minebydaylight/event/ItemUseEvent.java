package fr.the3dx900.minebydaylight.event;

import fr.the3dx900.minebydaylight.game.object.Item;
import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ItemUseEvent extends Event {

    private HandlerList handlerList = new HandlerList();

    @Getter
    private Item item;

    public ItemUseEvent(Item item) {
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
