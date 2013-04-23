package de.jfranz.homepage.models;

public class ActivatableLink extends Link {

	private Boolean active;

	public ActivatableLink(String href, String name) {
		super(href, name);
	}

	public ActivatableLink(String href, String name, Boolean active) {
		super(href, name);
		this.active = active;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActivatableLink other = (ActivatableLink) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ActivatableLink [active=" + active + ", getName()=" + getName()
				+ ", getHref()=" + getHref() + "]";
	}
}
