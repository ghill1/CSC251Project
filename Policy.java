/**
   the Policy class accepts a PolicyHolder object containing the policyholder's information
   as well as the policy number and insurance provider to create an individual policy
*/
public class Policy
{
   private int polNumber; //policy number
   private double policyPrice; //price of policy with all fees included
   private String providerName; //insurance provider
   private static int instanceCount; //accumulator to track number of Policy objects created
   private PolicyHolder policyHolder; //create PolicyHolder object to copy other PolicyHolder objects
   /**
      constructor that accepts all necessary arguments 
      @param pNum policy number
      @param pName insurance provider 
      @param holder a PolicyHolder object
   */      
   public Policy(int pNum, String pName, PolicyHolder holder)
   {
      polNumber = pNum;
      providerName = pName;
      policyHolder = new PolicyHolder(holder);
      instanceCount++;//increment instanceCount to keep rack of the number of policies created
   }      
   /**
      setPolicyNumber method will change the value of polNumber
      @param pNumber policy number
   */
   public void setPolicyNumber(int pNumber)
   {
      polNumber = pNumber;
   }
   /**
      setProviderName method will change the value of providerName
      @param pName insurance provider
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   /**
      setPolicyHolder method will create a PolicyHolder object
      @param holder - a PolicyHolder object
   */
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
   /**
      getPolicyNumber method retrieves the value stored under polNumber variable
      @return polNumber policy number
   */
   public int getPolicyNumber()
   {
      return polNumber;         
   } 
   /**
      getProviderName method retrieves the name stored under providerName variable
      @return providerName name of insurance provider
   */
   public String getProviderName()
   {
      return providerName;
   } 
   /**
      getPolicyHolder method returns a reference to this policy's PolicyHolder object
      @return this policy's PolicyHolder object
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   /**
      the getPolicyPrice determines the price the policyholder will have to pay
      for policy. the base price is $600 and will be altered based on factors
      listed in the if statements below
      @returnPolicyPrice the calculated price of policy
   */
   public double getPolicyPrice()
   {
      final int TWENTY = 20;
      final int THIRTYFIVE = 35;
      final int FIFTY = 50;
      final int SEVENTYFIVE = 75;
      final int HUNDRED = 100;
      double feeBMI;
      policyPrice = 600;
      String s = "smoker";
      String S = "Smoker";
      int polAge = policyHolder.getAge(); //assign the policyholder's age to polAge
      String polSmokingStatus = policyHolder.getSmokeStatus(); //assign the policyholder's smoking status to polSmokingStatus
      double userBMI = policyHolder.getBMI(); //assign the policyholder's BMI to userBMI
      
      
      if(polAge > FIFTY)
      {
         policyPrice += SEVENTYFIVE;
      }
      
      if(polSmokingStatus.equals(s) || polSmokingStatus.equals(S))
      {
         policyPrice += HUNDRED;
      }
      
      if(userBMI > THIRTYFIVE)
      {
         feeBMI = (userBMI - THIRTYFIVE) * TWENTY;
         policyPrice += feeBMI;
      }
      return policyPrice;  
   }
   /**
      the getInstanceCount method returns the number of instances of
      the Policy class that was created
      @return the number of instances created
   */
   public static int getInstanceCount()
   {
      return instanceCount;
   }
   /**
      the toString method will return a string containing all Policyholder's information
      as well as the policy number, insurance provider and policy price
      @return - a string containing all poilcy information
   */
   public String toString()
   {
      return String.format("Policy Number: " + polNumber +
                           "\nProvider Name: " + providerName +
                           "\n" + policyHolder.toString() +
                           "\nPolicyholder's BMI: %.2f" +
                           "\nPolicy Price: $%.2f",policyHolder.getBMI(), getPolicyPrice());
   }
}
