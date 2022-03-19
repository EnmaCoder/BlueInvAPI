package org.at.blueinvapi.util;

import java.util.HashMap;

import org.at.blueinvapi.InventoryGUI;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public class ActionPutter extends HashMap<ItemStack,ActionItem>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ItemStack is;
	private InventoryGUI ig;
	private ClickType clicktype;
	
	static HashMap<ItemStack,ClickType> setter = new HashMap<>();
	static HashMap<ClickType,ActionItem> putter = new HashMap<>();
	static HashMap<InventoryGUI,CloseAction> applier = new HashMap<>();
	
	public void putAction(ActionItem ai){
		this.put(is, ai);
	}
	public void putClickType(ClickType ct){
		setter.put(is, ct);
	}
	public void setClickType(ActionItem ai){
		putter.put(clicktype, ai);
	}
	public void setItemStack(ItemStack is){
		this.is = is;
	}
	public void setInventoryGUI(InventoryGUI ig){
		this.ig = ig;
	}
	public void putCloseAction(CloseAction ca){
		applier.put(ig, ca);
	}
	public void putATwithCT(ActionItem ai){
		putter.put(setter.get(is), ai);
	}
    public ActionItem fromClickType(ClickType ct){
    	return putter.get(ct);
    }
    public ClickType fromItemStack(ItemStack is){
    	return setter.get(is);
    }
    public ActionItem fromIS(ItemStack is){
    	return putter.get(setter.get(is));
    }
    public CloseAction fromInventoryGUI(InventoryGUI ig){
    	return applier.get(ig);
    }
    
	
	
	
	
	
	
	

}
