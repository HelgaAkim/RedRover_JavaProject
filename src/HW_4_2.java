import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_4_2 {

    public static void main(String[] args) {

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Hello!");
        System.out.println();

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array1.length; i = i + 1) {
            if (array1[i] > 5) {
                System.out.println(array1[i]);
            }
        }

        System.out.println();
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array2.length; i = i + 1) {
            array2[i] = array2[i] + 15;
            System.out.println(array2[i]);
        }
        System.out.println(Arrays.toString(array2));

    }
}
