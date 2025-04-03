import java.util.*;
public class selectionshort {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++){

        arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length-1;i++){

        for(int j=i+1;j<arr.length;j++){

            if(arr[i]>arr[j]){
                int a=arr[j];
                arr[j]=arr[i];
                arr[i]=a;
            }
            for(int a=0;a<arr.length;a++){
                System.out.print(arr[a]+" ");
                
        }
        System.out.println();
      }

    }
}
}