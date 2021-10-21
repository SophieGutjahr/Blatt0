
//Anna Sophie Gutjahr
//11736254
public class Einstiegsbeispiel {

    public int getInnerProdukt(int[] a, int[] b) {
        int ergebnis = 0;
try {
    if (a == null || b == null) {
        throw new IllegalArgumentException("Array is empty");
    }

    else if (a.length != b.length) {
        throw new IllegalArgumentException("Array a is not the same length as b");
    }
    else {
        for (int i = 0; i < a.length; i++) {
            ergebnis = ergebnis + a[i] * b[i];
        }
        return ergebnis;
    }

} catch (IllegalArgumentException e) {
    return 0;
}

    }
}