import java.util.Arrays;

public class Sem2HM {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 3, 67, 9, 0, 2, 0, 0};
        getEvenCountTask1(arr);
        System.out.println("max value - min value = " + getDifferenceTask2(arr));
        System.out.println(hasAdjacentZerosTask3(arr));
    }

    // Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    static void getEvenCountTask1(int[] array) {
        System.out.println(Arrays.toString(array) + " -> " + Arrays.stream(array).filter(i -> i % 2 == 0).count());
    }

    // Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива
    static int getDifferenceTask2(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return Arrays.stream(array).max().getAsInt() - Arrays.stream(array).min().getAsInt();
    }

    // Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    static boolean hasAdjacentZerosTask3(int[] array) {
        if (array.length < 2) {
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;

//        return IntStream.range(0, array.length - 1)
//                .anyMatch(i -> array[i] == 0 && array[i + 1] == 0);
    }


}
