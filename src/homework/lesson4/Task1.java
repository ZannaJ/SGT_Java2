package homework.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers, symbols or text: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        String digit = "";
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
            boolean flag = Character.isDigit(charArray[i]) || charArray[i] == '-';
            if (flag)
                digit = digit + charArray[i];
            digit = digit.replaceFirst("^0*", "");
        }

        {
            if (!digit.matches(".*\\d.*")) {
                return 0;
            }
            if (Long.parseLong(digit) > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (Long.parseLong(digit) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (Long.parseLong(digit) < (2 ^ 31) || Long.parseLong(digit) > (-2 ^ 31)) {
                return Integer.parseInt(digit);
            }
        }
        return 0;
    }
}