import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int c = 0;
        int M[] = {6, 4, -7, 7, -3, 5, -10};
        for (int i = 0; i < M.length - 1; i++) {
            for (int j = M.length - 1; j > 0; j--) {
                if (M[j] < M[j - 1]) {
                    c = M[j - 1];
                    M[j - 1] = M[j];
                    M[j] = c;
                }
            }
            System.out.println(Arrays.toString(M));
        };
    }
}