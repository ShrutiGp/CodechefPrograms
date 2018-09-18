import java.util.Arrays;
import java.util.Scanner;

/* Magician versus Chef */
public class MagicChef{

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int j = 0; j < t; j++) {
            int a[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int N = a[0];
            int X = a[1];
            int S = a[2];

            int swaps[][] = new int[S][2];
            for (int i = 0; i < S; i++) {
                swaps[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            for (int i = 0; i < S; i++) {
                int A = swaps[i][0];
                int B = swaps[i][1];

                if (A == X) {
                    X = B;
                } else if (B == X) {
                    X = A;
                }
            }
            System.out.println(X);
        }

    }
}
