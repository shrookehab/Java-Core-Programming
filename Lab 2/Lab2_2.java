import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;

class StringProblem{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word : ");
		String word = input.nextLine();

		System.out.print("Please enter a word : ");
		String sentenc = input.nextLine();
		System.out.println();
		
		int count = substringIndexOf(sentenc, word);
		System.out.println("The count of the word from Method 1 = " + count);
		System.out.println();
		
		int count1 = substringSplit(sentenc, word);
		System.out.println("The count of the word from Method 2 = " + count1);
		System.out.println();
		
		int count2 = countStringTokenizer(sentenc, word);
		System.out.println("The count of the word from Method 3 = " + count2);
		System.out.println();
		
		int count3 = countRegex(sentenc, word);
		System.out.println("The count of the word from Method 4 = " + count3);
		System.out.println();
		
	}
	
	static int substringIndexOf(String sentenc, String word){
		int occur = 0, count = 0, wordLength = word.length();
		while((occur = sentenc.indexOf(word, occur)) != -1){
			occur += wordLength;
			count++;
		}
		return count;
	}
	
	static int substringSplit(String sentenc, String word){
		String arr[] = sentenc.split(" ");
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(word.equals(arr[i]))
				count++;
		}
		return count;
	}
	
	static int countStringTokenizer(String sentenc, String word){
		StringTokenizer strToken = new StringTokenizer(sentenc, " ");
		
		int count = 0;
		while(strToken.hasMoreTokens())
		{
			if(word.equals(strToken.nextToken()))
				count++;
		}
		return count;
	}
	
	static int countRegex(String sentenc, String word){
		Pattern pattern = Pattern.compile("\\w" + word);
		Matcher matcher = pattern.matcher(sentenc);

		int count = 0;
		while(matcher.find())
			count++;
		
		return count;
	}
}