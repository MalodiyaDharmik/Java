public class reverseStringRecursion {
    public static String reverse(String a,int idx){
      if (idx==a.length()) {
        return "";
      }
        char c=a.charAt(idx);
        return reverse(a,idx+1)+c;
    }
    public static void main(String[] args) {
        String a="dharmik";
        
        System.out.println(reverse(a, 0));
        
    }
}
