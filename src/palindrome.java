public class palindrome {
    public static void main(String[] args) {
       String a="cooc";
      System.out.println(palindrome(a));

    }public static boolean palindrome(String a){
        int start= 0;
        int end= a.length()-1;
        while(start<end){
            if(a.charAt(start)!=a.charAt(end)){
                return false;
            }start++;
            end--;
        }return true;
    }
}
