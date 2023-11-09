import java.util.*;
import java.io.*;
class quiz
{
    static int qs;
    static int ye;
    public void choice()//this method takes in user's choice of taking a quiz or generating a quiz
    {
        Scanner sc = new Scanner(System.in); int q = 0;
        System.out.println("******************************************************************************************");
        System.out.println("******************************************************************************************");
        System.out.println("****                                                                                  ****");
        System.out.println("****                          Welcome to the quiz generator                           ****");
        System.out.println("****         Would you like to take a quiz(1) or generate questions(2)?               ****");
        System.out.println("****                                                                                  ****");
        System.out.println("******************************************************************************************");
        System.out.println("******************************************************************************************");
        ye = sc.nextInt();
        if(ye==1)
        {
            System.out.println("How many questions would you like to have in the quiz?");
            q=sc.nextInt();
            System.out.println("******************************************************************************************");
            System.out.println("******************************************************************************************");
            System.out.println("****                                                                                  ****");
            System.out.println("****                              Welcome to the quiz                                 ****");
            System.out.println("****                            Your Quiz will start now                              ****");
            System.out.println("****                          Each question carries 1 mark                            ****");
            System.out.println("****               Your total score will be given to you at the end                   ****");
            System.out.println("****                                  All the best!                                   ****");
            System.out.println("****                                                                                  ****");
            System.out.println("******************************************************************************************");
            System.out.println("******************************************************************************************");
        }
        if(ye==2)
        {
            System.out.println("How many questions would you like to have in the quiz?");
            q=sc.nextInt();
        }
        qs = q;
    }
}