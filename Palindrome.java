import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        int a=0;
        int b=str.length()-1;
        while (a<b){
            if(str.charAt(a)==str.charAt(b)){
                a++;
                b--;
            }
            else{
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Boolean a=isPalindrome(str);
        System.out.println(a);


    }
}
