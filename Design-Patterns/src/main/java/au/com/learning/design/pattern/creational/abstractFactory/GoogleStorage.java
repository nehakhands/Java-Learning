package au.com.learning.design.pattern.creational.abstractFactory;

public class GoogleStorage implements Storage {

	public GoogleStorage(int capacity) {
		System.out.println("Allocated size of " + capacity + " on Google Cloud Storage");
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "GoogleCloudStorage";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Google Cloud Storage";
	}
	

}
