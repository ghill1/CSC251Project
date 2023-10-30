/**
   the Policy class accepts a policyholder's information and creates an individual insurance policy
   displaying the information entered as well as the policyholder's BMI and price of their policy
*/
public class Policy
{
   private int polNumber; //policy number
   private double policyPrice; //price of policy with all fees included
   private String providerName; //insurance provider
   
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
   /*
      the toString method will return a string containing all Policyholder's information
      as well as the policy number, insurance provider and policy price
      @return - a string containing all poilcy information
   */
   public String toString()
   {
      return String.format("Policy Number:" + polNumber +
                           "\nProvider Name:" + providerName +
                           "\n" + policyHolder.toString +
                           "\n" + policyHolder.getBMI() +
                           "\nPolicy Price:$ %.2f", getPolicyPrice());
   }
}
