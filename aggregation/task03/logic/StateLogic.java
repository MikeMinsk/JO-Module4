package by.mikem.jonline.module4.aggregation.task03.logic;

import java.util.List;

import by.mikem.jonline.module4.aggregation.task03.entity.Region;
import by.mikem.jonline.module4.aggregation.task03.entity.State;

public class StateLogic {
	public void addRegion(State state, Region region) {
		List<Region> regions = state.getRegions();
		regions.add(region);
	}

	public int defineRegionsAmount(State state) {
		return state.getRegions().size();
	}	
	
	public double calculateStateArea(State state) {
		List<Region> regions = state.getRegions();
		double stateArea = 0;
		RegionLogic regionLogic = new RegionLogic();
		
		for(Region region : regions) {
			stateArea += regionLogic.calculateRegionArea(region);
		}
		
		return stateArea;
	}	
}
