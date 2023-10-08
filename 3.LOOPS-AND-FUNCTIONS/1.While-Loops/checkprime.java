//   A PRIME NO. IS THE ONE WHICH HAS EXACTLY TWO FACTORS, WHICH MEANS IT CAN BE DIVIDED BY ONLY 1 AND THE NUMBER ITSELF ...... BUT 1 IS NOT A PRIME NUMBER


import java.util.Scanner;
public class checkprime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2;
        while(d <= n-1){
            if(n%d == 0){
                System.out.println("N is not prime");
            } else{System.out.println("Not prime");};

        }
        
        
    }

    
}
