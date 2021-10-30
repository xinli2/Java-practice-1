import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Drill01 {
	
	/* -------- Arrays -------- */
	
	/*
	 * Return the item at the index specified by the 
	 * parameter 'index'. Only do this if 'index' exists
	 * in your array. i.e. first check to make sure the
	 * array is big enough to contain such an index. If
	 * the array does not contain this index, return -1.
	 */
	static int getElementAtIndex(int index, int[] array) {
		// TODO: Implement the getElementAtIndex method
		if (index<array.length){
			for(int i = 0; i < array.length; i++) {
				if (array[index] == array[i]) {
					return array[i];
				}
			}
		}
		return -1;
	}
	
	/*
	 * Return the sum of all the values in the given array.
	 */
	static int sumValues(int[] array) {
		// TODO: Implement the sumValues method
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			}
		return sum;
	}
	
	/*
	 * Return a new array that doubles every element in the 
	 * given array.
	 */
	static int[] doubleElements(int[] array) {
		// TODO: Implement the doubleElements method
		ArrayList<Integer> doubled = new ArrayList<Integer>();
		for(int i =0; i < array.length; i++) {
			doubled.add(2*array[i]);
		}
		int[] newArray = new int[doubled.size()];
		for(int i =0; i<doubled.size(); i++) {
			newArray[i] = doubled.get(i);
		}
		return newArray;
	}
		
	
	
	/* -------- Lists -------- */
	
	/*
	 * Return the item at the index specified by the 
	 * parameter 'index'. Only do this if 'index' exists
	 * in your list. i.e. first check to make sure the
	 * list is big enough to contain such an index. If
	 * the list does not contain this index, return -1.
	 */
	static int getElementAtIndex(int index, List<Integer> list) {
		// TODO: Implement the getElementAtIndex method
		if(index < list.size()) {
			for(int i = 0; i < list.size(); i++) {
				if (list.get(index) == list.get(i)) {
					return list.get(i);
				}
			}
		}
		return -1;
	}
	
	/*
	 * Return the sum of all the values in the given list.
	 */
	static int sumValues(List<Integer> list) {
		// TODO: Implement the sumValues method
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum = sum+list.get(i);
			}
		return sum;
	}
	
	/*
	 * Return a new list that doubles every element in the 
	 * given list.
	 */
	static List<Integer> doubleElements(List<Integer> list) {
		// TODO: Implement the doubleElements method
		ArrayList<Integer> doubled = new ArrayList<Integer>();
		for(int i =0; i < list.size(); i++) {
			doubled.add(2*list.get(i));
		}
		return doubled;
	}

	/* -------- Sets -------- */
	
	/*
	 * Return whether the given set contains the given value.
	 */
	static boolean setContains(Set<Integer> set, int val) {
		// TODO: Implement the setContains method
		for(int value: set) {
			if (val == value) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Return a new set containing the intersection 
	 * (common elements) of the given sets.
	 */
	static Set<Integer> setIntersection(Set<Integer> set1, Set<Integer> set2) {
		// TODO: Implement the setIntersection method
		HashSet<Integer> newHashSet = new HashSet<Integer>(set1);
		newHashSet.retainAll(set2);
		return newHashSet;
	}
	
	/*  -------- HashMaps -------- */
	
	/*
	 * Given a string, return a map with each character as 
	 * a key and the number of times that character appears 
	 * in the string as the value.
	 */
	static Map<Character, Integer> characterCount(String s) {
		// TODO: Implement the characterCount method

		HashMap<Character, Integer> Map =  new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if(Map.get(key)==null) {
				Map.put(s.charAt(i),1);
			}else
				Map.put(s.charAt(i),Map.get(key)+1);
			}
		return Map;
	}
	
	/*
	 * Given a mapping of cities to their population, return the city
	 * with the largest population. If the given map is empty, return 
	 * an empty string.
	 */
	static String largestPopulation(Map<String, Integer> cities) {
		// TODO: Implement the largestPopulation method
		int maxPopulation = 0;
		String city = "";
		for(String i : cities.keySet()) {	
			if(i==null) {
				return "";
			}else if( cities.get(i) > maxPopulation) {
			 
				maxPopulation = cities.get(i);
				city = i;
				}
		}
		return city;
	}
}



