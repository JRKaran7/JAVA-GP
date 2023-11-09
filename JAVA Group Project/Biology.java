import java.io.*;  
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class Biology extends quiz
{
    public void op2()//this method is for the generation of questions of a quiz
    {
        int questionNum = 4; int qno = qs;
        Random rand = new Random(); String ans[] = new String[qno];
        for(int i = 1;i<=qno;i++)
        {
            int randomno = rand.nextInt(19);
            System.out.println("Question "+i+": - ");
            if (randomno==0)
            {
                try
                {
                    /* This block of code accesses the 1st question in the csv file
                     * along with the options and the other csv file provides the solution
                     */
                    String question = Files.readAllLines(Paths.get("D://qs.csv")).get(0);
                    String op1 = Files.readAllLines(Paths.get("D://qs.csv")).get(1);
                    String op2 = Files.readAllLines(Paths.get("D://qs.csv")).get(2);
                    String op3 = Files.readAllLines(Paths.get("D://qs.csv")).get(3);
                    String op4 = Files.readAllLines(Paths.get("D://qs.csv")).get(4);
                    System.out.println(question);
                    System.out.println(op1);
                    System.out.println(op2);
                    System.out.println(op3);
                    System.out.println(op4);
                    ans[i-1] = Files.readAllLines(Paths.get("D://soln.csv")).get(0);
                }
                catch(IOException e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                try
                {
                    /* This block of code accesses the random (but not the first) question in the csv file
                     * along with the options and the other csv file provides the solution
                     */
                    String question = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5);
                    String op1 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+1);
                    String op2 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+2);
                    String op3 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+3);
                    String op4 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+4);
                    System.out.println(question);
                    System.out.println(op1);
                    System.out.println(op2);
                    System.out.println(op3);
                    System.out.println(op4);
                    ans[i-1] = Files.readAllLines(Paths.get("D://soln.csv")).get(randomno);
                }
                catch(IOException e)
                {
                  System.out.println(e);
                }
            }
        }
        System.out.println("Answers: - ");
        for(int j = 0;j<ans.length;j++)
        {
            int k = j+1;
            System.out.println(k+". "+ans[j]);
        }
    }
    public void op1()//this method is for the taking of a quiz
    {
        int questionNum = 4; int qno = qs; int c = 0;
        Random rand = new Random(); int i = 1;
        Scanner sc = new Scanner(System.in);
        for(i = 1;i<=qno;i++)
        {
            int randomno = rand.nextInt(19);
            System.out.println("Question "+i+": - ");
            if (randomno==0)
            {
                try
                {
                    /* This block of code accesses the 1st question in the csv file
                     * along with the options and the other csv file provides the solution.
                     * It also counts the score based on whether you have input the right or the wrong answer.
                     */
                    String question = Files.readAllLines(Paths.get("D://qs.csv")).get(0);
                    String op1 = Files.readAllLines(Paths.get("D://qs.csv")).get(1);
                    String op2 = Files.readAllLines(Paths.get("D://qs.csv")).get(2);
                    String op3 = Files.readAllLines(Paths.get("D://qs.csv")).get(3);
                    String op4 = Files.readAllLines(Paths.get("D://qs.csv")).get(4);
                    System.out.println(question);
                    System.out.println(op1);
                    System.out.println(op2);
                    System.out.println(op3);
                    System.out.println(op4);
                    System.out.println("Enter your answer: - ");
                    String ch = sc.next();
                    String ch1 = Files.readAllLines(Paths.get("D://soln.csv")).get(0);
                    String ch2 = Files.readAllLines(Paths.get("D://soln.csv")).get(0)+")";
                    if(ch1.equalsIgnoreCase(ch)||ch2.equalsIgnoreCase(ch))
                    {
                        System.out.println("It is the right answer");
                        c++;
                    }
                    else
                    {
                        System.out.println("It is the wrong answer");
                        System.out.println("The right answer is: - "+ch1);
                    }
                }
                catch(IOException e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                try
                {
                    /* This block of code accesses the random (but not the first) question in the csv file
                     * along with the options and the other csv file provides the solution.
                     * It also counts the score based on whether you have input the right or the wrong answer.
                     */
                    String question = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5);
                    String op1 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+1);
                    String op2 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+2);
                    String op3 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+3);
                    String op4 = Files.readAllLines(Paths.get("D://qs.csv")).get(randomno*5+4);
                    System.out.println(question);
                    System.out.println(op1);
                    System.out.println(op2);
                    System.out.println(op3);
                    System.out.println(op4);
                    System.out.println("Enter your answer: - ");
                    String ch = sc.next();
                    String ch1 = Files.readAllLines(Paths.get("D://soln.csv")).get(randomno);
                    String ch2 = Files.readAllLines(Paths.get("D://soln.csv")).get(randomno)+")";
                    if(ch1.equalsIgnoreCase(ch)||ch2.equalsIgnoreCase(ch))
                    {
                        System.out.println("It is the right answer");
                        c++;
                    }
                    else
                    {
                        System.out.println("It is the wrong answer");
                        System.out.println("The right answer is: - "+ch1);
                    }
                 }
                catch(IOException e)
                {
                  System.out.println(e);
                }
            }
        }
        int s = i-1;
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("****                                             ****");
        System.out.println("****   Congratulations on the taking the quiz    ****");
        System.out.println("****        Your total score is "+c+" out of "+s+"       ****");
        System.out.println("****                                             ****");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
    }
    public static void main()//the main method calls the other methods using objects.
    {
        Scanner sc = new Scanner(System.in);
        for(int a = 1;a>0;a++)
        {
            quiz obj1 = new quiz();
            obj1.choice();
            if(ye==2)
            {
                Biology obj = new Biology();
                obj.op2();
            }
            else if(ye==1)
            {
                Biology obj = new Biology();
                obj.op1();
            }
            else
            System.out.println("Invalid Input");
            System.out.println("Do you want to try it again? Type 1 for yes and 0 for no");
            int num = sc.nextInt();
            if(num==1)
            continue;
            else if(num==0)
            {
                System.out.println("Thank you for taking part in the quiz generator");
                break;
            }
            else
            {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}