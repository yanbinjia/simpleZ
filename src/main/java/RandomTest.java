import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Map<String, Integer> count = new HashMap<String, Integer>();

		Map<String, Integer> keyChanceMap = new HashMap<String, Integer>();
		keyChanceMap.put("a", 10);
		keyChanceMap.put("b", 70);
		keyChanceMap.put("c", 20);

		for (int i = 0; i < 100000; i++) {
			String item = doSelect(keyChanceMap);
			if (count.containsKey(item)) {
				count.put(item, count.get(item) + 1);
			} else {
				count.put(item, 1);
			}
		}

		for (String id : count.keySet()) {
			System.out.println(id + "\t出现了 " + count.get(id) + " 次");
		}
		
		System.out.println(count);
	}

	public static String doSelect(Map<String, Integer> keyChanceMap) {
		if (keyChanceMap == null || keyChanceMap.size() == 0)
			return null;

		Integer sum = 0;
		for (Integer value : keyChanceMap.values()) {
			sum += value;
		}
		// 从1开始
		Integer rand = new Random().nextInt(sum) + 1;

		for (Map.Entry<String, Integer> entry : keyChanceMap.entrySet()) {
			rand = rand - entry.getValue();
			// 选中
			if (rand <= 0) {
				String item = entry.getKey();
				return item;
			}
		}

		return null;
	}
}