package org.at.blueinvapi.listener;

import org.at.blueinvapi.InventoryGUI;
import org.at.blueinvapi.util.GuiUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryListener implements Listener{
	
	@EventHandler
	public void onExecute(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
	    InventoryGUI ig = GuiUtils.getCurrentGUI(p);
	    if(!ig.getInv().equals(p.getInventory())){
	    if(ig.getItemsGUI().contains(e.getCurrentItem())){
	    	if(!ig.getAP().containsKey(e.getCurrentItem())){
	    		e.setCancelled(true);
	    	}else{
	    		if(ig.getAP().fromIS(e.getCurrentItem()).equals(e.getClick())){
	    			e.setCancelled(true);
	    			ig.getAP().fromIS(e.getCurrentItem()).execute(e);
	    		}
	    	}
	    }
	}
}
	@EventHandler
	public void onClose(InventoryCloseEvent e){
		Player p = (Player) e.getPlayer();
		InventoryGUI ig = GuiUtils.getCurrentGUI(p);
        ig.getAP().fromInventoryGUI(ig).close(e);
	}
}