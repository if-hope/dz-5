public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 25;
        int c = 10;
        int d = 15;

        int sum1 = a + b;
        int sum2 = c + d;

        boolean x = sum1 > sum2;
        System.out.println(x);

        sum1++;
        sum2 -= 2;

        //OR
        //sum2--;
        //sum2--;

        boolean y = sum1 > sum2;
        System.out.println(y);

        boolean z = (sum1 % 2 == 0) || (sum2 % 2 ==0);
        System.out.println(z);

    }

}
