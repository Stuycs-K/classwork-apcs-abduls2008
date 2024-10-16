public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
      return(Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(0,5);
    Point p5 = new Point(5,10);
    Point p6 = new Point(5,5);
	Point triangle1 = new Point(0,0);
	Point triangle2 = new Point(5,0);
	Point triangle3 = new Point(2.5, 4.33);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( p6);
    System.out.println( distance(p3,p4));
    System.out.println( Point.distance(p3,p4));
    System.out.println( p3.distanceTo(p4));
	System.out.println( distance(triangle1,triangle2));
    System.out.println( Point.distance(triangle2,triangle3));
    System.out.println( triangle1.distanceTo(triangle3));
    ;
  }
}
