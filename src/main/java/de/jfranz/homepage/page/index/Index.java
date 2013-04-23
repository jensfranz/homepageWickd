package de.jfranz.homepage.page.index;

import de.jfranz.homepage.page.base.BasePage;
import de.jfranz.homepage.panel.carousel.CarouselPanel;
import de.jfranz.homepage.panel.menu.MenuPanel;

public class Index extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Index() {
		add(new MenuPanel("menu"));
		add(new CarouselPanel("carousel"));
	}
}
