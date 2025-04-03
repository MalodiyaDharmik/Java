import java.util.*;
public class palindromicPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
         if (n>m){
            System.out.println(" invalid input");
         }
        for(int i=n;i<=m;i++){
            for(int j=1;j<=2*(m-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=n;j--){
                System.out.print(j+" ");
            }
            for(int j=n+1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
