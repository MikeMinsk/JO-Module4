package by.mikem.jonline.module4.aggregation.task03.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.aggregation.task03.entity.City;
import by.mikem.jonline.module4.aggregation.task03.entity.Province;

public class ProvinceLogic {

	public void addCity(Province province, City city) {
		List<City> cities = province.getCities();
		cities.add(city);
	}

	public List<City> addCities(Province province, String string) {
		List<City> cities = province.getCities();

		cities.addAll(convertStringsToCities(splitString(string)));

		return cities;
	}

	private String[] splitString(String string) {
		return string.split(", ");
	}

	private List<City> convertStringsToCities(String[] strings) {
		List<City> cities = new ArrayList<City>();

		for (String string : strings) {
			cities.add(new City(string));
		}

		return cities;
	}
}
