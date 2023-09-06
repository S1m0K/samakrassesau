public class Main {
    public static void main(String[] args) {

//        int[] newArray = randomArray();
//        ausgabe(newArray);

//        int[] nurFuenf = erstenFuenf(newArray);
//        ausgabe(nurFuenf);

        int[] lotto = lottoZahlen();
        ausgabe(lotto);


    }

    public static void ausgabe(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ":" + a[i]);
        }

    }

    public static int[] randomArray() {

        int[] random = new int[20];

        for (int i = 0; i < 20; i++) {
            random[i] = (int) (Math.random() * 100) + 1;
        }

        return random;
    }

    public static int[] erstenFuenf(int[] a) {

        int[] fuenf = new int[5];

        for (int i = 0; i < 5; i++) {
            fuenf[i] = a[i];
        }
        return fuenf;
    }

    public static int[] lottoZahlen() {

        int[] lottoOhneDuplikate = new int[6];
        boolean doppelt = true;

        for (int i = 0; i < 6; i++) {
            int zz = (int) (Math.random() * 45) + 1;
            doppelt = true;
            while (doppelt) {
                for (int c : lottoOhneDuplikate) {
                    if (c == zz) {
                        zz = (int) (Math.random() * 45) + 1;
                    } else {
                        doppelt = false;
                    }
                }Integer
            }
            lottoOhneDuplikate[i] = zz;
        }
        return lottoOhneDuplikate;
    }





}