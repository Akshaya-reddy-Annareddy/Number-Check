import java.util.*;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num <0){
            System.out.println("Number is negative");
        }else if(num > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is zero");
        }

    }
}




