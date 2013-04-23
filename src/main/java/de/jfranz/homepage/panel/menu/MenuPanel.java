package de.jfranz.homepage.panel.menu;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import de.jfranz.homepage.service.MenuItemService;

public class MenuPanel extends Panel {
	private static final long serialVersionUID = 1L;

	@SpringBean(name = "menuItemService")
	private MenuItemService menuItemService;

	public MenuPanel(String id) {
		super(id);
		setRenderBodyOnly(true);
		add(new ExternalLink("menuCaption", "#", "MenuBar"));
		add(new ListView<MenuItem>("links", menuItemService.getItems()) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<MenuItem> item) {
				MenuItem menuItem = item.getModelObject();
				item.add(appropiateFragment(menuItem));
			}
		});
	}

	private Fragment appropiateFragment(MenuItem item) {
		return item.getSections() == null ? new LinkFragment(item,
				MenuPanel.this) : new DropdownFragment(item, MenuPanel.this);
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(new MenuResourceReference()));
	}

	public MenuItemService getMenuItemService() {
		return menuItemService;
	}

	public void setMenuItemService(MenuItemService menuItemService) {
		this.menuItemService = menuItemService;
	}
}
