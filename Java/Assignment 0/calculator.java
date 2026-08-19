import java.util.Scanner;

class calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean running = true;
        double n1, n2;

        while(running)
        {
            System.out.println("\n===Calculator===");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter choice code: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1: 
                    System.out.print("Enter first number: ");
                    n1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    n2 = input.nextDouble();

                    System.out.print("Result: " + (n1 + n2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    n1 = input.nextDouble();
                    
                    System.out.print("Enter second number: ");
                    n2 = input.nextDouble();

                    System.out.print("Result: "+ (n1 - n2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    n1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    n2 = input.nextDouble();

                    System.out.println("Result: "+ (n1 * n2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    n1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    n2 = input.nextDouble();

                    if(n2 == 0)
                    {
                        System.out.println("ERROR: Divison by zero not allowed");
                    }
                    else
                    {
                        System.out.println("Result: "+ (n1/n2));
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Enter correct choice code");
                    break;
            }
        }
        input.close();
    }
}