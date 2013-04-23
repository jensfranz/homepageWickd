package de.jfranz.homepage.panel.menu;

import java.util.List;

public interface MenuItem {
	public String getName();

	public String getHref();

	public List<DropdownSection> getSections();
}
