
package oraim0222;

import java.util.Random;

public class Equalizer {
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        fel_1_randomEqu();
        fel_2_megadottEq();
    }

    private static void fel_2_megadottEq() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }

    private static void fel_1_randomEqu() {
        for (int i = 0; i < 5; i++) {
            eq();
        }
    }

    private static void eq(){
        int a = rnd.nextInt(7-3+1)+3;
        for (int i = 0; i < a; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println();
    }
    
    private static void eq(int hossz){
        for (int i = 0; i < hossz; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println();
    }
    
}
