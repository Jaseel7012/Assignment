import java.util.Scanner;

public class Triangle {
    public static void triangleNum(int user_inp){
        int k=1;
        for (int i=0;i<user_inp;i++){
            for(int j=0;j<=i;j++){

                System.out.print(k);

            }
            System.out.println();
            k++;
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int user_inp=sc.nextInt();
        triangleNum(user_inp);
    }
}
