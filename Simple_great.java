import java.util.Scanner;
public class Simple_great {
public static void main(String []args){
    //user is supposed to enter the number then the program should decide which number is the greatest.
    Scanner s = new Scanner(System.in);
    int num1,num2,ans=0;
    char opt;
    do {
        System.out.println("Enter the operator: ");
        opt = s.next().charAt(0);
        if (opt == '+' || opt == '-' || opt == '/' || opt == '*') {
            System.out.println("enter the operands: ");
            num1 = s.nextInt();
            num2 = s.nextInt();
            if (opt == '+') {
                ans = num1 + num2;
                System.out.println("The result is " + ans);
            } else if (opt == '-') {
                ans = num1 - num2;
                System.out.println("The result is " + ans);
            } else if (opt == '*') {
                ans = num1 * num2;
                System.out.println("The result is " + ans);
            } else if (opt == '/') {
                ans = num1 / num2;
                System.out.println("The result is " + ans);
            }
        }
    }while (opt!='x');

}
}
