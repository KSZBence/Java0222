
package oraim0222;

/**
 *
 * @author zolko
 */
public class OraiM0222 {
    public static void main(String[] args) {
        kiir("Az első 10 szám összege: "+elso10SzamOsszege());
        kiir(1+"+"+2);
        String szoveg = "\n%d + %d = %d\n".formatted(1, 2, osszead(1, 2));
        kiir(szoveg);
        int[] szamok = {1, 2, 3, 4};
        szoveg = "A 4 szám összege: %d\n".formatted(Osszeg4Szam(szamok));
        kiir(szoveg);
    }

    private static int Osszeg4Szam(int[] szamok) {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg += szamok[i];
        }
        return osszeg;
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
