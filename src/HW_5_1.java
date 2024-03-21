public class HW_5_1 {

    public static void main(String[] args) {

        //    Задача №1
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести сумму всех значений массива.
//
//    Задача №2
//    необходимо вывести максимальное значение массива.
//
//    Задача №3
//    необходимо вывести минимальное значение массива.

        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum: " + sum);
        System.out.println();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max: " + max);
        System.out.println();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println();

//            Задача №4
//
//    Дан массив:
//    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//    необходимо вывести среднее арифметическое всех значений массива.

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double sum1 = 0;
        int a = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum1 += arr2[i];
            a++;
        }
        double average = sum1 / a;  //результат деления не всегда целое число!!!
        System.out.println("среднее арифметическое: " + average);
        // System.out.println(sum1 / arr2.length);  - позволяет обойтись без лишних переменных
        System.out.println();

//            Задача №5
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//    необходимо вывести сумму элементов массива.

//            Задача №6
//    необходимо вывести максимальное значение массива.

//            Задача №7
//    необходимо вывести количество элементов в массиве.

        int[][] arr3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum2 = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                sum2 += arr3[i][j];
            }
        }

        System.out.println("сумма элементов массива: " + sum2);
        System.out.println();

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j] > max2) {
                    max2 = arr3[i][j];
                }
            }
        }

        System.out.println("максимальное значение массива: " + max2);
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {   //второй цикл можно было заменить выражением: count += arr3[i].length;
                count++;
            }
        }

        System.out.println("количество элементов в массиве: " + count);
    }
}
