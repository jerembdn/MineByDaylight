package fr.the3dx900.minebydaylight.game.object;

import fr.the3dx900.minebydaylight.MineByDaylight;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.function.Consumer;

public abstract class RunnableItem extends Item {

    @Getter
    private BukkitRunnable runnable;

    public RunnableItem(ItemStack item, Consumer<Item> onUse) {
        super(item, onUse);
    }

    public void run() {
        runnable = new BukkitRunnable() {
            @Override
            public void run() {
            }
        };
        runnable.runTaskTimerAsynchronously(MineByDaylight.getInstance(), 1000, 0);
    }
}
