import java.util.Scanner;

public class Vowels {
    public static void charTypeMethod(char type){
        switch (type){
            case 'a' :
                System.out.println("a is vowel ");
                break;
            case 'e':
                System.out.println("e is vowel ");
                break;
            case 'i':
                System.out.println("i is vowel ");
                break;
            case 'o':
                System.out.println("o is vowel ");
                break;
            case 'u':
                System.out.println("u is vowel ");
                break;
            case 'A':
                System.out.println("A is vowel ");
                break;
            case 'E':
                System.out.println("E is vowel ");
                break;
            case 'I':
                System.out.println("I is vowel ");
                break;
            case 'O':
                System.out.println("O is vowel ");
                break;
            case 'U':
                System.out.println("U is vowel ");
                break;

            default:
                System.out.println(type +" is consonant");
        }
    }
    public static void main(String[] args) {
    System.out.println("Enter a letter,between a and z");
        Scanner sc=new Scanner(System.in);
        char type=sc.next().charAt(0);
        charTypeMethod(type);
    }
}
