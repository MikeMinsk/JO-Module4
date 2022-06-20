package by.mikem.jonline.module4.aggregation.task05.entity;

public class Tour {
	private static int toursCount = 0;
	private int tourNumber;
	private TourType tourType;
	private int price;
	private TourTrans tourTrans;
	private TourMeal tourMeal;

	public Tour() {
		this.tourNumber = toursCount;
		toursCount++;
	}

	public Tour(TourType tourType, int price, TourTrans tourTrans, TourMeal tourMeal) {
		this();
		this.tourType = tourType;
		this.price = price;
		this.tourTrans = tourTrans;
		this.tourMeal = tourMeal;
	}

	public int getTourNumber() {
		return tourNumber;
	}

	public void setTourNumber(int tourNumber) {
		this.tourNumber = tourNumber;
	}

	public TourType getTourType() {
		return tourType;
	}

	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TourTrans getTourTrans() {
		return tourTrans;
	}

	public void setTourTrans(TourTrans tourTrans) {
		this.tourTrans = tourTrans;
	}

	public TourMeal getTourMeal() {
		return tourMeal;
	}

	public void setTourMeal(TourMeal tourMeal) {
		this.tourMeal = tourMeal;
	}
	
	

}
