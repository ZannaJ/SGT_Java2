package homework.lesson4;

public class Task2 {
    public static void main(String[] args) {
        Roman(39);
        Roman(1990);
        Roman(750);
        Roman(29);
        Roman(333);
        Roman(114);
        Roman(3999);
        Roman(52);
    }

    public static void Roman(int num) {

        System.out.println("Integer: " + num);
        int[] digits = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanSymbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<digits.length;i++) {
            while(num >= digits[i]) {
                num -= digits[i];
                roman.append(romanSymbols[i]);
            }
        }
        System.out.println("Number in roman is: " + roman.toString());
    }
}