package fr.the3dx900.minebydaylight.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

public class ClickPressedEvent extends PlayerEvent {

    private static final HandlerList handlerList = new HandlerList();

    private ItemStack item;
    private Action action;

    public ClickPressedEvent(Player who, ItemStack item, Action action) {
        super(who);
        this.item = item;
        this.action = action;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public ItemStack getItem() {
        return item;
    }

    public Action getAction() {
        return action;
    }
}
