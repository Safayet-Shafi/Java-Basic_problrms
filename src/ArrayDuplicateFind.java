import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateFind {
    public void findDuplicateElement(){
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                  System.out.println(arr[j]);
            }
        }
    }

    public void findDuplicateElement1() {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3,2};

        // Create a map to store elements and their frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and update frequencies in the map
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        // Print duplicate elements
        System.out.println("Duplicate elements in the array are:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("Element " + key + " occurs " + frequencyMap.get(key) + " times");
        }
    }
}
