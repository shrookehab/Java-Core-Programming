package packg;
import java.util.function.Function;

public class Example2 implements Function<Double [], Double[]>{
	public Double[] apply(Double arr[]){
		Double output[] = new Double[2];
		output[0] = ((-1 * arr[1]) + Math.sqrt(Math.pow(arr[1], 2) - 4 * arr[0] * arr[2])) / 2 * arr[0];
		output[1] = ((-1 * arr[1]) - Math.sqrt(Math.pow(arr[1], 2) - 4 * arr[0] * arr[2])) / 2 * arr[0];
		
		return output;
	}
}