public class towerofHanoy {int i=0;
    public static void main(String[] args) {
       
        tower("1","2","3",3,0);
       
    }
    
   public static void tower(String S, String H, String D,int n,int c){
   
    if (n==0) {
        //System.out.println("transfer disk from"+S+"to"+D );
        return;
    }
    tower(S,D,H,n-1,c);
    count(0);
    System.out.println("transfer disk from"+S+"to"+D+"c is");
    tower(H,S,D,n-1,c);
  
    }
    public static void count (int i){
        System.out.println(i);
        i++;
    }
    
}
