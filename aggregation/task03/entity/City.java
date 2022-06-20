package by.mikem.jonline.module4.aggregation.task03.entity;

import java.util.Objects;

public class City {
	private String name;

	public City() {
	}

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return String.format("City [name=%s]", name);
	}
}
