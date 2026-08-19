public class TravelExpenseAnalyzer {

    public static void main(String[] args) {

        // Check whether all required arguments are supplied
        if (args.length < 6) {
            System.out.println("Error: Insufficient command-line arguments.");
            System.out.println("Usage:");
            System.out.println("java TravelExpenseAnalyzer <TripID> <Destination> "
                    + "<TravelDays> <TravelExpense> <AccommodationExpense> <FoodExpense>");
            return;
        }

        try {
            // Read command-line arguments
            String tripId = args[0];
            String destination = args[1];

            int travelDays = Integer.parseInt(args[2]);
            double travelExpense = Double.parseDouble(args[3]);
            double accommodationExpense = Double.parseDouble(args[4]);
            double foodExpense = Double.parseDouble(args[5]);

            // Validate numerical inputs
            if (travelDays <= 0) {
                System.out.println("Error: Number of travel days must be greater than 0.");
                return;
            }

            if (travelExpense < 0 || accommodationExpense < 0 || foodExpense < 0) {
                System.out.println("Error: Expenses cannot be negative.");
                return;
            }

            // Calculate total expenditure
            double totalExpenditure =
                    travelExpense + accommodationExpense + foodExpense;

            // Calculate average expenditure per day
            double averageExpenditurePerDay =
                    totalExpenditure / travelDays;

            // Find the highest expense category
            String highestCategory;
            double highestExpense;

            if (travelExpense >= accommodationExpense
                    && travelExpense >= foodExpense) {

                highestCategory = "Travel";
                highestExpense = travelExpense;

            } else if (accommodationExpense >= travelExpense
                    && accommodationExpense >= foodExpense) {

                highestCategory = "Accommodation";
                highestExpense = accommodationExpense;

            } else {

                highestCategory = "Food";
                highestExpense = foodExpense;
            }

            // Budget checking
            final double BUDGET = 25000.0;

            String budgetStatus;

            if (totalExpenditure <= BUDGET) {
                budgetStatus = "Within Budget";
            } else {
                budgetStatus = "Over Budget";
            }

            // Display travel expense report
            System.out.println();
            System.out.println("==============================================");
            System.out.println("          TRAVEL EXPENSE REPORT");
            System.out.println("==============================================");

            System.out.printf("Trip ID              : %s%n", tripId);
            System.out.printf("Destination          : %s%n", destination);
            System.out.printf("Travel Days          : %d%n", travelDays);

            System.out.println("----------------------------------------------");

            System.out.printf("Travel Expense       : %.2f%n", travelExpense);
            System.out.printf("Accommodation Expense: %.2f%n",
                    accommodationExpense);
            System.out.printf("Food Expense         : %.2f%n", foodExpense);

            System.out.println("----------------------------------------------");

            System.out.printf("Total Expenditure    : %.2f%n",
                    totalExpenditure);

            System.out.printf("Average Per Day      : %.2f%n",
                    averageExpenditurePerDay);

            System.out.printf("Highest Expense      : %s (%.2f)%n",
                    highestCategory, highestExpense);

            System.out.printf("Budget               : %.2f%n", BUDGET);
            System.out.printf("Budget Status        : %s%n", budgetStatus);

            System.out.println("==============================================");

        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Invalid numerical input."
            );
            System.out.println(
                    "Travel days must be an integer, and expenses must be numbers."
            );
        }
    }
}
