package org.at.blueinv.api.item;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.at.blueinvapi.InventoryGUI;
import org.bukkit.inventory.ItemStack;

public class BorderInventory {
	private InventoryGUI ig;
	static HashMap<Integer,ItemStack> setter = new HashMap<Integer,ItemStack>();
	
	public BorderInventory(InventoryGUI ig){
		this.ig = ig;
	}
	
	public void createBorder(ItemStack is,List<Integer> skippedslots){
		for(int i : skippedslots){
			if(skippedslots.contains(i)){
				while(true){
				ig.getInv().setItem(i, is);
				continue;
			}
			}
		
		}
	}
	public List<Integer> getEachSlots(){
		return (List<Integer>) setter.keySet();
	}
	public void setSlots(List<Integer> list){
		for(int i : list){
			setter.keySet().add(i);
		}
	}
    
}
