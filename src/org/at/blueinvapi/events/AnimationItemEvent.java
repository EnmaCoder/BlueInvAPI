package org.at.blueinvapi.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.at.blueinvapi.AnimationItem;
import org.bukkit.Material;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AnimationItemEvent extends Event implements AnimationItem{

	private List<Material> list = new ArrayList<>();
	private String getNameItem;
	private List<String> getLores;
	private List<String> getNames;
	private List<Integer> getSlots;
	public AnimationItemEvent(List<Material> list,String getNameItem,List<String> getLores,List<Integer> getSlots,List<String> names){
		this.list = list;
		this.getNameItem = getNameItem;
		this.getLores = getLores;
		this.getSlots = getSlots;
		this.getNames = names;
	}
	static HandlerList hl = new HandlerList();
	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return hl;
	}

	@Override
	public List<Material> listtochange() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public String getNameItem() {
		// TODO Auto-generated method stub
		return getNameItem;
	}

	@Override
	public List<String> getLores() {
		// TODO Auto-generated method stub
		return getLores;
	}

	@Override
	public List<String> getNames() {
		// TODO Auto-generated method stub
		return getNames;
	}

	@Override
	public List<Integer> getSlots() {
		// TODO Auto-generated method stub
		return getSlots;
	}

	@Override
	public Random random() {
		// TODO Auto-generated method stub
		return new Random();
	}

}
