import packg.Example;
import packg.Example2;

class Test{
	public static void main(String args[]){
		Example ex = new Example();
		System.out.println("Degree in F = " + ex.apply(100));
		System.out.println("=========================================\n");
		
		Example2 ex1 = new Example2();
		Double arr[] = new Double[3];
		arr[0] = 1.0;
		arr[1] = 7.0;
		arr[2] = 12.0;
		Double out[] = new Double[3];
		out = ex1.apply(arr);
		
		System.out.println("Equation Result = " + out[0]);
		System.out.println("Equation Result = " + out[1]);
	}
}
