import java.util.*;
import java.io.*;

/**
   this program will compute Insurance Policies by reading each person's information and
   making an individual poilicy for each person, displaying each individual policy at the 
   end of the program as well as the number of policies created,the number of smokers and 
   the numbers non-smokers 
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
         int polNumber = 0, polAge = 0, sCount = 0, nsCount = 0;
         double polHeight = 0.0, polWeight = 0.0, userBMI = 0.0;
         String providerName= "", polFirstName = "", polLastName = "", polSmokingStatus = "";   
         String s = "smoker", S = "Smoker", ns = "non-smoker";
         
         //create array list to store Policy objects
         ArrayList<Policy> policyList = new ArrayList<Policy>(); 
         
         //open while loop to read information until all lines are read
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
            
            //clear buffer to continue reading the next line
            if (inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            //use if statement to increment smoker/non-smoker count
            if (polSmokingStatus.equals(s) || polSmokingStatus.equals(S))
               sCount++;
            if (polSmokingStatus.equals(ns))
               nsCount++;   
            
            //create PolicyHolder object and store Policyholder's information
            PolicyHolder policy = new PolicyHolder(polFirstName, polLastName, polAge, polSmokingStatus, polHeight, polWeight);
         
            //create a policy object to store the Policyholder's information as well as the policy number and insurance provider
            //p is a reference variable for the object that is created and will be stored in an array list 
            Policy p = new Policy(polNumber, providerName, policy);
            
            //add Policy objects to the ArrayList
            policyList.add(p);
         }//close while loop
         
         //close file
         inputFile.close();
         
         //use a for loop to display output
         for (int i = 0; i < policyList.size(); i++)
         {
            System.out.println(policyList.get(i));
            System.out.println();    
         }//for loop ends
         
         //display number of Policy objects created
         System.out.println("There were " + Policy.getInstanceCount() + 
                            " Policy objects created.");
         
         //display ammount of policies for smokers and non-smokers
         System.out.print("\nThe number of policies with a smoker is: " + sCount + "\n");
         System.out.print("The number of policies with a non-smoker is: " +nsCount + "\n");

      }//close try
      
      catch(IOException ex)//If something goes wrong, a message will be displayed explaining why
      {
         //use the getMessage method to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }      

   }//end main
   
      
}
