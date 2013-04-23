package de.jfranz.homepage.panel.menu;

import java.util.List;

import de.jfranz.homepage.models.ActivatableLink;

public class MenuLink extends ActivatableLink implements MenuItem {

	public MenuLink(String href, String name, Boolean active) {
		super(href, name, active);
	}

	public MenuLink(String href, String name) {
		super(href, name);
	}

	@Override
	public List<DropdownSection> getSections() {
		return null;
	}
}
