import java.util.*;

public class DemoMith {
    public static void main(String[] args) {
        int a=0; int b=1;
        System.out.print(a+"");
        int c;
        for(int i=1; i<=6;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
