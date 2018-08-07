package gui_int;

public class JoannSClass {
	
	private int ugh;
	private int boo;
	private int shoes;
	private int ball;
	
	public int getUgh() {
		return ugh;
	}
	
	
	public void setUgh(int ugh) {
		
		if(ugh < 0)
		{
			ugh = 0;
			
		}
		this.ugh = ugh;
	}
	public int getBoo() {
		return boo;
	}
	public void setBoo(int boo) {
		this.boo = boo;
	}
	public int getShoes() {
		return shoes;
	}
	public void setShoes(int shoes) {
		this.shoes = shoes;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	
	

}
