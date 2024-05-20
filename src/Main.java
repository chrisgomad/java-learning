import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String question = "What is the make and model of your first car? (You can type just the letters for the answer ie. A, B, C)";
        String choiceOne = "A. Honda Civic ";
        String choiceTwo = " B. Hyundai Elantra ";
        String choiceThree = " C. Tesla Model 3 ";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne + choiceTwo + choiceThree);
        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();
        // If the user's input matches the correctAnswer...
        if(userInput.equalsIgnoreCase("B")){ // .equalsIgnoreCase can be used to ignore input's case.
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Correct! Congratulations!");
        } else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect.
            System.out.println("Sorry, that is not the correct answer. Try again.");

        }




        }
    }