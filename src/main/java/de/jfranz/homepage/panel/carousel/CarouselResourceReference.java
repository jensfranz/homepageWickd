package de.jfranz.homepage.panel.carousel;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import de.jfranz.homepage.bootstrap.BootstrapLocationDummy;

public class CarouselResourceReference extends CssResourceReference {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3699665954195397396L;

	public CarouselResourceReference() {
		super(CarouselPanel.class, "carousel.css");
	}

	@Override
	public Iterable<? extends HeaderItem> getDependencies() {
		List<HeaderItem> dependencies = new ArrayList<HeaderItem>();

		dependencies.add(JavaScriptHeaderItem
				.forReference(new JavaScriptResourceReference(
						BootstrapLocationDummy.class, "js/jquery.js")));
		dependencies.add(JavaScriptHeaderItem
				.forReference(new JavaScriptResourceReference(
						BootstrapLocationDummy.class, "js/bootstrap.min.js")));

		dependencies.add(CssHeaderItem.forReference(new CssResourceReference(
				BootstrapLocationDummy.class, "css/bootstrap.css")));
		dependencies.add(CssHeaderItem.forReference(new CssResourceReference(
				BootstrapLocationDummy.class, "css/bootstrap-responsive.css")));

		return dependencies;
	}
}
