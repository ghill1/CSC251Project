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
      getPolicyNumber method will retrieve the value stored under polNumber variable
   */
   public int getPolicyNumber()
   {
      return polNumber;         
   } 
   /**
      getProviderName method retrieves the name stored under providerName variable
   */
   public String getProviderName()
   {
      return providerName;
   } 
     
   public String getFirstName()
   {
      return polFirstName;
   } 
    
   public String getLastName()
   {  
      return polLastName;
   } 
     
   public int getAge()
   {
      return polAge;
   } 
     
   public String getSmokeStatus()
   {
      return polSmokingStatus;
   } 
     
   public double getHeight()
   {
      return polHeight;
   } 
    
   public double getWeight()
   {
      return polWeight;
   } 
   
   public double getBMI()     
   {
      final int SEVENHUNDREDTHREE = 703;
      userBMI = (polWeight * SEVENHUNDREDTHREE) / (polHeight * polHeight);
      return userBMI;
   }
   
   public double getPolicyPrice()
   {
      final int TWENTY = 20;
      final int THIRTYFIVE = 35;
      final int FIFTY = 50;
      final int SEVENTYFIVE = 75;
      final int HUNDRED = 100;
      double feeBMI;
      policyPrice = 600;
      
      
      if(polAge > FIFTY)
      {
         policyPrice += SEVENTYFIVE;
      }
      
      if(polSmokingStatus == "smoker" || polSmokingStatus == "Smoker")
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
