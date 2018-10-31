package au.com.learning.design.pattern.creational.prototype;

public class Client {

	public static void main(String[] args) {
		Swordsman s1 = new Swordsman();
		s1.attack();
		System.out.println(s1);
		try {
			Swordsman s2 = (Swordsman) s1.clone();
			System.out.println(s2);
			System.out.println(s1);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}
