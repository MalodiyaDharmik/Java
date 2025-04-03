public class insertionshort {
    public static void main(String[] args) {
        int arr[]={8,7,4,6,15};

        for (int i=1;i<arr.length;i++){
            int current=arr[i];
            
            for (int j=i-1;j>=0 &&current<arr[j];j--){
                arr[j+1]=arr[j];
                arr[j]=current;
               
               
                for(int a=0;a<arr.length;a++){
                    System.out.print(arr[a]+" ");
                }
                System.out.println("");
            }
           
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
