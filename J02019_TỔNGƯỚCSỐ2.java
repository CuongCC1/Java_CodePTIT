import java.util.*;

public class J02019_TỔNGƯỚCSỐ2 {
    static int sumofFactors(int n)
    {
        int k = n;
        int res = 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            int  curr_sum = 1;
            int curr_term = 1;

            while (n % i == 0)
            {
                n = n / i;

                curr_term *= i;
                curr_sum += curr_term;
            }

            res *= curr_sum;
        }
        if (n > 2)
            res *= (1 + n);

        return res-k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a;i<=b; i++){
            if (sumofFactors(i) > i)
                c++;
        }
        System.out.println(c);
    }
}