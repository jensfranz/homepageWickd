package de.jfranz.homepage.page.index;

import org.apache.wicket.markup.html.basic.Label;

import de.jfranz.homepage.page.base.HomePage;
import de.jfranz.homepage.panel.carousel.CarouselPanel;

public class Index extends HomePage {
	public Index() {
		add(new Label("label", "Under construction."));
		add(new CarouselPanel("carousel"));
	}
}
