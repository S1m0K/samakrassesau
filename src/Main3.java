import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) throws Exception {
//        int[] a = {11, 66, 8, 45, 34, 5, 89, 345, 68, 234};
//        int[] b = new int[10];
//        b[0] = 10;
//        b[1] = 9;
//        b[2] = 8;
//        b[3] = 7;
//        b[4] = 6;
//        b[5] = 5;
//        b[6] = 4;
//        b[7] = 3;
//        b[8] = 2;
//        b[9] = 1;
//
//        int[] summedArray = sumTwoArrays(a, b);
//        output(summedArray);

//        System.out.println("Please enter your name:");
//        Scanner reader = new Scanner(System.in);
//        String name = reader.next();
//        System.out.println("Hello" + name);
//        int words = countingWords("src//lego.txt");
//        System.out.println(words);

//        int summedInput = summInputs();
//        System.out.println(summedInput);


//        int[] lotteryDraw = lotteryNumbers();
//        int[] lottoGuess = putLotteryDraw();
//        int amountCorrect = lottoTip(lottoGuess, lotteryDraw);
//        System.out.println(amountCorrect);
//        System.out.println("Your Guess:");
//        output(lottoGuess);
//        System.out.println("What the draw has been");
//        output(lotteryDraw);
//        guessingGame();




    }

    public static void output(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Position " + i + " : " + a[i]);
        }
    }

    public static void outputBoolean(boolean[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Position " + i + " : " + a[i]);
        }
    }

    public static void outputString(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Position " + i + " : " + a[i]);
        }
    }

    public static int biggestDigit(int[] a) {
        int largestFigure = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largestFigure) {
                largestFigure = a[i];
            }
            System.out.println(largestFigure);
        }
        return largestFigure;
    }

    public static int[] reverseArray(int[] arr) {

        int length = arr.length;
        int[] reversedArr = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArr[i] = arr[length - 1 - i];
        }
        return reversedArr;
    }

    public static int[] evenMinusOne(int[] a) {

        int evenNumber;
        int lengthOldArray = a.length;
        int[] newArray = new int[lengthOldArray];

        for (int i = 0; i < a.length; i++) {
            evenNumber = a[i] % 2;

            if (evenNumber == 0)
                newArray[i] = -1;

            else
                newArray[i] = a[i];
        }
        return newArray;
    }

    public static int[] randomArray() {

        int[] random = new int[20];

        for (int i = 0; i < 20; i++) {
            random[i] = (int) (Math.random() * 100) + 1;
        }
        return random;
    }

    public static int[] firstFive(int[] a) {

        int[] five = new int[5];

        for (int i = 0; i < 5; i++) {
            five[i] = a[i];
        }
        return five;
    }

    public static int[] lotteryNumbers() {

        int[] lotteryWithoutDuplications = new int[6];
        boolean doubleExam;

        for (int i = 0; i < 6; i++) {
            int zz = (int) (Math.random() * 45) + 1;
            doubleExam = true;
            while (doubleExam) {

                for (int c : lotteryWithoutDuplications) {
                    if (c == zz) {
                        zz = (int) (Math.random() * 45) + 1;
                    } else {
                        doubleExam = false;
                    }
                }
            }
            lotteryWithoutDuplications[i] = zz;
        }
        return lotteryWithoutDuplications;
    }

    public static int lottoTip(int[] lottoTip, int[] lotteryDraw) {

        int amountCorrect = 0;

        for (int i = 0; i < 6; i++) {
            int examination = lottoTip[i];

            for (int a : lotteryDraw) {
                if (a == examination) {
                    amountCorrect++;
                }
            }
        }
        return amountCorrect;
    }

    public static boolean[] higherThan50(int[] a) {

        boolean[] alteredArray = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 50)
                alteredArray[i] = true;
            else
                alteredArray[i] = false;
        }
        return alteredArray;
    }

    public static String[] higherThan50String(int[] a) {

        String[] alteredArray = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 50)
                alteredArray[i] = "higher";
            else
                alteredArray[i] = "kleiner";
        }
        return alteredArray;
    }

    public static int[] sumTwoArrays(int[] a, int[] b) {

        int[] summedArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            summedArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            summedArray[i + a.length] = b[i];
        }
        return summedArray;
    }

    public static int countingWords(String url) throws Exception {
        Scanner cntWords = new Scanner(new File(url));
        int amountWords = 0;
        while (cntWords.hasNext()) {
            String words = cntWords.next();
            amountWords += 1;
        }
        cntWords.close();

        return amountWords;
    }

    public static int summInputs() throws FileNotFoundException {

        int summ = 0;
        boolean exam = true;
        Scanner inputScanner = new Scanner(System.in);

        while (exam == true) {
            System.out.println("Please enter a number higher than zero:");
            String input = inputScanner.next();
            int number = Integer.parseInt(input);
            if (number > 0)
                summ += number;
            else {
                inputScanner.close();
                exam = false;
            }
        }
        return summ;
    }

    public static int[] putLotteryDraw() throws Exception {

        int[] lotteryTip = new int[6];
        Scanner lottoryInput = new Scanner(System.in);
        boolean exam = true;
        int inputlottery;

        for (int i = 0; i < 6; i++) {

            System.out.println("Geben sie die" + i + "Zahl ein");
            String justToParse = lottoryInput.next();
            inputlottery = Integer.parseInt(justToParse);

            while (inputlottery > 45 || inputlottery < 1) {
                System.out.println("Wrong input please try again");
                justToParse = lottoryInput.next();
                inputlottery = Integer.parseInt(justToParse);
            }
            lotteryTip[i] = inputlottery;
        }
        lottoryInput.close();
        return lotteryTip;
    }

    public static void guessingGame() throws Exception {

        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner guessingInput = new Scanner(System.in);
        boolean exam = true;
        int attemps = 0;
        System.out.println("Guess the right number, it's between 0 and 100");

        while (exam = true) {

            String parseGuess = guessingInput.next();
            int guess = Integer.parseInt(parseGuess);

            if (guess < randomNumber) {
                System.out.println("The number is larger");
                attemps += 1;

            } else if (guess > randomNumber) {
                System.out.println("The number is smaller");
                attemps += 1;
            } else {
                System.out.println("You have guessed it right Congratulations");
                System.out.println("You needed " + attemps + " guesses");
                exam = false;
            }

        }
    }






}



