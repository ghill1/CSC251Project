import java.util.*;

/**
   this program will compute an insurance policy by creating an instance of the
   Policy class and allowing the user to enter the required information and be 
   presented with a unique insurance policy
*/
public class Project_Giani_Hill
{
   public static void main(String[] args)
   {
      //variables to hold user input and pass as arguments to methods
      private int polNumber;
      private int polAge;
      private double polHeight;
      private double polWeight;
      private double userBMI;
      private String providerName;
      private String polFirstName;
      private String polLastName;
      private String polSmokingStatus;
      
      //create scanner object to read user input
      Scanner key = new Scanner(System.in);
      
      //prompt the user to enter all necessary information
      System.out.print("Please enter the Policy number: ");
      polNumber = key.nextInt();
      
      System.out.print("Please enter the Provider's name: ");
      key.nextLine();
      providerName = key.nextLine();
      
      System.out.print("Please enter the Policyholder's First name: ");
      polFirstName = key.nextLine();
      
      System.out.print("Please enter the Policyholder's Last name: ");
      polLastName = key.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      polAge = key.nextInt();
      
      System.out.print("Please enter the Policyholder's Smoking status (smoker/non-smoker): ");
      key.nextLine();
      polSmokingStatus = key.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      polHeight = key.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      polWeight = key.nextDouble();
      
      //create instance of Policy class Policy1 and pass user input as arguments
      Policy Policy1 = new Policy(polNumber, providerName, polFirstName, polLastName, polAge, polSmokingStatus, polHeight, polWeight);
      
      //display all the user's entered information as well as their calculated BMI and policy price
      System.out.print("\nPolicy Number: " + Policy1.getPolicyNumber() + "\n");
      System.out.print("Provider Name: " + Policy1.getProviderName() + "\n");
      System.out.print("Policyholder's First Name: " + Policy1.getFirstName() + "\n");
      System.out.print("Policyholder's Last Name: " + Policy1.getLastName() + "\n");
      System.out.print("Policyholder's Age: " + Policy1.getAge() + "\n");
      System.out.print("Policyholder's Smoking Status: " + Policy1.getSmokeStatus() + "\n");
      System.out.print("Policyholder's Height: " + Policy1.getHeight() + " inches\n");
      System.out.print("Policyholder's Weight: " + Policy1.getWeight() + " pounds\n");
      System.out.printf("Policyholder's BMI: %.2f\n", Policy1.getBMI());
      System.out.printf("Policy Price: $%,.2f\n", Policy1.getPolicyPrice()); 
      
   }//end main
   
      
}
