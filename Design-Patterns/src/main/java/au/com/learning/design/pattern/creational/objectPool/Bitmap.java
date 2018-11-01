package au.com.learning.design.pattern.creational.objectPool;

import java.awt.geom.Point2D;

public class Bitmap implements Image {

	private Point2D location;
	private String name;
	
	
	public Bitmap(String name) {
		super();
		this.name = name;
	}
	@Override
	public void draw() {
		System.out.println("Drawing name=" + name + " at location=" + location);
	}
	@Override
	public Point2D getLocation() {
		return location;
	}
	@Override
	public void setLocation(Point2D point) {
		location = point;		
	}
	@Override
	public void reset() {
		location = null;
		System.out.println("Bitmap is reset");
	}
	
	
}
