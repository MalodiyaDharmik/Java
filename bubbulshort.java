
import java.util.*;
public class bubbulshort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }
       

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){

                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
                for(int a=0;a<arr.length;a++){
                    System.out.print(arr[a]+" ");
                    
            }
            System.out.println();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
