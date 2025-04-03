
import java.util.*;
public class patten {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
       
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++){
                System.out.print("$");
               
            }
            for(int b=2;b<=i;b++){
                System.out.print("$");
            }
            System.out.println();
        }
         
    }
}
