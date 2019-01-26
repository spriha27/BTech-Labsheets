public class Circle {
	
		private Point center;
		private double radius;
		
		public Circle(){
			center= new Point(0,0);
			radius=1.0;
		}
		public Circle(Point p, double d){
			center = p;
			radius = d;
		}
		public Circle(int x, int y, double d){
			center = new Point(x,y);
			radius = d;
		}
		public Point getCenter(){
			return center;
		}
		public int getCenterX(){
			return center.getX();
		}
		public void setCenterX(int n){
			return center.setX(n);
		}
		public int getCenterY(){
			return center.getY();
		}
		public void setCenterY(int n){
			return center.setY(n);
		}
		public Point setCenter(){
			return center;
		}
		public double getRadius(){
			return radius;
		}
		public double setRadius(double d){
			this.radius=d;
		}
		public int[] getCenterXY(){
			return center.getXY();
		}
		public void setCenterXY(int a){
			center.setXY(a,b);
		}
		public double getArea(){
			return Math.PI*radius*radius;
		}
		/*public double diameter(){
			return 2*radius;
		}
		public double getDistance(Circle c){
			return center.distance(c.center);
		
		}*/
		
}
