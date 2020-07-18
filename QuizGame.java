/** FILENAME: [quiz Game]
 * AUTHOR: [Bakhora Rasulova]
 * PURPOSE: [Quiz Game]**/


import java.util.Scanner;

public class QuizGame 
{

	public static void main(String[] args) 
	{
		//call method
		takeTest();

	}//end of main

	public static void takeTest()
	{
		// Declare and initialize 
		int correct = 0;
		int inCorrect = 0;
		int maxTries = 2;
		boolean validAnswer = false;
		String answerInput = "";
		int answerUser = 0;
		//arrays for String type
		String[] questions = {"What is the capital of Virginia?", "What state is larger – Texas or Maryland?",
		"What is the capital of Maryland?"};
		String[] answers = {"Richmond", "Texas", "Annapolis"};
		//arrays for int type		
		String[] questions2 = {"What is the rank of Virginia?", "How big is California in sq km?"};
		int[] answers2 = {28, 403882};
		
		Scanner input = new Scanner (System.in);

		//FIRST LOOP TO RUN PROGRAM THROUGH QUIZ		
		for (int i = 0; i < questions.length; i++) 
		{ 
			//SECOND LOOP TO RUN TWO TIMES IF ANSWER WRONG
			for(int j = 0; j < maxTries; j++)
			{
				System.out.println(questions[i]);

				answerInput = input.nextLine();

				if (answerInput.equals(answers[i]))
				{
					validAnswer = true;
					correct++;
					break;
				}//end of if answer correct
				
				else 
				{
					validAnswer = false;
				}//end if answer inCorrect

			}//end of two tries

			if (!validAnswer)
			{
				System.out.println("Correct answer is: " + answers[i]);
				inCorrect++;
			}

		}//end of questions loop
		
		
		
		//for loop for int type answers
		for (int i = 0; i < questions2.length; i++) 
		{ 
			//SECOND LOOP TO RUN TWO TIMES IF ANSWER WRONG
			for(int j = 0; j < maxTries; j++)
			{
				System.out.println(questions2[i]);

				answerUser = input.nextInt();

				if (answerUser == answers2[i])
				{
					validAnswer = true;
					correct++;
					break;
				}//end of if answer correct
				
				else 
				{
					validAnswer = false;
				}//end if answer inCorrect

			}//end of two tries

			if (!validAnswer)
			{
				System.out.println("Correct answer is: " + answers2[i]);
				inCorrect++;
			}

		}//end of questions2 loop
		
		
		//display results
		System.out.println("Results: " + inCorrect + " incorrect; " + correct + " / " + (questions.length + questions2.length) + " correct");

		input.close();
	}//end of takeTest

}//end of class
