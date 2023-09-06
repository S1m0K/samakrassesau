public class Main2 {
    public static void main(String[] args) {


//        pitchAndToss(1000);

//        permutationsPin();

        String hoi = "programmieren";

        stringUmdrehen(hoi);


    }

    public static void ausgabe(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Stelle" + i + "=" + a[i]);
        }
    }

    public static void ausgabeChar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Stelle" + i + "=" + a[i]);
        }
    }

    public static void zwischenSummen(int zahl1) {
        int ergebnis = 0;

        for (int i = 0; i <= zahl1; i++) {
            ergebnis += i;
            System.out.printf("%4d", ergebnis);
        }
    }

    public static void geradeZahlen(int cntEvenNumbers) {

        int cntCurrentNumbers = 0;
        int var1 = 0;
        while (cntEvenNumbers >= cntCurrentNumbers) {
            int remain = var1 % 2;
            if (remain == 0) {
                System.out.printf("%4d", var1);
                cntCurrentNumbers++;
            }
            var1++;

        }


    }

    public static void printStars(int cntStars) {

        for (int i = 1; i <= cntStars; i++) {

            int remain = i % 25;
            System.out.print("*");

            if (remain == 0)
                System.out.println("*");

        }

    }

    public static void cntRndNumbers(int amountRep) {
        int cntoccasions = 0;

        for (int i = 1; i <= amountRep; i++) {
            int rnd = (int) (Math.random() * 100) + 1;
            if (rnd <= 50)
                cntoccasions++;

        }
        System.out.println(cntoccasions);

    }

    public static void cntZins(double startMoney, int cntYears) {
        for (int i = 1; i <= cntYears; i++) {
            startMoney *= 1.05;
            System.out.println("nach Jahr:" + i);
            System.out.println(startMoney);
        }

    }

    public static void cntFaculty(int valueNumber) {
        int currentvalue = 1;
        for (int i = valueNumber; i > 1; i--) {
            currentvalue *= i;
            System.out.println(currentvalue);
        }
    }

    public static void test() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

    }

    public static void yearPopulationEqual() {
        double populationIndia = 1095;
        double populationChina = 1314;
        int currentYear = 2006;
        for (int i = 1; populationIndia <= populationChina; i++) {
            populationIndia *= 1.0138;
            populationChina *= 1.0059;
            currentYear += 1;
        }
        System.out.println(currentYear);
    }

    static void einMalEins(int grenze) {
        for (int i = 1; i <= grenze; i++) {
            for (int j = 1; j <= grenze; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    static void alignStars() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    static void chessTable(int cntField) {
        long anzahlReiskoerner = 1;

        for (int i = 2; i <= cntField; i++) {
            anzahlReiskoerner *= 2;
            System.out.println(i);
        }
        System.out.print(anzahlReiskoerner);
    }

    static void chessTableSecVar(int cntField) {
        int tumm = cntField - 1;
        long anzahlReiskoerner = (long) Math.pow(2, tumm);
        System.out.print(anzahlReiskoerner);
    }

    static void pitchAndToss(int amountToss) {

        int amountKopf = 0;
        double relativeHaeufigkeit = 0;

        for (int wuerfe = 1; wuerfe <= amountToss; wuerfe++) {
            int wurf = (int) (Math.random() * 2);

            if (wurf == 0) {
                amountKopf += 1;
            }

        }
        relativeHaeufigkeit = (double) amountKopf / (double) amountToss;
        System.out.printf("Anzahl Würfe: %2d , Häufigkeit Kopf %2d , relative Häufigkeit von Kopf %2f", amountToss, amountKopf, relativeHaeufigkeit);
    }

    public static void permutationsPin() {
        int[] possibilities = new int[4];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                for (int k = 0; k < 10; k++) {

                    for (int l = 0; l < 10; l++) {

                        possibilities[0] = i;
                        possibilities[1] = j;
                        possibilities[2] = k;
                        possibilities[3] = l;

                        int erste = possibilities[0];
                        String ersteZahl = Integer.toString(erste);

                        int zweite = possibilities[1];
                        String zweiteZahl = Integer.toString(zweite);

                        int dritte = possibilities[2];
                        String dritteZahl = Integer.toString(dritte);

                        int vierte = possibilities[3];
                        String vierteZahl = Integer.toString(vierte);

                        System.out.println(ersteZahl + " " + zweiteZahl + " " + dritteZahl + " " + vierteZahl);
                    }
                }
            }
        }
    }

    public static void stringUmdrehen(String a) {

        int laenge = a.length();

        char[] alterString = new char[laenge];
        char[] neuerString = new char[laenge];


        for (int i = 0; i < laenge; i++) {
            alterString[i] = a.charAt(i);
        }

        for (int i = 0; i < laenge; i++) {
            neuerString[i] = alterString[laenge - 1 - i];
        }

        String fertigerString = new String(neuerString);
        System.out.println(fertigerString);
    }


}

