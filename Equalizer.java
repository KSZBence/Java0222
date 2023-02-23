
package oraim0222;

import java.util.Random;

public class Equalizer {
    static Random rnd = new Random();
    
    public static void main(String[] args) {
//        fel_1_randomEqu();
        fel_2_megadottEq();
    }

    private static void fel_2_megadottEq() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();
    }

//    private static void fel_1_randomEqu() {
//        for (int i = 0; i < 5; i++) {
//            eq();
//        }
//    }

    private static void eq(){
        int rndhossz = rnd.nextInt(7-3+1)+3;
        eq(rndhossz,false);
    }
    
    private static void eq(int hossz){
        eq(hossz,false);
    }
    
    private static void eq(boolean ir){
        int rndhossz = rnd.nextInt(7-3+1)+3;
        eq(rndhossz,ir);
    }
    
    private static void eq(int hossz, boolean ir){
        for (int i = 0; i < hossz; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        if (ir) {
            System.out.print("\u001B[40m" + " ");
            System.out.printf("(%d)",hossz);
        }
        System.out.println();
    }
    
    
    
}
