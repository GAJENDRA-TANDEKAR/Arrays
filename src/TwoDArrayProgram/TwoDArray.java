package TwoDArrayProgram;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = i + j;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
        }
    }
}
