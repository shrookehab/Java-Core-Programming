class Test{
	public static void main(String args[]){
		String s1 = "high"; 
		String s2 = "low232432423"; 
		String longer = StringUtils.betterString(s1, s2, (str1, str2) -> str1.length() > str2.length()); 
		System.out.println("The longer is : " + longer);
		//String first = "high"; 
	}
	
}