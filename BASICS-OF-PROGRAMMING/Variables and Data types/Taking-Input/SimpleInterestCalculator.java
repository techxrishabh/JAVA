//========= How to take input directly form the user ===================

import java.util.Scanner;

public class SimpleInterestCalculator{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

// By using nextInt() method ============== we can take the input directly from user  ================       ===============     ==================== ===============   ==

        int p = s.nextInt();
        int r = s.nextInt();
        int t = s.nextInt();

        // if we have to take long input from the user we can use nextLong() method ==========

        long l = s.nextLong();

        // if we have to take double input from the user we can use nextDouble() method ==========

        double d = s.nextDouble();

        // if we have to take float input from the user we can use .nextFloat() method ==========

        float f = s.nextFloat();

        // if we have to take string as a input from the user we can use .nextFloat() method ==========

        String str = s.nextLine();


        int si = (p * r * t)/100;

        System.out.println(si);

    }

}
