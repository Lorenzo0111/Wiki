package me.lorenzo0111.test.Menu;

import me.Lorenzo0111.api.Menu.Menu;
import me.Lorenzo0111.api.Menu.MenuUtility;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ExampleMenu extends Menu {

    public ExampleMenu(MenuUtility menuUtility) {
        super(menuUtility);
    }

    @Override
    public String getMenuName() {
        return "§e§lExample Menu";
    }

    @Override
    public int getSlots() {
        return 9;
    }

    public ItemStack example = makeItem(Material.COAL, "§7Example COAL", "§7This is an example coal");

    @Override
    public void handleMenu(InventoryClickEvent event) {
        if (event.getCurrentItem().equals(example)) {
            event.setCancelled(true);
            event.getWhoClicked().closeInventory();
            event.getWhoClicked().sendMessage("Yay, it works!");
        }
    }

    @Override
    public void setMenuItems() {
        this.getInventory().setItem(1, example);
    }
}
