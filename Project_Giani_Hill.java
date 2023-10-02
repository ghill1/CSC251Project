import java.util.*;
import java.io.*;

/**
   this program will compute an insurance policy by creating an instance of the
   Policy class and allowing the user to enter the required information and be 
   presented with a unique insurance policy
*/
public class Project_Giani_Hill
{
   public static void main(String[] args)
   {
      try
      {
         //create instance of File class
         File file = new File("PolicyInformation.txt");
         
         //pass file as argument to Scanner constructer
         Scanner inputFile = new Scanner(file);   
            
         //decale variables
         int polNumber = 0, polAge = 0;
         double polHeight = 0.0, polWeight = 0.0, userBMI = 0.0;
         String providerName= "", polFirstName = "", polLastName = "", polSmokingStatus = "";   
         
         //create array list to store Policy objects
         ArrayList<Policy> policyList = new ArrayList<Policy>(); 
         
         while (inputFile.hasNext())
         {
         
            //read file and assign policy information to variables
            //consume newline character after nextInt() or nextdouble()
            polNumber = inputFile.nextInt();
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            polFirstName = inputFile.nextLine();
            polLastName = inputFile.nextLine();
            polAge = inputFile.nextInt();
            inputFile.nextLine();
            polSmokingStatus = inputFile.nextLine();
            polHeight = inputFile.nextDouble();
            polWeight = inputFile.nextDouble();
            
            if (inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
            //create instance of Policy class and pass variables as arguments to the Policy contructor
            //p is a reference variable for the object that is created and will be stored in an array list 
            Policy p = new Policy(polNumber, providerName, polFirstName, polLastName, polAge, polSmokingStatus, polHeight, polWeight);
            
            //add Policy objects to the ArrayList
            policyList.add(p);
         }//close while loop
         
         //close file
         inputFile.close();
         
         //use a for loop to display output
         for (int i = 0; i < policyList.size(); i++)
         {
            //display all the user's entered information as well as their calculated BMI and policy price
            System.out.print("\nPolicy Number: " + policyList.get(i).getPolicyNumber() + "\n");
            System.out.print("Provider Name: " + policyList.get(i).getProviderName() + "\n");
            System.out.print("Policyholder's First Name: " + policyList.get(i).getFirstName() + "\n");
            System.out.print("Policyholder's Last Name: " + policyList.get(i).getLastName() + "\n");
            System.out.print("Policyholder's Age: " + policyList.get(i).getAge() + "\n");
            System.out.print("Policyholder's Smoking Status: " + policyList.get(i).getSmokeStatus() + "\n");
            System.out.print("Policyholder's Height: " + policyList.get(i).getHeight() + " inches\n");
            System.out.print("Policyholder's Weight: " + policyList.get(i).getWeight() + " pounds\n");
            System.out.printf("Policyholder's BMI: %.2f\n", policyList.get(i).getBMI());
            System.out.printf("Policy Price: $%,.2f\n", policyList.get(i).getPolicyPrice()); 
         
         }//for loop ends


      }//try
      
      catch(IOException ex)//If something goes wrong, a message will be displayed explaining why
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }      

   }//end main
   
      
}
