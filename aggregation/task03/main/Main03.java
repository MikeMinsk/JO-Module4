package by.mikem.jonline.module4.aggregation.task03.main;

import by.mikem.jonline.module4.aggregation.task03.entity.City;
import by.mikem.jonline.module4.aggregation.task03.entity.Province;
import by.mikem.jonline.module4.aggregation.task03.entity.Region;
import by.mikem.jonline.module4.aggregation.task03.entity.State;
import by.mikem.jonline.module4.aggregation.task03.logic.RegionLogic;
import by.mikem.jonline.module4.aggregation.task03.logic.StateLogic;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
столицу, количество областей, площадь, областные центры.*/

public class Main03 {

	public static void main(String[] args) {
		StateLogic stateLogic = new StateLogic();
		RegionLogic regionLogic = new RegionLogic();

		City minsk = new City("Минск");

		State state = new State("Республика Беларусь", minsk);

		City gomel = new City("Гомель");

		Region region1 = new Region("Гомельская", gomel);

		Province province1 = new Province("Гомельский", 1951.1, gomel);
		Province province2 = new Province("Речицкий", 2713.1, new City("Речица"));
		Province province3 = new Province("Жлобинский", 1951.1, new City("Жлобин"));
		Province province4 = new Province("Добруш", 1452.2, new City("Добруш"));

		regionLogic.addProvinces(region1, province1, province2, province3, province4);

		City grodno = new City("Гродно");

		Region region2 = new Region("Гродненская", grodno);

		Province province5 = new Province("Гродненский", 2594.4, grodno);
		Province province6 = new Province("Сморгонский", 1490.1, new City("Сморгонь"));
		Province province7 = new Province("Лидский", 1566.7, new City("Лида"));
		Province province8 = new Province("Щучинщина", 1911.7, new City("Щучинск"));

		regionLogic.addProvinces(region2, province5, province6, province7, province8);

		Region region3 = new Region("Минская", minsk);

		Province province9 = new Province("Минский", 1902.4, minsk);
		Province province10 = new Province("Солигорский", 2498.1, new City("Солигорск"));
		Province province11 = new Province("Борисовский", 2987.7, new City("Борисов"));
		Province province12 = new Province("Крупский", 2138.7, new City("Крупки"));

		regionLogic.addProvinces(region3, province9, province10, province11, province12);

		stateLogic.addRegion(state, region1);
		stateLogic.addRegion(state, region2);
		stateLogic.addRegion(state, region3);

		printCapital(state);
		printRegionsAmount(stateLogic.defineRegionsAmount(state));
		prinTotalArea(stateLogic.calculateStateArea(state));
		prinRegionsCentres(state);
	}

	private static void printCapital(State state) {
		String stateName = state.getName();
		String capitalName = state.getCapital().getName();

		System.out.printf("Столица государства %s - %s.\n", stateName, capitalName);
	}

	private static void printRegionsAmount(int regionsAmount) {
		System.out.printf("Количество областей в государстве - %d.\n", regionsAmount);
	}

	private static void prinTotalArea(double area) {
		System.out.printf("Общая площадь государства, кв.км. - %f.\n", area);
	}

	private static void prinRegionsCentres(State state) {
		for (Region region : state.getRegions()) {
			String regionName = region.getName();
			String cityName = region.getRegionCentre().getName();

			System.out.printf("Центр %s области - город %s.\n", regionName, cityName);
		}
	}
}
