import java.util.stream.Stream;

public class HW_6_1 {

    public static void main(String[] args) {

//        Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'о') {
                System.out.print(c);
            }
        }

        System.out.println();
        System.out.println();
//        Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

        String s1 = "Перевыборы выбранного президента";

        char ch = 'е';
        int count = s1.length() - s1.replace(String.valueOf(ch), "").length();
        System.out.println("Подсчитать количество букв “е” в строке: " + count);
        System.out.println();

//        Задача №3
//
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] arr = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

//        подсчет длины всех вложенных массивов в двумерном массиве:
//        int countt = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j > i; j--) {
//                System.out.println("j = " + j);
//                System.out.println("длина внутренних массивов по очереди: " + arr[i].length);
//                countt += arr[i].length;
//                System.out.println("длина всех внутренних массивов: " + countt);
//            }
//        }

        char ch1 = 'е';

        int count1 = Stream.of(arr).mapToInt(m -> m.length).sum();
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count2 += arr[i][j].length() - arr[i][j].replace(String.valueOf(ch1), "").length();
//                System.out.print("j = " + j);
//                System.out.println(" + count2: " + count2);
            }
//            System.out.println("i = " + i);
        }

        System.out.println("Подсчитать количество строк в массиве, которые не содержат буквы “е”: " + (count1 - count2));
        System.out.println();

//          Экстра задача
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.


    }
}
