package de.jfranz.homepage.app;

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
		// remove thread monitoring from resource watcher
		this.getResourceSettings().setResourcePollFrequency(null);
	}
}
