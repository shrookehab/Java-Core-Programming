
public class WrongRange extends RuntimeException{
	public String msg;
	public WrongRange(int number){
		msg = new String("Wrong Range you can't enter the number = 0 ");
	} 
}