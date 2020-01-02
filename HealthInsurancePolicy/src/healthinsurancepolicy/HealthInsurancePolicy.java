//Sabrina Turney
//COP2800 - January 28 2019
//Week Three Program
//This program creates classes based on Health Insurance Policies,
//and gets and sets methods, as well as a test application.

package healthinsurancepolicy;
//Here is where the HealthInsurancePolicyTest will get values from.

public class HealthInsurancePolicy {
    // Class that represents a health insurance policy.

    private int PolicyNumber; // Policy account number
    private String Insurer; // Health Insurer
    private String InsuredName; // Name of Insured on Policy
    private int Age; // Age of Insured
    private String Sex; // Sex of Insured
    private String State; // State InsuredName lives in
    private int Dependents; // num of dependents on Policy
    //initializing variables privately within the class for sets/gets.

    public HealthInsurancePolicy() {
       new HealthInsurancePolicy(0, "", "", 0, "", "", 0);
    }
//Public class creating blank Health Insurance Holders passing arguments.
    
    
    // constructor
    public HealthInsurancePolicy(int PolicyNumber, String Insurer
            , String InsuredName, int Age, String Sex, String State
            , int Dependents){
        this.PolicyNumber = PolicyNumber;
        this.Insurer = Insurer;
        this.InsuredName = InsuredName;
        this.Age = Age;
        this.Sex = Sex;
        this.State = State;
        this.Dependents = Dependents;
    }

    // sets the Policy Number
    public void setPolicyNumber(int PolicyNumber) {
        this.PolicyNumber = PolicyNumber;
    }
    // returns (gets) the Policy Number
    public int getPolicyNumber() {
        return PolicyNumber;
    }

    // sets the Insurer
    public void setInsurer(String Insurer) {
        this.Insurer = Insurer;
    }
    // returns (gets) the Insurer
    public String getInsurer() {
        return Insurer;
    }

    // sets the Insured Name on the policy
    public void setInsuredName(String InsuredName) {
        this.InsuredName = InsuredName;
    }
    // returns (gets) the Insured Name on the policy
    public String getInsuredName() {
        return InsuredName;
    }
    
    // sets Age on policy
    public void setAge(int Age){
        this.Age = Age;
    }
    // gets age on policy
    public int getAge(){
        return Age;
    }
    
    // sets Sex on policy
    public void setSex(String Sex){
        this.Sex = Sex;
    }
    // gets Sex on policy
    public String getSex(){
        return Sex;
    }

    //sets State on Policy
    public void setState(String State){
       this.State = State; 
    }
    // gets State on Policy
    public String getState(){
        return State;
    }
    
    // sets dependents on policy
    public void setDependents(int Dependents){
        this.Dependents = Dependents;
    }
    // gets dependen3ts on policy
    public int getDependents(){
        return Dependents;
    }
    
    // predicate method returns whether the state is a mandatory insurance state
    public boolean isMandatoryInsuranceState() {
        boolean MandatoryInsuranceState;
        
        // determine whether state has Mandatory Insurance
        switch (getState()) {
        // get HealthInsurancePolicy object's state abbreviation
            case "DC":
            case "MA":
            case "NJ":
            case "VT":
                MandatoryInsuranceState = true;
                break;
            default:
                MandatoryInsuranceState = false;
                break;
        }

        return MandatoryInsuranceState;
    }
    

    public void printInfo() {
        System.out.println("Welcome, " + getInsuredName() + ".");
        System.out.println("Your Policy Number is: " + getPolicyNumber());
        System.out.println("provided to you through " + getInsurer() + "."); 
        System.out.println("We have your information as follows: ");
        System.out.println("\nAge: " + getAge() + " \nSex: " + getSex());
        System.out.println( "\nNumber of Dependents: " + getDependents());
        System.out.println( "\nYou live in: " + getState() + ", so if you ");
        System.out.println("believe you're in a mandatory insurance state, ");
        System.out.println("you would be: " + isMandatoryInsuranceState() + ".");
        System.out.println("This concludes your policy information. Thank you!");
        System.out.println("\n------------------------------------------------\n");
    }
}