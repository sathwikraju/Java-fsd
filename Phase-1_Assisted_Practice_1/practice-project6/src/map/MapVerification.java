package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapVerification {
    public static void main(String[] args) {
        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("James", 22);
        hashMap.put("Eva", 31);
        hashMap.put("Mahesh", 38);
        
        // Does not guarantee any specific order
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("James", 22);
        linkedHashMap.put("Eva", 31);
        linkedHashMap.put("Mahesh", 38);
        
        // Guarantee insertion order
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("James", 22);
        treeMap.put("Eva", 31);
        treeMap.put("Mahesh", 38);
        
        // It sorts in natural order of the keys 
        System.out.println("TreeMap: " + treeMap);
    }
}
