import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Sem2Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 7, 2, 5, 7, 3, 7, 7, 5};
        System.out.println(Arrays.toString(sortArray(array)));
    }


    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("E " + entry.getKey() + " repeats " + entry.getValue());
            }
        }
        System.out.println(map.toString());

        return array;
    }
}
