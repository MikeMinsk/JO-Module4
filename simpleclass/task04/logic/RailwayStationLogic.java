package by.mikem.jonline.module4.simpleclass.task04.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.simpleclass.task04.entity.RailwayStation;
import by.mikem.jonline.module4.simpleclass.task04.entity.Train;

public class RailwayStationLogic {
	
	public void sortTrainsByNumber(RailwayStation unsortedTrains) {
		List<Train> sortedTrains = new ArrayList<Train>();
		List<Train> unSortedTrains = unsortedTrains.getTrains();

		while (unSortedTrains.size() != 0) {
			int tempTrainNumber = Integer.MAX_VALUE;			
			Train tempTrain = null;

			for (Train train : unSortedTrains) {
				if (train.getTrainNumber() <= tempTrainNumber) {
					tempTrainNumber = train.getTrainNumber();
					tempTrain = train;
				}
			}

			sortedTrains.add(tempTrain); // добавляем в сортированную станцию поезд
			unSortedTrains.remove(tempTrain); // удаляем найденный поезд из станции
		}

		unsortedTrains.setTrains(sortedTrains);
	}

	public void sortTrainsByDestinationAndTime(RailwayStation unsortedTrains) {
		List<Train> sortedTrains = new ArrayList<Train>();
		List<Train> trainsToSort = unsortedTrains.getTrains();

		while (trainsToSort.size() != 0) {
			Train tempTrain = trainsToSort.get(0);

			for (Train train : trainsToSort) {
				if (train.compareTo(tempTrain) < 0) {
					tempTrain = train;
				}
			}

			sortedTrains.add(tempTrain); // добавляем в сортированную станцию поезд
			trainsToSort.remove(tempTrain); // удаляем найденный поезд из станции
		}

		unsortedTrains.setTrains(sortedTrains);
	}

	public Train searchTrain(RailwayStation railwayStation, int trainNumber) {
		List<Train> trains = railwayStation.getTrains();

		for (Train train : trains) {
			if (train.getTrainNumber() == trainNumber) {
				return train;
			}
		}		
		return new Train();
	}
}
