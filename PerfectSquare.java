import java.util.Scanner;

public class PerfectSquare {
    public static void perfectSquareNumbers(int a,int b){
       System.out.println("Perfect square numbers between "+a +" and "+b +" are");
       for(int i=a;i<=b;i++){
            for (int j=1;j*j<=i;j++){
                if (i==j*j){
                    System.out.println(i);
                }
            }


       }

    }

    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter second number");
        Scanner sc1=new Scanner(System.in);
        int b=sc.nextInt();
        perfectSquareNumbers(a,b);


    }
}
