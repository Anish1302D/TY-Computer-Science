import java.util.Scanner;

class menu
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        int choice;
        boolean running = true;

        while(running)
        {
            System.out.println("\n===Menu===");
            System.out.println("1. Factorial");
            System.out.println("2. Check Prime");
            System.out.println("3. Check Perfect");
            System.out.println("4. Exit");

            System.out.print("Enter a number: ");
            n = input.nextInt();
            input.nextLine();

            System.out.print("Enter choice code: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1: 
                    int factorial = 1;
                    for(int i = 2; i <= n; i++)
                    {
                        factorial *= i;
                    }
                    System.out.println("Factorial of "+ n + " is " + factorial);
                    break;

                case 2:
                    boolean isPrime = true;
                    for(int i = 2; i < n; i++)
                    {
                        if(n % i == 0)
                        {
                            isPrime = false;
                            break;
                        }
                        else
                        {
                            isPrime = true;
                        }
                    }
                    if(isPrime == true)
                    {
                        System.out.println(n + " is a Prime number");
                    }
                    else
                    {
                        System.out.println(n + " is not a Prime number");
                    }
                    break;

                case 3:
                    if (n <= 1) 
                    {
                        break;
                    }

                    int sum = 0;
                    for (int i = 1; i <= n / 2; i++) 
                    {
                        if (n % i == 0) 
                        {
                            sum += i;
                        }
                    }
                    if(sum == n)
                    {
                        System.out.println("The " + n + " is a Perfect number");
                    }
                    else
                    {
                        System.out.println("The "+ n + " is not a Perfect number");
                    }
                    break;
                
                case 4:
                    System.out.println("Exiting the program");
                    System.out.println("The program is exited successfully");
                    return;
                
                default:
                    System.out.println("Error: Please enter valid choice code!");
            }
        }
        input.close();
    }    
}