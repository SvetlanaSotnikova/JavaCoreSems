import java.util.Arrays;

public class Sem2 {
    public static void main(String[] args) {
//        BigDecimal a = BigDecimal.valueOf(9999999);
//
//        Scanner scanner = new Scanner(System.in);
//        BigDecimal b = scanner.nextBigDecimal();
//
//        System.out.println(b.multiply(a));
        /////////////////////
//        int size = 5;
//        int[][] matrix = new int[size][size];
//        for (int i = 0; i < size; i++) {
//            matrix[i][i] = 1;
//            matrix[i][size - i - 1] = 1;
//        }
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
        ////////////////////////
        int[] array = new int[]{2, 5, 7, 2, 5, 7, 3};
        int[] result = addValueIndex(array, 9, 1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    public static int[] addValueIndex(int[] oldArray, int number, int index) {
        if (index < 0 || index > oldArray.length) {
            throw new IllegalArgumentException("fefefe");
        }
        int[] newArray = new int[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[index] = number;
        System.arraycopy(oldArray, index, newArray, index + 1, oldArray.length - index);
        return newArray;
    }

    public static int[] addLast(int[] oldArray, int number) {
        return addValueIndex(oldArray, number, oldArray.length);
    }

    public static int[] insert(int[] oldArray, int index, int number) {
        if (index < 0 || index > oldArray.length) {
            throw new IllegalArgumentException("fefefe");
        }

        if (index == oldArray.length) {
            return addLast(oldArray, number);
        }

        int[] newArray = new int[oldArray.length + 1];
        int tmp = 0;

        for (int i = 0; i < oldArray.length + 1; i++) {
            if (i == index) {
                newArray[i] = number;
                tmp++;
            } else
                newArray[i] = oldArray[i - tmp];
        }
        return newArray;
    }
}
