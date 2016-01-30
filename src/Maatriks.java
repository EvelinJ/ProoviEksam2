import java.util.Arrays;

/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks {
    //private String tahis = "x";

    public static void main (String[] args) {
        String [][] maatriks = new String [100][10];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {

                if (i+j==0 || i-j == 0) {
                    maatriks[i][j] = "x";
                } else if (i+j==18 || i-j == 18) {
                    maatriks[i][j] = "x";
                } else if (i+j==36 || i-j == 36) {
                    maatriks[i][j] = "x";
                } else if (i+j==54 || i-j == 54) {
                    maatriks[i][j] = "x";
                } else if (i+j==72 || i-j == 72) {
                    maatriks[i][j] = "x";
                } else if (i+j==90 || i-j == 90) {
                    maatriks[i][j] = "x";
                } else {
                    maatriks[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }
}

//summa = (i+j)+(i-j); kasvab 2 võrra
