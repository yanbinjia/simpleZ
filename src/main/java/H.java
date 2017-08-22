


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;


public class H {

	public static String get(Map<String, Integer> map) {
		//积分和
		List<String> k = new ArrayList<String>();
		List<Integer> list = new ArrayList<>();
		int total = 0;
		for(Entry<String, Integer> entry : map.entrySet()) {
			k.add(entry.getKey());
			total = total + entry.getValue();
			list.add(total);
		}
		
		Random random = new Random();
		int r = random.nextInt(total);
		for(int i=0;i<list.size();i++) {
			int step = list.get(i);
			if(r<=step) {
				return k.get(i);
			}
		}
		return "-1";
	}
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 100);
		map.put("b", 100);
		map.put("c", 800);

		Map<String, Integer> k = new HashMap<String, Integer>();
		k.put("a", 0);
		k.put("b", 0);
		k.put("c", 0);
		
		for(int i=0;i<1000;i++) {
			String a = get(map);
			k.put(a, k.get(a)+1);
		}
		System.out.println(k);
	}
}
