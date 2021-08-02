import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        char c =scanner.next().charAt(0);
        System.out.println(calculator(a,b,c));

    }
    public static int calculator(int a,int b,char c){
        switch (c){
            case '+':
                int result=a+b;
                return result;
            case '-':
                if(a>b) {
                    result = a - b;
                }else {
                    result = a - b;
                }
                return result;
            case '*':
                result=a*b;
                return result;
            case '/':
                if(a>b) {
                    result = a / b;
                }else {
                    result = a / b;
                }
                return result;
        }return 0;
    }
}
