package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {
	DrawingModel model = new DrawingModel();

	public void setModel(DrawingModel model) {
		this.model = model;
	}

	public void paint(Graphics g) {
		Iterator<Shape> it = model.getPoints().iterator();
		while (it.hasNext()) {
			it.next().draw(g);
		}
	}

}