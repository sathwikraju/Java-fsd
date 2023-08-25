package Collections;
import java.util.*;

public class CollectionVerification {
	public static void main(String[] args) {
	        // ArrayList
		List<String> arrayList = new ArrayList<>();
	        arrayList.add("Cricket");
	        arrayList.add("Hockey");
	        arrayList.add("Badminton");
	        System.out.println("ArrayList: " + arrayList);

	        // Vector
	        List<Integer> vector = new Vector<>();
	        vector.add(10);
	        vector.add(20);
	        vector.add(30);
	        System.out.println("Vector: " + vector);

	        // HashSet
	        Set<Integer> hashSet = new HashSet<>();
	        hashSet.add(10);
	        hashSet.add(20);
	        hashSet.add(30);
	        System.out.println("HashSet: " + hashSet);

	        // LinkedHashSet
	        Set<String> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add("Ram");
	        linkedHashSet.add("Sita");
	        linkedHashSet.add("Laxman");
	        System.out.println("LinkedHashSet: " + linkedHashSet);

	        // LinkedList
	        List<String> linkedList = new LinkedList<>();
	        linkedList.add("Vanila");
	        linkedList.add("Butterscotch");
	        linkedList.add("Chocolate");
	        System.out.println("LinkedList: " + linkedList);

	        // HashMap
	        Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("John", 22);
	        hashMap.put("Blessy", 18);
	        hashMap.put("Michael", 35);
	        System.out.println("HashMap: " + hashMap);
	    }
	}
