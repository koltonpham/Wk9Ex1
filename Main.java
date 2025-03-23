import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        //declarations
        String rate;
        String principal;
        String years;
        double interest;
      
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Interest Calculator Program"); //print title
  
        System.out.println("What is the principal amount of the loan in dollars?");
        principal = scanner.nextLine();  // Read user input
        double principalD = Double.parseDouble(principal); //convert string to int

        System.out.println("What is the interest rate (input 0.05 for 5%)?");
        rate = scanner.nextLine();  // Read user input
        double rateD = Double.parseDouble(rate); //convert string to int

        System.out.println("What is the period of loan in years?");
        years = scanner.nextLine();  // Read user input
        double yearsD = Double.parseDouble(years); //convert string to int

        interest = (principalD * rateD) * yearsD; //calculate interest

        System.out.println("Total interest of Loan: " + interest + " dollars.");  // Output user input
    }
  }
