public class MaxNumber {

    public static void main(String[]s){
        int a = 2100;
        int b = 220,c = 25000;

        if (a>b && a>c){
            System.out.println("MaxNumber is a:" +a);
        } else if (b>c) {
            System.out.println("MaxNumber is b:" +b);
        }
        else {
            System.out.println("MaxNumber is c:" +c);
        }
    }
}
