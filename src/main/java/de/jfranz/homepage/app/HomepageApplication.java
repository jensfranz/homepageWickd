package de.jfranz.homepage.app;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import de.jfranz.homepage.page.index.Index;

public class HomepageApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return Index.class;
	}

	public static HomepageApplication get() {
		return (HomepageApplication) WebApplication.get();
	}

	@Override
	protected void init() {
		super.init();
		// remove thread monitoring from resource watcher
		this.getResourceSettings().setResourcePollFrequency(null);
		getComponentInstantiationListeners().add(
				new SpringComponentInjector(this));

		// getMarkupSettings().setStripWicketTags(true);
	}

}
