package de.jfranz.homepage.panel.menu;

import java.util.List;

public class Dropdown implements MenuItem {
	private final String name;
	private final List<DropdownSection> sections;

	public Dropdown(String name, List<DropdownSection> sections) {
		super();
		this.name = name;
		this.sections = sections;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((sections == null) ? 0 : sections.hashCode());
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
		Dropdown other = (Dropdown) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sections == null) {
			if (other.sections != null)
				return false;
		} else if (!sections.equals(other.sections))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dropdown [name=" + name + ", sections=" + sections + "]";
	}

	public String getName() {
		return name;
	}

	public List<DropdownSection> getSections() {
		return sections;
	}

	@Override
	public String getHref() {
		return "#";
	}
}
