
import java.util.Arrays;  
import java.util.List;  
import java.util.ArrayList;  
import java.util.Map;  
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
  

class Test{
	public static void main(String args[]){
		String[] words = {"apple", "arrow", "Azure", "2rr", ".exe", "Guava", "event", "thrill",
					"quack","responsible","afraid","moor","arch","harass","tame","worry","powerful","highfalutin",
					"normal","boorish","celery","closed","burly","superficial","fairies","writer","scary","repeat",
					"mouth","adjustment","foot","physical","squeamish","whine","reduce","fascinated","substantial",
					"whole","wrong","toothsome","deeply","best","fresh","lush","quartz","tart"};
		
		List<String> listWords = Arrays.asList(words);
		
		Iterator<String> it = listWords.iterator();
		Map<Character, List<String>> dictionary = new HashMap<Character, List<String>>();
		
		while(it.hasNext()){
			String temp = it.next();
			if(dictionary.containsKey(temp.charAt(0)))
				dictionary.get(temp.charAt(0)).add(temp);
			else
				dictionary.put(temp.charAt(0), new ArrayList<String>(Arrays.asList(temp)));
		}
		
		dictionary.forEach((k, v) -> Collections.sort(v));
		
		dictionary.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		
		System.out.println("===============================================");
		
		//Character c = 'a';
		Iterator<Map.Entry<Character, List<String>>> it1 = dictionary.entrySet().iterator();
        
        while (it1.hasNext()) {
			Map.Entry<Character, List<String>> entry = it1.next();
			if(entry.getKey() == 'a')
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
	}
}