package de.jfranz.homepage.models;

public class Link {
	private final String href;
	private final String name;

	public Link(String href, String name) {
		super();
		this.href = href;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getHref() {
		return href;
	}

	@Override
	public String toString() {
		return "Link [href=" + href + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((href == null) ? 0 : href.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Link other = (Link) obj;
		if (href == null) {
			if (other.href != null)
				return false;
		} else if (!href.equals(other.href))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
