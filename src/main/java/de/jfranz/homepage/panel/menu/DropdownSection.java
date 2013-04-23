package de.jfranz.homepage.panel.menu;

import java.util.List;

import de.jfranz.homepage.models.Link;

public class DropdownSection {
	private final String sectionName;
	private final List<Link> links;

	public DropdownSection(String sectionName, List<Link> links) {
		super();
		this.sectionName = sectionName;
		this.links = links;
	}

	@Override
	public String toString() {
		return "DropdownSection [sectionName=" + sectionName + ", links="
				+ links + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result
				+ ((sectionName == null) ? 0 : sectionName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DropdownSection other = (DropdownSection) obj;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (sectionName == null) {
			if (other.sectionName != null)
				return false;
		} else if (!sectionName.equals(other.sectionName))
			return false;
		return true;
	}

	public String getSectionName() {
		return sectionName;
	}

	public List<Link> getLinks() {
		return links;
	}
}
