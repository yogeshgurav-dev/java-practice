public class returnmethod {
    static int myMethod(int x){
        return 5 + x;
    } 
    static int myMethod(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod(3, 4));
    }
}