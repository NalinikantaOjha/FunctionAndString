public class RemoveCharacter {
    public static void main(String[] args) {
        String a = "cool";
        String c="c";
        char d ='c';
        a=a.replace(c,"");
        System.out.println(a);
       /* for (int i =0;i<a.length();i++){
            if(a.charAt(i)==d){
                continue;

            }
            System.out.println(a);break;
        }*/
    }
}
