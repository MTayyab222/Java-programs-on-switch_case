import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char opt;
        int num1,num2,result=0;
        System.out.println("Enter the first number:");
        num1=s.nextInt();
        System.out.println("Enter the second number:");
        num2=s.nextInt();
        System.out.println("Enter the operator: ");
        opt=s.next().charAt(0);
        switch (opt){
            case '+':
                result=num1+num2;
                System.out.println("The addition is: "+result);
            break;
            case '-':
                result=num1-num2;
                System.out.println("The subtraction is: "+result);
            break;
            case '*':
                result=num1*num2;
                System.out.println("The product is: "+result);
            break;
            case '/':
                result=num1/num2;
                System.out.println("The division is: "+result);
                break;
            default:
                System.out.println("Invalid operator: ");
        }
    }
}
