//Sabrina Turney
//COP2800 - January 28 2019
//Week Three Program
//This program creates classes based on Health Insurance Policies,
//and gets and sets methods, as well as a test application.

package healthinsurancepolicy;
//Because this test is part of the health insurance policy project, it will
//call methods from here.

public class HealthInsurancePolicyTest {
 public static void main(String[] args) {
     
    //first I print out an introduction for a happy program that's easily 
    //understood by the user.
    System.out.println("Welcome to my Health Insurance Policy Program!");
    System.out.println("I'll display the Policy Holders Information using "
            + "the information I have from the Policies.");
    
    //Here are some Policy Holders and their corresponding values:
    HealthInsurancePolicy Policy1 = new HealthInsurancePolicy(519, "Progressive", "Garrett Bailey", 17, "Male", "FL", 0);
    HealthInsurancePolicy Policy2 = new HealthInsurancePolicy(201, "Liberty Mutual", "Ali Rubah", 45, "Male", "NJ", 4);
    HealthInsurancePolicy Policy3 = new HealthInsurancePolicy(852, "Travelers", "Sabrina Turney", 21, "Female", "VT", 0);
    HealthInsurancePolicy Policy4 = new HealthInsurancePolicy(4201, "AllState", "Melissa Dawn", 42, "Female", "CT", 3);
    
    //I print out the info for each policy here, for the user to see
    //displayed on their screen.
    Policy1.printInfo();
    Policy2.printInfo();
    Policy3.printInfo();
    Policy4.printInfo();
    
    
    System.out.println("Thank you for using my program!");
    System.out.println("Goodbye!");
 }
}
