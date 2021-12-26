
public class WrongInput{
	public double division(int num1, int num2) throws WrongRange{
		if(num2 == 0)
			throw new WrongRange(num2);
		return num1 / num2;
	}
	
	public double mul(int num1, int num2) throws WrongRange{
		if(num2 == 0 || num1 == 0)
			throw new WrongRange(num2);
		return num1 * num2;
	}
	
}