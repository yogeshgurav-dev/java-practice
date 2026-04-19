import java.util.Scanner;
class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to Reverse : ");
        int num = sc.nextInt();
        
        int[] arr = new int[10];
        int i=0;
        while(num!= 0){
            arr[i] = num%10;
            num =num /10;
            i++;
        }
        System.out.print("The Reverse  number is : ");
        for(int j =0; j<i;j++){
            System.out.print(arr[j] );
            sc.close();
        }
        }

    }    


