import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("0. Exit Session 1. Find square root 2. Factorial");
            int option = sc.nextInt();
            Calculator cal = new Calculator("my_calc");
            switch (option) {
                case 0:
                    System.out.println("Bye");
                    flag = false;
                    break;
                case 1:
                    System.out.println("Enter number");
                    double x = sc.nextDouble();
                    System.out.println(cal.sqrt_f(x));
                    break;
                case 2:
                    System.out.println("Enter a number");
                    int fact = sc.nextInt();
                    System.out.println(cal.factorial(fact));
                    break;
                default:
                    System.out.println("Sorry wrong option");
            }
        }
    }

}
