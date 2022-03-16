package org.at.blueinvapi.util;

import java.util.HashMap;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public class ActionPutter extends HashMap<ItemStack,ActionItem>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ItemStack is;
	private ClickType clicktype;
	
	static HashMap<ItemStack,ClickType> setter = new HashMap<>();
	static HashMap<ClickType,ActionItem> putter = new HashMap<>();
	
	public void putAction(ActionItem ai){
		this.put(is, ai);
	}
	public void putClickType(ClickType ct){
		setter.put(is, ct);
	}
	public void setClickType(ActionItem ai){
		putter.put(clicktype, ai);
	}
	
	
	
	
	
	
	
	
	

}
