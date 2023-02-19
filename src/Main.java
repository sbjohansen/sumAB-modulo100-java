import java.util.*;

class SumAB {
    public void run() {
        int sumA = 1000;
        int sumB = 0;
        int tryCounter = 0;

        Random randomGenerator = new Random();

        System.out.println("\n" + "### Task 1 ###" + "\n");

        while(sumA > sumB) {
            tryCounter++;
            sumA = sumA + randomGenerator.nextInt(10);
            sumB = sumB + randomGenerator.nextInt(50);

            System.out.println("Counter: " + tryCounter + ", sumA value: " + sumA + ", sumB value:  " + sumB);
        }
    }
}

class Modulo100 {
    public void run() {
        System.out.println("\n" + "### Task 2 ###" + "\n");

        for(int i = 0; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

       SumAB sumAB = new SumAB();
       sumAB.run();

       Modulo100 modulo100 = new Modulo100();
       modulo100.run();
    }
}