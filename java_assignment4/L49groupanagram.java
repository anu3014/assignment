package Package1;
import java.util.*;
class L49groupanagram{
	 public List<List<String>> groupAnagrams(String[] strs) {
	        HashMap<String, List<String>> map = new HashMap<>();

	        for (String s : strs) {
	            char[] arr = s.toCharArray();
	            Arrays.sort(arr);
	            String key = new String(arr);

	            map.putIfAbsent(key, new ArrayList<>());
	            map.get(key).add(s);
	        }

	        return new ArrayList<>(map.values());
	    }
}