package de.jfranz.homepage.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import de.jfranz.homepage.dao.MenuItemsDAO;
import de.jfranz.homepage.panel.menu.MenuItem;

@Service("menuItemService")
public class MenuItemServiceImpl implements MenuItemService {

	@Resource(name = "menuItemsDao")
	private MenuItemsDAO menuItemsDAO;

	@Override
	public List<MenuItem> getItems() {
		return menuItemsDAO.getItems();
	}

	public MenuItemsDAO getMenuItemsDAO() {
		return menuItemsDAO;
	}

	public void setMenuItemsDAO(MenuItemsDAO menuItemsDAO) {
		this.menuItemsDAO = menuItemsDAO;
	}

}
