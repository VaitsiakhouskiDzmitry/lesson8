import java.util.InputMismatchException;
import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 5;
   //     getUserInput(scanner, 1, 5);
        createArray(scanner);
    }

    private static int getUserInput(Scanner scanner, int min, int max) {
        Scanner s= new Scanner(System.in);
        System.out.println("введите число от " + min +"до" + max);
        int result;
        try {
            result = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("вы ввели не число");
            return getUserInput(s, min, max);        }
        if (result < min || result > max) {
            System.out.println("число не от" + min +"до" + max);
            return getUserInput(s, min, max);
        }
        return result;
    }
    private static int[] createArray(Scanner scanner){
        System.out.println("введите длину");
        int length = scanner.nextInt();
        int[] array = new int[length];
        if(length==0||length>10){
            System.out.println("длина должна быть от 1 до 10");
            array = createArray(scanner);

        }
        System.out.println("последний элемент =" + array[length-1]);
        return array;
    }
}
