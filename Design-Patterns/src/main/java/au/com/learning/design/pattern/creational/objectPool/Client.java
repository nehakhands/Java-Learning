package au.com.learning.design.pattern.creational.objectPool;

import java.awt.Point;

public class Client {

	private static final ObjectPool<Bitmap> pool = new ObjectPool<>(()->new Bitmap("Logo.bmp"), 5);
	public static void main(String[] args) {
		Bitmap b1 = pool.get();
		b1.setLocation(new Point(10, 10));
		
		Bitmap b2 = pool.get();
		b2.setLocation(new Point(-10, 0));
		
		b1.draw();
		b2.draw();
		
		pool.release(b1);
		pool.release(b2);
		
	}

}
