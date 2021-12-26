import java.util.ArrayList;
import java.util.List;
class Test{
	public static void main(String args[]){
		ArrayList<Circle> list1 = new ArrayList<Circle>();
		list1.add(new Circle());
		
		ArrayList<Rectangle> list2 = new ArrayList<Rectangle>();
		list2.add(new Rectangle());
		
		drawShapes(list1);
		drawShapes(list2);
	}
	
	public static void drawShapes(ArrayList<? extends Shape> list){
		for(Shape s : list)
			s.draw();
		
	}
}