package mvc;

import java.util.ArrayList;
import java.util.List;

public class DrawingModel {

	private List<Shape> shapes = new ArrayList<>();

	public void add(Shape p) {
		shapes.add(p);
	}

	public void remove(Shape p) {
		shapes.remove(p);
	}

	public List<Shape> getPoints() {
		return shapes;
	}

}
