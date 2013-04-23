package de.jfranz.homepage.panel.carousel;

import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import de.jfranz.homepage.models.Link;

public class CarouselPanel extends Panel {
	private static final long serialVersionUID = 1L;

	@SpringBean(name = "carouselItemList")
	private List<CarouselItem> carouselItemList;

	public CarouselPanel(String id) {
		super(id);
		setRenderBodyOnly(true);
		ListView<CarouselItem> lv = new ListView<CarouselItem>("items",
				getCarouselItemList()) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -1127268313876802567L;

			protected void populateItem(ListItem<CarouselItem> item) {
				CarouselItem carouselItem = item.getModelObject();
				if (isFirstItem(carouselItem)) {
					item.add(new AttributeModifier("class", "item active"));
				}
				item.add(new Label("itemHead", carouselItem.getItemHeader()) {

					private static final long serialVersionUID = -1536859688280705221L;

				});
				item.add(new Label("itemDesc", carouselItem.getItemDesc()) {

					/**
					 * 
					 */
					private static final long serialVersionUID = 185244829927616112L;
				});
				item.add(new Image("itemImg", carouselItem.getItemImg()));
				Link itemLink = carouselItem.getItemLink();
				ExternalLink externalLink;
				if (itemLink == null) {
					externalLink = new ExternalLink("itemLink", "#");
					externalLink.setVisible(false);
				} else {
					externalLink = new ExternalLink("itemLink",
							itemLink.getHref(), itemLink.getName());
				}
				item.add(externalLink);
			}

			private boolean isFirstItem(CarouselItem item) {
				return getModelObject() != null
						&& getModelObject().get(0) != null
						&& item.equals(getModelObject().get(0));
			}
		};
		add(lv);

	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem
				.forReference(new CarouselResourceReference()));
	}

	public List<CarouselItem> getCarouselItemList() {
		return carouselItemList;
	}

	public void setCarouselItemList(List<CarouselItem> carouselItemList) {
		this.carouselItemList = carouselItemList;
	}
}
