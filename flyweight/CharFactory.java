package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {
	private static Map<Character,DocCharacter> cache = new HashMap<>();
	
	public static DocCharacter createChar(Character letter) {
		if(cache.containsKey(letter)) {
			return cache.get(letter);
		}else {
			DocCharacter docChar = new DocCharacter(0,"Arial", letter);
			cache.put(letter, docChar);
			return docChar;
		}
	}
}
