import java.util.Scanner;
class even{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till You want even number :");
        int num = sc.nextInt();
        for(int a=1;a<=num;a++){
         
            if(a %2 ==0){
                System.out.println(a);
            }
        }
        sc.close();
    }
}