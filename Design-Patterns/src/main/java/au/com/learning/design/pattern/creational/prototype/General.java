package au.com.learning.design.pattern.creational.prototype;

public class General extends GameUnit {

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public void reset() {
		throw new UnsupportedOperationException("Clone Not Supported");
		
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("Clone Not Supported");
	}

}
