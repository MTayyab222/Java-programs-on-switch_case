import java.util.Scanner;
public class Even_odd_testing {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int num;
        System.out.println("Enter the number :");
        num=s.nextInt();
        switch (num%2){
            case 0:
                System.out.println("Even");
            break;
            case 1:
                System.out.println("Odd");
            break;
            default:
                System.out.println("Invalid output:");
        }
    }
}
