package au.com.learning.design.pattern.creational.abstractFactory;

public class S3Storage implements Storage {

	public S3Storage(int capacity) {
		System.out.println("Allocated size of " + capacity + " on S3 Cloud Storage");
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "S3";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "S3 Cloud Storage";
	}
	
	

}
