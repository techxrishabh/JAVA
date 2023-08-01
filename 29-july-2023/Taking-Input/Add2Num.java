// By using scanner ============== we can take the input from user by using the console to process further ================

import java.util.Scanner;
public class Add2Num{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}