/**
   the Policy class accepts a policyholder's information and creates an individual insurance policy
   displaying the information entered as well as the policyholder's BMI and price of their policy
*/
public class Policy
{
   private int polNumber; //policy number
   private int polAge;  //policyholder's age
   private double polHeight; //policyholder's height
   private double polWeight; //policyholder's weight
   private double userBMI; //policyholder's BMI (body mass index)
   private double policyPrice; //price of policy with all fees included
   private String providerName; //insurance provider
   private String polFirstName; //policyholder's first name
   private String polLastName; //policyholder's last name
   private String polSmokingStatus; //policyholder's smoking status
   
   //no-arg constructor, sets all fields to default value
   public Policy()
   {  
      polNumber = 0;
      polAge = 0;
      polHeight = 0;
      polWeight = 0;
      providerName = " ";
      polFirstName = " ";
      polLastName = " ";
      polSmokingStatus = " ";
   }   
   /**
      constructor that accepts all necessary arguments 
      @param pNum policy number
      @param pName insurance provider 
      @param fName policyholder's first name
      @param lName policyholder's last name
      @param pAge policyholder's age
      @param smokeStatus policyholder's smoking status
      @param pHeight policyholder's height
      @param pWeight policyholder's weight
   */      
   public Policy(int pNum, String pName, String fName,String lName,int pAge,String smokeStatus, double pHeight, double pWeight)
   {
      polNumber = pNum;
      providerName = pName;
      polFirstName = fName;
      polLastName = lName;
      polAge = pAge;
      polSmokingStatus = smokeStatus;
      polHeight = pHeight;
      polWeight = pWeight; 
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
      setFirstName method will change the value of polFirstName
      @param fName policyholder's first name
   */ 
   public void setFirstName(String fName)
   {
      polFirstName = fName;
   }
   /**
      setLastName method will change the value of polLastName
      @param lName policyholder's last name
   */
   public void setLastName(String lName)
   {
      polLastName = lName;
   }
   /**
      setAge method will change the value of polAge
      @param pAge
   */ 
   public void setAge(int pAge)
   {
      polAge = pAge;
   }
   /**
      setSmokingStatus method will change the policyholder's smoking status
      @param smokeStatus
   */
   public void setSmokingStatus(String smokeStatus)
   {
      polSmokingStatus = smokeStatus;
   }
   /**
      setHeight method will change the value of polHeight
      @param pHeight policyholder's height
   */
   public void setHeight(double pHeight)
   {
      polHeight = pHeight;
   }
   /**
      setWeight method will change the value of polWeight
      @param pWeight policyholder's weight
   */
   public void setWeight(double pWeight)
   {
      polWeight = pWeight;
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
      the getFirstName method retrieves the policyholder's first name
      @return polFirstName
   */
   public String getFirstName()
   {
      return polFirstName;
   } 
   /**
      the getLastName method retrieves the policyholder's last name
      @return polLastName
   */
   public String getLastName()
   {  
      return polLastName;
   } 
   /**
      the getAge method retrieves the policyholder's age
      @return polAge the policyholder's age
   */
   public int getAge()
   {
      return polAge;
   } 
   /**
      the getSmokeStatus method retrieves the policyholder's smoking status
      @return polSmokingStatus policyholder's smoking status
   */   
   public String getSmokeStatus()
   {
      return polSmokingStatus;
   } 
   /**
      the getheight method retrieves the policyholder's height
      @return polHeight the policyholder's height
   */
   public double getHeight()
   {
      return polHeight;
   } 
   /**
      the getWeight method retrieves the policyholder's weight
      @return polWeight the policyholder's weight
   */
   public double getWeight()
   {
      return polWeight;
   } 
   /**
      the getBMI method uses the formula below to calculate the
      policyholder's BMI and return the value
      @return userBMI the policyholder's BMI
   */
   public double getBMI()     
   {
      final int SEVENHUNDREDTHREE = 703;
      userBMI = (polWeight * SEVENHUNDREDTHREE) / (polHeight * polHeight);
      return userBMI;
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
}
