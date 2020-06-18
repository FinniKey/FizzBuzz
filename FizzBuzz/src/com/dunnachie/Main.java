package com.dunnachie;

public class Main {

    /**
     * Goes through numbers 1 to 100, including 1 and 100. If any numbers within that are multiples of 3 or 5, outputs Fizz or Buzz respectively.
     * If it isn't, then it prints the number that is being tested.
     */
    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * Goes through a selected amount of numbers (from firstNumber to lastNumber) and tests to see if it is a multiple of any of the numbers inside of gameRules.
     * If it is, it prints out the word associated with that number, also found in gameRules.
     * @param gameRules This contains the numbers that are part of the game, and the word that is said when we reach a multiple of them.
     *                  For example, when we reach a multiple of 3, we say Fizz, and when we reach a multiple of 5, we say Buzz. In the array it would look like
     *                  {{"3", "Fizz"}, {"5", "Buzz"}}
     * @param firstNumber This is the first number tested in the game.
     * @param lastNumber This is the highest number the game goes up to
     */
    public static void FizzBuzz2(String[][] gameRules, int firstNumber, int lastNumber) {
        int number = 0; //the number within the numbers array
        String word = ""; //the word associated with the number in the numbers array

        //loops through all the numbers from 1 to 100, including 100
        for (int i = firstNumber; i <= lastNumber; i++) {
            boolean isNumberPrinted = false; //the check to see if the number has already been printed or not
            //goes through each row of the numbers array
            for (String[] gameRule : gameRules) {

                //assigns the number ins the numbers array and the word in the numbers array to their own variables
                number = Integer.parseInt(gameRule[0]);
                word = gameRule[1];

                //if the remainder of the number i when divided by number equals 0, then it is a multiple, and so the word must be printed
                if (i % number == 0) {
                    System.out.print(word);
                    //the number has been printed, and so we don't need to print the number itself
                    isNumberPrinted = true;
                }

            }
            //if the number has not already been printed (via a Fizz or a Buzz) then it prints the number that was tested
            if (!isNumberPrinted) {
                System.out.print(i);
            }
            //a number can have multiple multiples, and so above I only use print() so it doesnt go onto a new line.
            //Once the calculations have been done, prints and empty new line for the next number to go onto
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //FizzBuzz();

        //2d array of a number and the word it says when it reaches a multiple of that number
        String[][] gameRules = {
                {"2", "Fozz"},
                {"3", "Fizz"},
                {"5", "Buzz"}
        };
        FizzBuzz2(gameRules, 1, 100);
    }
}
