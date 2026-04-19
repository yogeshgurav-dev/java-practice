public class methodifelse {
    public static void checkAge(int age){
        if(age <18 && age <0){
            System.out.println("Access denied - You are not old enought!");
        }else{
            System.out.println("Acess Granted - You are old enough!");
        }

    }
    public static void main(String[] args) {
        // checkAge(20);
        // checkAge(2);
        checkAge(-20);
    }
}
