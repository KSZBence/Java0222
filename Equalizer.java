
package oraim0222;

import java.util.Random;

public class Equalizer {
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        eq();
        eq();
        eq();
        eq();
        eq();
    }

    private static void eq(){
        int a = rnd.nextInt(7-3+1)+3;
        for (int i = 0; i < a; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println();
    }
}