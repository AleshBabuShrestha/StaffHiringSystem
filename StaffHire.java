
/**
 * The StaffHire class has three attributes, which correspond to the Vacancy
   number, Designation and Job Type
 *
 * @author Alesh Babu Shrestha
 * @version 0.1
 */
public class StaffHire{
    //declaring instance variables
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //making the constructor
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber=vacancyNumber;
        this.designation=designation;
        this.jobType=jobType;
    }//accessor methods for all the attributes 
    public String getDesignation(){
        return this.designation;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
        public int getVacancyNumber(){
        return this.vacancyNumber;
    }
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber=vacancyNumber;
    }    
    public String getJobType(){
        return this.jobType;
    }
    public void setJobType(String jobType){
        this.jobType=jobType;
    }//display method to display information on vacancy
    public void displayDetails(){
        System.out.println("The vacancy number is "+vacancyNumber);
        System.out.println("The job type is "+jobType);
        System.out.println("The designation is "+designation);
    }
}
       
   

    

    
