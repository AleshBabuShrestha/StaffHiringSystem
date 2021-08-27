 

/**
 * The FullTimeStaffHire class is a subclass of the StaffHire class and has seven
   attributes: salary, workingHour, staffName, joiningDate, qualification, appointedBy and joined.
 *
 * @author Alesh Babu Shrestha
 * @version 0.1
 */
public class FullTimeStaffHire extends StaffHire{//extending to the superclass
    //declaring instance variables
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //making the constructor
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary,int workingHour){
        //calling superclass constructor parameters
        super(vacancyNumber,designation,jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    //making get methods for all attributes
    public int getSalary(){
        return salary;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public String getStaffName(){
        return staffName;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getQualification(){
        return qualification;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public boolean getJoined(){
        return joined;
    }
    //using setter method for salary
    public void setSalary(int salary){
        //if-else statement to check if staff has already been hired or not
        if(joined==true){//if statement to display suitable message if staff has already been hired
            System.out.println("Staff has already been appointed so salary cannot be changed.");
        }else{//else statement to assign new value to salary attribute if staff has not been hired yet
            this.salary=salary;
        }
    }
    //using setter method for workingHour
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }
    //method to hire full time staff for the organization
    public void hireFullTime(String staffName, String joiningDate, String qualification, String appointedBy){
        //if-else statement to check if full time staff has already been hired or not
        if(joined==true){//if statement to display suitable message if staff has already been hired
            System.out.println(this.staffName+" was already hired on "+this.joiningDate);
        }else{//else statement to update various attributes if the staff hasn't been hired yet
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            System.out.println(staffName+" has been hired.");
            System.out.println("        ------        ");
        }
    }
    //display method to display information on the full time staff hired or for the still vacant position
    public void displayDetails(){
        //calling superclass display method
        super.displayDetails();
        System.out.println("        ------        ");
        //if-else statement to display required information when staff has been hired and when not
        if(joined==true){//if statement to display information of hired full time staff
        System.out.println("Name of staff appointed: "+staffName);
        System.out.println("Salary: "+salary);
        System.out.println("Working Hour: "+workingHour);
        System.out.println("Joining Date: "+joiningDate);
        System.out.println("Qualification: "+qualification);
        System.out.println("Appointed By: "+appointedBy);
        System.out.println("--------------------------------------------------");
        }else{//else statement to display vacancy of position
        System.out.println("This position is still vacant.");
        System.out.println("        ------        ");
    }
    }
}

    

        
    
    

    
    
