
package oraim0222;

/**
 *
 * @author zolko
 */
public class OraiM0222 {
    public static void main(String[] args) {
        feladatok();
    }

//    private static int Osszeg4Szam(int[] szamok) { nem ez így volt a feladat
//        int osszeg = 0;
//        for (int i = 0; i < szamok.length; i++) {
//            osszeg += szamok[i];
//        }
//        return osszeg;
//    }

    private static void feladatok() {
        fel1Elso10Szam();
        fel2osszeg();
        fel4OsszegGyok();
    }

    private static void fel4OsszegGyok() {
        int a = 3, b = 4, c = 2;
        int osszeg = osszead(a, b);
        osszeg = osszead(osszeg, c);
        String szoveg = "A %d+%d+%d gyöke: %.2f\n".formatted(a, b, c, Math.sqrt(osszeg));
        kiir(szoveg);
    }

    private static void fel2osszeg() {
        String szoveg = "\n%d + %d = %d\n".formatted(1, 2, osszead(1, 2));
        kiir(szoveg);
    }

    private static void fel1Elso10Szam() {
        kiir("Az első 10 szám összege: "+elso10SzamOsszege());
    }
    

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }

    private static int osszead(int a, int b) {
        return a+b;
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
