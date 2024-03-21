import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String countingSheep(int num) {
        //Add your code here
        String a = " sheep...";
        String b = "";
        for (int i = 1; i <= num; i++) {
            b += i + a;
        }
        return "" + b;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println(countingSheep(4));
        System.out.println();

        System.out.println("Hello and welcome!");

        int[][] arr = {{4, 5},{6, 7, 8, 9},{1, 2, 3}};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j > i; j--) {
                System.out.println("j = " + j);
                System.out.println("длина внутренних массивов по очереди: " + arr[i].length);
                count += arr[i].length;
                System.out.println("длина всех внутренних массивов: " + count);
            }
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

            System.out.println("i = " + i);
            System.out.println("длина внешнего массива: " + arr.length);
            System.out.println();
        }
        int count1 = Stream.of(arr).mapToInt(m -> m.length).sum();
        System.out.println(count1);
    }
}