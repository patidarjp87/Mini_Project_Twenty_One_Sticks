import java.util.Scanner;

public class TwentyOneSticks
{
    public static void main(String[] args)
    {
        int no_of_sticks=21;
        System.out.print("Do you want to play first ? (y/n)");
        Scanner sc=new Scanner(System.in);
        String attempt1=sc.nextLine();
        Scanner read_next=new Scanner(System.in);
        int num=0;
        while(no_of_sticks>0)
        {
            if(attempt1.equals("y")||attempt1.equals("Y"))
            {
                System.out.println("Currently "+no_of_sticks+" sticks are available");
                System.out.println("pick your sticks (1 or 2)");
                num=read_next.nextInt();
                if(num>2)
                    num=2;
                else if(num<1)
                    num=1;
                no_of_sticks-=num;
                if(no_of_sticks<=0)
                    System.out.println("You have lost the game.");
                else
                    {
                        if((no_of_sticks-2)%3==0 || (no_of_sticks-2)==0)
                            num=1;
                        else
                            num=2;
                        System.out.println("Your opponent picks "+ num + "sticks");
                        no_of_sticks-=num;
                        if(no_of_sticks<=0)
                            System.out.println("You have won the game.");
                    }             
            }
            else
            {
                if((no_of_sticks-2)%3==0 || (no_of_sticks-2)==0)
                    num=1;
                else
                    num=2;
                System.out.println("Your opponent picks " + num + "sticks");
                no_of_sticks-=num;
                if(no_of_sticks<=0)
                    System.out.println("You have won the game.");
                else
                {
                    System.out.println("Currently "+no_of_sticks+ "sticks are available");
                    System.out.println("pick your sticks (1 or 2)");
                    num=read_next.nextInt();
                    if(num>2)
                        num=2;
                    else
                        num=1;
                    no_of_sticks-=num;
                    if(no_of_sticks<=0)
                        System.out.println("You have lost the game.");
                }
            }
        }
    }
}