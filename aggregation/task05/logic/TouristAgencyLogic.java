package by.mikem.jonline.module4.aggregation.task05.logic;

import by.mikem.jonline.module4.aggregation.task05.entity.TouristAgency;

public class TouristAgencyLogic {
	
	public TouristAgency createTouristAgency(int tourAmount) {
		TourLogic tourLogic = new TourLogic();
		
		
		for(int i = 0; i < tourAmount; i++) {
			tourLogic.createTour();
		}
		return null;
	}

}
