
class ExceptionHandling{
	public static void main(String args[]){
		WrongInput in = new WrongInput();
		try{
			double num = in.division(1, 0);
			double num2 = in.mul(1, 1);
			System.out.println(num);
			System.out.println(num2);
		}catch(WrongRange r){
			System.out.println(r.msg);
		}
;

		
		
	}
}