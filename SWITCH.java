import java .util.Scanner;
import java.math.*;
public class SWITCH {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char str;
        System.out.println("Enter the character: ");
        str=s.next().charAt(0);
        switch (str){
            case 'M':
            case 'm':
                System.out.println("the gender is male:  ");
                break;
                case 'F':
                case 'f' :
                System.out.println("The gender is female: ");
                break;
            default:
                System.out.println("Invalid output:");
        }

          






    }
}
