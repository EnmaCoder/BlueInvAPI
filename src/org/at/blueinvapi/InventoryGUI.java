package org.at.blueinvapi;

import java.util.List;

import org.at.blueinv.api.item.AnimatedItem;
import org.at.blueinv.api.item.ItemsGUI;
import org.at.blueinvapi.util.ActionPutter;
import org.bukkit.inventory.Inventory;

public interface InventoryGUI{
	
	Inventory getInv();
	
	String getTitle();
	
	int getSlots();
	
	List<AnimatedItem> getList();
	
   ItemsGUI getItemsGUI();
    
    void createGUI();

    ActionPutter getAP();
    
	String getName();

}
