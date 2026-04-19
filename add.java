import java.util.Scanner;
public class add{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        sc.close();

        int sum = num1 + num2;
        System.out.println("Sum of these Numbers : "+ sum);

        int a = 10 , b = 20;
        System.out.println("The 1st number is :" +a);
        System.out.println("The 2nd number is :" +b);
        a+=b;
        System.out.println("The sum of 2 Numbers are :"+ a);


    }
}