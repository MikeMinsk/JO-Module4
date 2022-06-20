package by.mikem.jonline.module4.aggregation.task03.logic;

import java.util.Arrays;
import java.util.List;

import by.mikem.jonline.module4.aggregation.task03.entity.Province;
import by.mikem.jonline.module4.aggregation.task03.entity.Region;

public class RegionLogic {

	public void addProvince(Region region, Province province) {
		List<Province> provinces = region.getProvinces();
		provinces.add(province);
	}

	public void addProvinces(Region region, Province... provinces) {
		List<Province> currentProvinces = region.getProvinces();

		List<Province> provinciesToAdd = Arrays.asList(provinces);
		currentProvinces.addAll(provinciesToAdd);
	}

	public double calculateRegionArea(Region region) {
		List<Province> provincies = region.getProvinces();
		double regionArea = 0;

		for (Province province : provincies) {
			regionArea += province.getArea();
		}

		return regionArea;
	}
}
