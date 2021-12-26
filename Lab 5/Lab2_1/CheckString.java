@FunctionalInterface
interface CheckString{
	
	boolean CheckStr(String str1, String str2);
}

class StringUtils{
	
	public static String betterString(String str1, String str2, CheckString cs){
		if(cs.CheckStr(str1, str2))
			return str1;
		else
			return str2;
	}
}