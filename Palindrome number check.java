import java.util.Scanner;
public class Array {
   public static void main(String[] args) {
        //int obj1 = new Array
       int num,r,s=0,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        num = sc.nextInt();
       t = num;
        while(t>0){
            r = t%10;
            s = (s*10)+r;
            t = t/10;
        }
   if(s==num)
       System.out.println("It is a Palindrome number");
   else
       System.out.println("Not a Palindrome number");


        }
}
