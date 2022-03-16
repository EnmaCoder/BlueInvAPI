package org.at.blueinvapi;

import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public interface AnimationItem{
	
	List<Material> listtochange();
	
	String getNameItem();
	
	List<String> getLores();
	
	List<String> getNames();
	
	List<Integer> getSlots();
	
	Random random();
	

}
