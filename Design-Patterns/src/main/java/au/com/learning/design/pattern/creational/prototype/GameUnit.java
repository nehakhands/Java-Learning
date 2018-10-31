package au.com.learning.design.pattern.creational.prototype;

import java.math.BigDecimal;

public abstract class GameUnit implements Cloneable{

	private BigDecimal position;
	private String str;
	
	public GameUnit() {
		position = BigDecimal.ONE;
		str = "Initialized";
	}

	public BigDecimal getPosition() {
		return position;
	}

	public String getStr() {
		return str;
	}
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		GameUnit unit =  (GameUnit) super.clone();
		unit.initialize();
		return unit;
	}
	
	protected void initialize() {
		this.position = BigDecimal.ZERO;
		this.str = "reset";
		reset();
	}


	public abstract void reset() ;
}
