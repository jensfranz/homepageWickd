package de.jfranz.homepage.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import de.jfranz.homepage.panel.menu.MenuItem;

@Repository("menuItemsDao")
public class MemoryMenuItemsDAO implements MenuItemsDAO {

	@Resource(name = "menuItemList")
	private List<MenuItem> items;

	@Override
	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
}
