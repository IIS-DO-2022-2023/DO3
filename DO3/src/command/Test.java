package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.RED);
		DrawingModel model = new DrawingModel();

		AddPointCmd addPointCmd = new AddPointCmd(model, p1);
		addPointCmd.execute();

		System.out.println(model.getPoints().size());

		addPointCmd.unexecute();

		System.out.println(model.getPoints().size());

		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);

		System.out.println(p1);

		updatePointCmd.execute();

		System.out.println(p1);

		updatePointCmd.unexecute();

		System.out.println(p1);

	}

}
