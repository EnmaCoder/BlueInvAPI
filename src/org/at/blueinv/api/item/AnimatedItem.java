package org.at.blueinv.api.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.at.blueinvapi.AnimationItem;
import org.at.blueinvapi.InventoryGUI;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class AnimatedItem extends BukkitRunnable implements AnimationItem{
	
	private ItemStack is;
	private InventoryGUI ig;
	static List<Material> items = new ArrayList<>();
	static List<Integer> slots = new ArrayList<>();
	static List<List<String>> morelores = new ArrayList<>();
	static List<String> list = new ArrayList<>();
	AnimatedItem(ItemStack is,InventoryGUI ig){
		this.is = is;
		this.ig = ig;
	}

	

	@Override
	public String getNameItem() {
		// TODO Auto-generated method stub
		return is.getItemMeta().getDisplayName();
	}

	@Override
	public List<String> getLores() {
		// TODO Auto-generated method stub
		return is.getItemMeta().getLore();
	}

	@Override
	public List<Integer> getSlots() {
		// TODO Auto-generated method stub
		return slots;
	}

	@Override
	public Random random() {
		// TODO Auto-generated method stub
		return new Random();
	}
	public void putItem(Material is){
		items.add(is);
	}
    public void addSlot(int slot){
    	slots.add(slot);
    }

    public void setLore(List<String> lores){
    		is.getItemMeta().setLore(lores);
    }
    public void addLores(List<String> lores){
        morelores.add(lores);
    }

	@Override
	public void run() {
		for(int number : slots){
			if(number == random().nextInt(slots.size())){
			if(ig.getInv().contains(is)){
				ig.getInv().remove(is);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        ig.getInv().setItem(number, is);
			}else{
				ig.getInv().setItem(number, is);
			}
			}
		}
		
			for(int i = 1;i< morelores.size();i++){
				int number = random().nextInt(morelores.size());
				if(i == number){
				if(is.getItemMeta().getLore() != morelores.get(i)){
				setLore(morelores.get(i));
			}else{
				setLore(morelores.get(i));
			}
				}
			}
			for(int i = 1 ; i <list.size();i++){
				int number = random().nextInt(list.size());
				if(i == number){
					is.getItemMeta().setDisplayName(list.get(i));
				}
			}
			for(int i = 1; i < items.size();i++){
				int number = random().nextInt(listtochange().size());
				if(i == number){
					is.setType(items.get(i));
				}
			}
		
		
	}

	@Override
	public List<String> getNames() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public List<Material> listtochange() {
		// TODO Auto-generated method stub
		return items;
	}
  
  
	

}
