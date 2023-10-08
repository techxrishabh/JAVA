// print 1 to N ==============


import java.util.Scanner;
public class while_loop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // this is what we need to do after we get the value of N

        // int i = 1;

        // system.out.println(i);

        // i = i + 1;

        // for doing this while loops came in to the picture

        // and we need to repeat this while (i <= n)
        int i = 1;


        while(i <= N) {
            System.out.println(i);
            i = i + 1;
        }   

    }
    
}
