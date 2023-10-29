import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String input = scanner.nextLine();
        String tokens[] = input.split("");
        if (tokens.length !=3){
            System.out.println("Неправильный формат ввода");
            return;
        }
        double num1 = Double.parseDouble(tokens[0]);
        char operator = tokens[1].charAt(0);
        double num2 = Double.parseDouble(tokens[2]);
        if (num1<1 || num1>10 || num2<1 || num2>10){
            System.out.println("Ошибка");
            return;
        }
        double result =0;
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
        }
        System.out.println(result);
    }
}