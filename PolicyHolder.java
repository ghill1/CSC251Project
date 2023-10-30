public class PolicyHolder
{
   private int polAge;  //policyholder's age
   private double polHeight; //policyholder's height
   private double polWeight; //policyholder's weight
   private double userBMI; //policyholder's BMI (body mass index)
   private String polFirstName; //policyholder's first name
   private String polLastName; //policyholder's last name
   private String polSmokingStatus; //policyholder's smoking status
   
   //no-arg constructor, sets all fields to default value
   public PolicyHolder()
   {  
      polAge = 0;
      polHeight = 0;
      polWeight = 0;
      polFirstName = " ";
      polLastName = " ";
      polSmokingStatus = " ";
   }   
   /**
      constructor that accepts all necessary arguments 
      @param fName policyholder's first name
      @param lName policyholder's last name
      @param pAge policyholder's age
      @param smokeStatus policyholder's smoking status
      @param pHeight policyholder's height
      @param pWeight policyholder's weight
   */      
   public PolicyHolder(String fName,String lName,int pAge,String smokeStatus, double pHeight, double pWeight)
   {
      polFirstName = fName;
      polLastName = lName;
      polAge = pAge;
      polSmokingStatus = smokeStatus;
      polHeight = pHeight;
      polWeight = pWeight; 
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
   
}