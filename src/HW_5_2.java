import java.util.Arrays;

public class HW_5_2 {

    public static void main(String[] args) {

//        Вывести следующие строки с соответствующим форматированием (как пирамиды):
//        Задача №1 (выравнивание по левому краю)
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

        int a = 10;
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < a; j++) {   //если сравнивать j < i, тогда не нужна будет доп.переменная a
                System.out.print(j + "  ");
            }
            System.out.println();
            a--;
        }

        System.out.println();
        System.out.println();

//        Задача №2 (выравнивание по правому краю)
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

        int b = 10;
        int c = 1;
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < b; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();

            for (int k = 0; k < c; k++) {
                 System.out.print("   ");
            }

            b--;
            c++;
        }

        //решение от Сергея:
//        for (int i = 10; i > 0; i--) {
//            for (int j = 10; j > i; j--) {
//                System.out.print("   ");
//            }
//
//            for (int k = 0; k < i; k++) {
//                System.out.print(k + "  ");
//            }
//        }

        System.out.println();
        System.out.println();

//        Задача №3 (выравнивание по центру)
//
//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//        8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//        6 5 4 3 2 1 0 1 2 3 4 5 6
//        5 4 3 2 1 0 1 2 3 4 5
//        4 3 2 1 0 1 2 3 4
//        3 2 1 0 1 2 3
//        2 1 0 1 2
//        1 0 1
//        0

        int c1 = 1;
        int d = 10;
        int e = 9;

        for (int i = d; i > 0; i--) {  // провести 10 итераций (пока d не станет 0)
            for (int j = e; j >= 0; j--) {  // провести 9 итераций (пока e не станет 0)
                System.out.print(j + "  ");  // распечатать количество итераций j
            }

            for (int k = 1; k < d; k++) {  // провести 10 итераций (пока а не станет 1)
                System.out.print(k + "  ");  // распечатать количество итераций k
            }
            System.out.println();

            for (int l = 0; l < c1; l++) {
                System.out.print("   ");
            }

            c1++;
            d--;
            e--;
        }

    }
}
