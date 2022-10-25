import java.util.Scanner;

public class Temperature {
    public static float conversion(float fahrenheit){
        System.out.println("Temperature in fahrenheit"+fahrenheit);
        float celsius=((fahrenheit-32)*5)/9;
        System.out.println("Temperature in Celsius..");
        return celsius;


    }
    public static void main(String[] args) {
        System.out.println("Enter temperature in fahrenheit");
        Scanner sc=new Scanner(System.in);
        float fahrenheit=sc.nextFloat();
        System.out.println(conversion(fahrenheit));
    }
}
