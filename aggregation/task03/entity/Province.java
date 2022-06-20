package by.mikem.jonline.module4.aggregation.task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Province {
	private String name;
	private List<City> cities;
	private double area;
	private City provinceCentre;

	public Province() {
	}

	public Province(String name, double area) {
		this.name = name;
		this.cities = new ArrayList<City>();
		this.area = area;
	}

	public Province(String name, double area, City city) {
		this(name, area);
		this.provinceCentre = city;
	}

	public Province(String name, List<City> cities, double area) {
		this.name = name;
		this.cities = cities;
		this.area = area;
	}

	public Province(String name, List<City> cities, double area, City city) {
		this(name, area, city);
		this.cities = cities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public City getProvinceCentre() {
		return provinceCentre;
	}

	public void setProvinceCentre(City provinceCentre) {
		this.provinceCentre = provinceCentre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, cities, name, provinceCentre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Province other = (Province) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(cities, other.cities) && Objects.equals(name, other.name)
				&& Objects.equals(provinceCentre, other.provinceCentre);
	}

	@Override
	public String toString() {
		return String.format("Province [name=%s, cities=%s, area=%s, provinceCentre=%s]", name, cities, area,
				provinceCentre);
	}
}
