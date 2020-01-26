
public class Line {
	private Point start;
	private Point stop;
	
	public Line(int x1 ,int y1,int x2,int y2) {
		this.start = new Point(x1,y1);
		this.stop = new Point(x2,y2);
	}
	public double getcalculate() {
		double cl  = Math.pow(start.getX()-stop.getX(), 2);
			   cl+=Math.pow(start.getY()-stop.getY(), 2);
			   cl  = Math.sqrt(cl);
		return cl;
	}
	
	
	
	
	
	

}
