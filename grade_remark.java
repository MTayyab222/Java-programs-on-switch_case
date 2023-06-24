import java.util.Scanner;
public class grade_remark {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char grade;
        System.out.println("Enter the grade obtained: ");
        grade=s.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent performance: ");
            break;
            case 'B':
                System.out.println("Good performance: ");
            break;
            case 'C':
                System.out.println("Need to focus: ");
                break;
            case 'D':
                System.out.println("Disappointing: ");
            default:
                System.out.println("No remarks: ");
        }
    }
}
