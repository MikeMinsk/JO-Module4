package by.mikem.jonline.module4.aggregation.task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
	private String name;
	private List<Province> provinces;
	private City regionCentre;

	public Region() {
	}

	public Region(String name) {
		this.name = name;
		this.provinces = new ArrayList<Province>();
	}

	public Region(String name, City city) {
		this(name);
		this.regionCentre = city;
	}

	public Region(String name, List<Province> provinces, City city) {
		this.name = name;
		this.provinces = provinces;
		this.regionCentre = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}

	public City getRegionCentre() {
		return regionCentre;
	}

	public void setRegionCentre(City regionCentre) {
		this.regionCentre = regionCentre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, provinces, regionCentre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(name, other.name) && Objects.equals(provinces, other.provinces)
				&& Objects.equals(regionCentre, other.regionCentre);
	}

	@Override
	public String toString() {
		return String.format("Region [name=%s, provinces=%s, regionCentre=%s]", name, provinces, regionCentre);
	}
}
