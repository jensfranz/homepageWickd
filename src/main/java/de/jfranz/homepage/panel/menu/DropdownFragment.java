package de.jfranz.homepage.panel.menu;

import org.apache.wicket.MarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Fragment;

import de.jfranz.homepage.models.Link;

class DropdownFragment extends Fragment {
	private static final long serialVersionUID = 1L;

	private static final String ID = "content";
	private static final String FRAGMENT_ID = "dropdownFragment";

	private boolean isFirst;

	public DropdownFragment(MenuItem menuItem, MarkupContainer markupProvider) {
		super(ID, FRAGMENT_ID, markupProvider);
		setRenderBodyOnly(true); // remove span tags
		isFirst = true;

		add(new ListView<DropdownSection>("dropdownSections",
				menuItem.getSections()) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<DropdownSection> item) {
				DropdownSection section = item.getModelObject();
				Label divider = new Label("divider");
				item.add(divider);
				if (isFirst) {
					// hide section-divider
					divider.setVisible(false);
					isFirst = false;
				}

				item.add(new Label("sectionName", section.getSectionName()));

				item.add(new ListView<Link>("sectionLinks", section.getLinks()) {
					private static final long serialVersionUID = 1L;

					@Override
					protected void populateItem(ListItem<Link> sectionLinkitem) {
						Link sectionLink = sectionLinkitem.getModelObject();
						sectionLinkitem.add(new ExternalLink("sectionLink",
								sectionLink.getHref(), sectionLink.getName()));
					}
				});

			}
		}.setRenderBodyOnly(true));
	}

}
