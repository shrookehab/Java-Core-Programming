
@FunctionalInterface
interface CheckString{
	
	boolean CheckLetter(String str);
}

class StringUtils{
	
	public static boolean CheckIsLetter(String str, CheckString cs){
		for(int i = 0; i < str.length(); i++)
			if(!cs.CheckLetter(Character.isLetter(str.charAt(i)))
				return false;
		
		return true;
	}
}