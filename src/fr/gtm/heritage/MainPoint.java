package fr.gtm.heritage;

public class MainPoint {

	public static void main(String[] args) {
		Point pt = new Point(2, 4);
		Point pt8 = new Point(3, 3);
		System.out.println(pt);
		System.out.println(pt8);
		Point3D pt2 = new Point3D(5, 4, 7);
		Point3D pt6 = new Point3D(8, 1, 4);
		Point3D pt7 = new Point3D(9, 2, 6);
		System.out.println(pt2);
		System.out.println(pt6);
		System.out.println(pt7);
		ColorPoint pt3 = new ColorPoint(4, 5, "rouge mer");
		ColorPoint pt4 = new ColorPoint(2, 6, "brun ciel");
		ColorPoint pt5 = new ColorPoint(8, 8, "jaune fushia");
		System.out.println(pt3);
		System.out.println(pt4);
		System.out.println(pt5);
	}

}
