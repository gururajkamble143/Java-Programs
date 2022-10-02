import java.util.Scanner;

public class Switch {
    public static void main(String[] args) 
    {
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the character = ");
        ch=obj.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("it is a vowel");
            break;

            default:
            System.out.println("is is a consonent");
        }
        
    }
}
