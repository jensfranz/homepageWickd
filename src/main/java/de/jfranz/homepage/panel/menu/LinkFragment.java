package de.jfranz.homepage.panel.menu;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.panel.Fragment;

class LinkFragment extends Fragment {
	private static final long serialVersionUID = 1L;

	private static final String ID = "content";
	private static final String FRAGMENT_ID = "linkFragment";

	public LinkFragment(MenuItem link, WebMarkupContainer markupProvider) {
		super(ID, FRAGMENT_ID, markupProvider);
		setRenderBodyOnly(true);
		add(new ExternalLink("link", link.getHref(), link.getName()));
	}
}