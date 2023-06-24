import java .util.Scanner;
public class Vowel_testing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char letter;

            System.out.println("Enter the character");
            letter = s.next().charAt(0);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                        case 'O':
                        case 'o':
                            case 'U':
                    case 'u':
                        System.out.println("Vowel:");
                        break;
                    default:
                        System.out.println("consonant:");
                }}
            else {
                System.out.println("This is not a alphabet:");
            }



        }
    }
