public class HW_4_1 {

    public static void main(String[] args) {

//        Необходимо вывести числа от 0 до 15.

        for (int i = 0; i <= 15; i = i + 1) {
            System.out.println(i);
        }

        System.out.println();
//        Необходимо вывести все положительные степени числа 5,
//        которые меньше 10000, вывести результат возведения в степень.

        for (int i = 5; i < 10000; i = i * 5) {
            System.out.println(i);
        }

        System.out.println();
//        Необходимо вывести все числа кратные 4
//        между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности
//        (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 40; i <= 60; i = i + 4) {
                System.out.println(i);
        }

    }
}
