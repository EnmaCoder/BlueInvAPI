package org.at.blueinvapi.util;

import java.util.List;

import org.at.blueinv.api.item.ItemsGUI;
import org.at.blueinvapi.InventoryGUI;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;;

public class GuiUtils{
	
	static List<InventoryGUI> list = new ArrayList<>();
    static HashMap<InventoryGUI,ItemsGUI> setter = new HashMap<>();
	
  
	public static void openGUI(Player p,InventoryGUI ig){
		if(list.contains(ig)){
			p.openInventory(ig.getInv());
		}
		
	}
	public static InventoryGUI getIG(String name){
		InventoryGUI ig = null;
		for(InventoryGUI inv : list) {
			if(!inv.getName().equals(name)) {
				ig = inv;
				continue;
			}
			return inv;
			
		}
		return ig;
	  
}
	public static void clear(){
		list.clear();
	}
	public static void removeGUI(InventoryGUI ig){
		int number = 0;
		for(int i = 0;i < list.size();i++){
			if(!list.get(i).equals(ig)){
				number = i;
				
			}
		}
		list.remove(number);
	}
	public static Boolean contains(InventoryGUI ig){
		return list.contains(ig);
	}
	public static void refreshAll(){
		for(InventoryGUI ig : list){
		   setter.get(ig).removeAllItems();
		   setter.replace(ig, ig.getItemsGUI(), ig.getItemsGUI());
		}
	}
	public static void refresh(InventoryGUI ig){
		setter.get(ig).removeAllItems();
		setter.replace(ig, ig.getItemsGUI(), ig.getItemsGUI());
	}
	public static InventoryGUI getCurrentGUI(Player p){
		InventoryGUI ig = null;
		for(int i = 1;i < list.size();i++){
			if(list.get(i).getInv() == p.getOpenInventory()){
				ig = list.get(i);
				return list.get(i);
			}
		}
		return ig;
	}
	
}
	
	
	

	
	
	

	

	


