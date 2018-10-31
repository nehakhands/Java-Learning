package au.com.learning.design.pattern.creational.prototype;

public class Swordsman extends GameUnit {

	private String state = "idle";
	
	public void attack() {
		this.state = "attacking";
	}
	@Override
	public void reset() {
		state = "idle";
	}
	
	@Override
	public String toString() {
		return "state=" + this.state + " position=" + this.getPosition() + " str=" +getStr();
	}

}
