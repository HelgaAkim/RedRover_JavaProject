public class HW_3 {

    public static void main(String[] args) {

//        Задача №1
//
//        Необходимо создать две целочисленные переменные (a, b),
//        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//        a == b - если переменные равны
//        a < b - если переменная a меньше b
//        a > b - если переменная b меньше a

        int a = 7;
        int b = 7;

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }

        System.out.println();

//        Задача №2
//
//        Необходимо создать две целочисленные переменные (a, b),
//        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//        maybe a and b are even - если сумма переменных четная
//        some variable is odd - если сумма переменных нечетная

        int a1 = 3;
        int b1 = 7;

        if ((a1 + b1) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        System.out.println();

//        Задача №3
//
//        Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
//        больше 10 - если переменная больше 10
//        меньше 100 - если переменная меньше 100
//        результат деления на 2 больше 20 - если это соответствует истине
//        значение переменной между 5 и 40 включительно - если это правда
//        значение переменной меньше 5 или больше 40 - если предыдущее условие ложное

        int a2 = 312;

        if (a2 > 10) {
            System.out.println("больше 10");
        }
        if (a2 < 100) {
            System.out.println("меньше 100");
        }
        if (a2 * 1.0 / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (a2 >= 5 && a2 <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }


    }

}
