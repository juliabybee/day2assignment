
/* lottopicker to generate a random number 0 to 30 and print out five distinct numbers to user
1.figure out how to generate a random number
2.  repeat step 1 five times
3. store results of step 2 in array
find a way to print out the results that are stored along the way*/


import java.util.Random;

public class lottopicker {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 5;
        int numOfNumGen = 0;
        int[] lottoNums = new int[5];
        while (numOfNumGen < total) {
            int randomNumber = random.nextInt(30);
            lottoNums[numOfNumGen] = randomNumber;
            numOfNumGen = numOfNumGen + 1;
            System.out.println("Lotto Number " + numOfNumGen + " is " +randomNumber);
        }
    }
}

