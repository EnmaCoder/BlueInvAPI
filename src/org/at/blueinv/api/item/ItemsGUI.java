package org.at.blueinv.api.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.at.blueinvapi.InventoryGUI;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemsGUI {
   private InventoryGUI i;
   List<ItemStack> list = new ArrayList<>();
   HashMap<Integer,ItemStack> setter = new HashMap<>();
   private int in;
   
   ItemsGUI(InventoryGUI i){
	   this.i = i;
   }
   public void addItem(ItemStack is){
	   list.add(is);
   }
   public void removeItem(ItemStack is){
       list.remove(is);
   }
   public void removeAllItems(){
	   list.clear();	   
   }
   public boolean contains(ItemStack is){
	   return list.contains(is);
   }
   public ItemStack getSlot(int number){
	   this.in = number;
	   return list.get(number);
   }
   public void setMaterial(Material m){
	   list.get(in).setType(m);
	   
   }
   public void putItemsInGui(boolean sort){
	   if(sort){
		  for(int number = 1;number < list.size();number++){
			  i.getInv().setItem(number, list.get(number));
		  }
		  
	   }else{
		  for(int n : setter.keySet()){
			  
			  i.getInv().setItem(n, setter.get(n));
		  
	   }
	   }
   }
 
   

	

}
