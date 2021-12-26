class Test{
	public static void main(String args[]){
		String s1 = "high"; 
		String s2 = "low232432423"; 
		//boolean isLet = StringUtils.CheckIsLetter(s1, (str) -> str.CheckIsLetter(str)); 
		
		CheckString isLet = (str) ->{
						for(int i = 0; i < str.length(); i++)
							if(!Character.isLetter(str.charAt(i)))
								return false;
						
						return true;
						};
						
		if(isLet.CheckLetter(s1))
			System.out.println("the string contains only Letters"); 
		else
			System.out.println("The String contain numbers too"); 
		 		
	}
	
	// public static boolean CheckIsLetter(String str, CheckString cs){
		// for(int i = 0; i < str.length(); i++)
			// if(!cs.CheckLetter(str.charAt(i)))
				// return false;
		
		// return true;
	// }
}