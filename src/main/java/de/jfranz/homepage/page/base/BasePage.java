package de.jfranz.homepage.page.base;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import de.jfranz.homepage.bootstrap.BootstrapLocationDummy;

abstract public class BasePage extends WebPage {

	public BasePage() {
		add(new Label("pageName", getPageName()));
	}

	protected String getPageName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem
				.forReference(new JavaScriptResourceReference(
						BootstrapLocationDummy.class, "js/jquery.js")));
		response.render(JavaScriptHeaderItem
				.forReference(new JavaScriptResourceReference(
						BootstrapLocationDummy.class, "js/bootstrap.min.js")));
		response.render(CssHeaderItem.forReference(new CssResourceReference(
				BootstrapLocationDummy.class, "css/bootstrap.css")));
		response.render(CssHeaderItem.forReference(new CssResourceReference(
				BootstrapLocationDummy.class, "css/bootstrap-responsive.css")));
	}
}
