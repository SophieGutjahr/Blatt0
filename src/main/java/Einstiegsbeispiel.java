public class Einstiegsbeispiel {

    public int getInnerProdukt (int [] a, int [] b){
        int ergebnis= 0;

        for (int i = 0; i< a.length; i++){
            ergebnis= ergebnis + a[i]*b[i];
        }
        return ergebnis;
    }
}