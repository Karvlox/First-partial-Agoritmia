import java.util.*;

public class EjercicioQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] gifts = new int[N];

        for (int i = 0; i < N; i++) {
            gifts[i] = scanner.nextInt();
        }

        int minMoves = minGiftMoves(gifts);
        System.out.println(minMoves);
    }

    public static int minGiftMoves(int[] gifts) {
        int n = gifts.length;
        int[] lis = new int[n];

        Arrays.fill(lis, 1);


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (gifts[i] > gifts[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }


        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, lis[i]);
        }


        return n - maxLength;
    }
}
