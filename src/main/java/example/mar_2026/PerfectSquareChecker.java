package example.mar_2026;

public class PerfectSquareChecker {
    public long solution(long n) {
        double root = Math.sqrt(n);

        if(root == (long)root) {
            return (long) Math.pow(root+1, 2);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        PerfectSquareChecker psc = new PerfectSquareChecker();
        long n = 121;
        long n2 = 3;
        System.out.println(psc.solution(n));
        System.out.println(psc.solution(n2));
    }
}
