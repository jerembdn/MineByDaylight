package fr.the3dx900.minebydaylight.game.object;

import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public abstract class Item {

    @Getter
    private ItemStack item;
    private Consumer<Item> onUse;

    public Item(ItemStack item, Consumer<Item> onUse) {
    }

    public void use(boolean use) {
        if (use) {
            onUse.accept(this);
        } else {
            if (this instanceof RunnableItem) {
                ((RunnableItem) this).getRunnable().cancel();
            }
        }
    }
}
