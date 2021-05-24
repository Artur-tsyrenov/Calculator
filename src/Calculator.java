import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("- Приветствую друг, это Калькулятор 2.0");
        System.out.println("- Принимает на вход римские и арабские цифры от 1 до 10");
        String result = Calculation.ex();
        System.out.println("Ответ: " + result);
    }
}

