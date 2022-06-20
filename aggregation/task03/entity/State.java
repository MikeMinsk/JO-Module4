package by.mikem.jonline.module4.aggregation.task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
	private String name;
	private List<Region> regions;
	private City capital;

	public State() {
	}

	public State(String name) {
		this.regions = new ArrayList<Region>();
		this.name = name;
	}

	public State(String name, City city) {
		this(name);
		this.capital = city;
	}

	public State(String name, List<Region> regions) {
		this.name = name;
		this.regions = regions;
	}

	public State(String name, List<Region> regions, City city) {
		this(name, regions);
		this.capital = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, name, regions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(name, other.name)
				&& Objects.equals(regions, other.regions);
	}

	@Override
	public String toString() {
		return String.format("State [name=%s, regions=%s, capital=%s]", name, regions, capital);
	}
}
