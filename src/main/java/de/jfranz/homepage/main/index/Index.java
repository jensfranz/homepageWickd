package de.jfranz.homepage.main.index;

import java.util.logging.Logger;

import org.apache.wicket.markup.html.basic.Label;

import de.jfranz.homepage.main.HomePage;

public class Index extends HomePage {
	public Index() {
		org.apache.log4j.Logger.getRootLogger().error("wicket index");
		Logger.getLogger("").info("INDEX ON WICKET!!!");
		add(new Label("label", "Under construction."));
	}
}
