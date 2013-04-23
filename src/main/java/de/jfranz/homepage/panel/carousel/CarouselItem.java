package de.jfranz.homepage.panel.carousel;

import org.apache.wicket.request.resource.ResourceReference;

import de.jfranz.homepage.models.Link;

public class CarouselItem {

	private final String itemHeader;
	private final String itemDesc;
	private final ResourceReference itemImg;
	private final Link itemLink;

	public CarouselItem(String itemHeader, String itemDesc,
			ResourceReference itemImg, Link itemLink) {
		super();
		this.itemHeader = itemHeader;
		this.itemDesc = itemDesc;
		this.itemImg = itemImg;
		this.itemLink = itemLink;
	}

	public String getItemHeader() {
		return itemHeader;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public ResourceReference getItemImg() {
		return itemImg;
	}

	public Link getItemLink() {
		return itemLink;
	}

	@Override
	public String toString() {
		return "CarouselItem [itemHeader=" + itemHeader + ", itemDesc="
				+ itemDesc + ", itemImg=" + itemImg + ", itemLink=" + itemLink
				+ "]";
	}
}
