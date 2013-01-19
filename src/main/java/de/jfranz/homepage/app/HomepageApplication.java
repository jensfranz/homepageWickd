package de.jfranz.homepage.app;

import java.util.logging.Logger;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import de.jfranz.homepage.main.index.Index;

public class HomepageApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return Index.class;
	}

	@Override
	protected void init() {
		super.init();
		Logger.getLogger("").info("WICKET INIT!!!");
		org.apache.log4j.Logger.getRootLogger().error("WICKET INIT!!!");
		// remove thread monitoring from resource watcher
		this.getResourceSettings().setResourcePollFrequency(null);
	}
}
