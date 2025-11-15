package lessons;

public class Recursiya {
    public static void main(String[] args) {
        countDown(5);
//        sum(5);
    }

    static int countDown(int n) {
        if (n == 0) return n;
        System.out.println(n);
        countDown(n - 1);
        return n;
    }

    static int sum(int n) {
        if (n == 0) return 0;
        int cd = countDown(n);
        System.out.println(n + sum(cd));
        return n;
    }
}
