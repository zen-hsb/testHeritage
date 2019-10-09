package fr.gtm.heritage;

public class ColorPoint extends Point {
	String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

}
