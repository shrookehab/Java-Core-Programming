package packg;
import java.util.function.Function;

public class Example implements Function<Integer, Double>{
	public Double apply(Integer cent){
		return (cent * 1.8) + 32;
	}
}