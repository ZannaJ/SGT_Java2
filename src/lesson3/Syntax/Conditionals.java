package lesson3.Syntax;

public class Conditionals {
    public static void main(String[] args) {
        String myName = "Zanna";
        if( myName == "Zanna") {
            System.out.println("Yes indeed!");
        } else {
            System.out.println("Nope, it is not");
        }

        String whatIsMyname = myName == "Zanna" ? "It is Zanna" : "It is not Zanna";
        System.out.println(whatIsMyname);

        whatIsMyname = myName == "Natalja" ? "It is Zanna" : "It is not Zanna";
        System.out.println(whatIsMyname);

        System.out.println(oddOrEven1(7));
        System.out.println(oddOrEven2(7));

    }

    /*
    Write an App that decides whether a number is odd or even
     */
    static public String oddOrEven1(int number){
        if(number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    /**
     * oddOrEven2 should utilize shorthand conditional notation
     * @param number
     * @return
     */
    static public String oddOrEven2(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}