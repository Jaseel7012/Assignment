import java.util.Scanner;
public class Fibonacci {
    public static int recurs(int num){
        if (num<=1){
            return num;
        }
        else {
            int res=recurs(num-2)+recurs(num-1);
            return res;
        }
    }
    public static void main(String[] args) {
        //fibonacci
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num<0){
            System.out.println("please enter positive number");
        }
        else {
            System.out.println("Fibonacci series of "+num );
            for (int i=0;i<=num;i++){
                if(i==num){
                    break;
                }
                System.out.print(recurs(i)+",");
            }
        }
    }
}
