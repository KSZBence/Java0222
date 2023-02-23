
package oraim0222;

import java.util.Random;


public class QrGenerator {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        ki(qr(20, true));
    }

    private static void ki(String szoveg) {
        System.out.println(szoveg);
    }
    
    private static String qr() {
        return qr(10, false);
    }
    
    private static String qr(int hossz) {
        return qr(hossz, false);
    }
    
    private static String qr(boolean zold) {
        return qr(10, zold);
    }
    
    private static String qr(int hossz, boolean zold) {
        String code = "";
        for (int i = 0; i < hossz*(hossz/2); i++) {
            if (i % hossz == 0) {
                code += "\n";
            }
            int rndbin = rnd.nextInt(2);
            if (rndbin == 1) {
                code += "\u001B[43m" + " ";
            } else {
                code += "\u001B[40m" + " ";
            }
        }
//        if (zold) {
//            for (int i = 0; i < code.length(); i++) {
//                if (i == hossz-5) {
//                    
//                }
//            }
//        }
        
        return code;
    }
}
