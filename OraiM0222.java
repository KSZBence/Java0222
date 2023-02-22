
package oraim0222;

/**
 *
 * @author zolko
 */
public class OraiM0222 {

    public static void main(String[] args) {
        
    }

    private static void kiiratas(int ertek) {
        System.out.printf("Az első 10 szám összege: %d\n", ertek);
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
}
