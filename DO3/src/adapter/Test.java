package adapter;

public class Test {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		Boat boat = new Boat();
		BoatAdapter boatAdapter = new BoatAdapter(boat);

		car.goFaster();
		plane.goFaster();
		train.goFaster();
		boatAdapter.goFaster();

	}

}
