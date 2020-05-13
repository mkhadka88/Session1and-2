import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapAPI {

	public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(101, "Mahesh");
	map.put(102,"Sona");
	map.put(103, "Sarad");
	map.put(104, "Arpan");
	System.out.println(map);
	
	map.put(103, "Ram");
	System.out.println(map);
	map.put(null, "Spmeone");
	System.out.println(map);
	map.put(null, "null");
	System.out.println(map);
	
	String s = map.get(104);
	System.out.println(s);
	System.out.println(map.size());
	System.out.println(map.containsKey(101));
	System.out.println(map.remove(102));
	
	Set<Integer> keys = map.keySet();
	
	System.out.println(keys);
	Iterator<Integer> eRef = keys.iterator();
	while(eRef.hasNext()) {
		Integer key = eRef.next();
		String value = map.get(key);
		System.out.println(key+ "  "+value);
	}

}
}
