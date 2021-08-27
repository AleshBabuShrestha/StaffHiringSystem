
/**
 * The PartTimeStaffHire class is also a subclass of the StaffHire class and it has
   nine attributes: workingHour, wagesPerHour, staffName, joiningDate, qualification, appointedBy, shifts, joined and terminated.
 *
 * @author Alesh Babu Shrestha
 * @version 0.1
 */
public class PartTimeStaffHire extends StaffHire{//extending to the superclass
    //declaring instance variables
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    //making the constructor
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){       
        //calling superclass constructor parameters
        super(vacancyNumber,designation,jobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    //making get methods for all attributes
    public int getWorkingHour(){
        return this.workingHour;
    }
    public int getWagesPerHour(){
        return this.wagesPerHour;
    }
    public String getStaffName(){
        return this.staffName;
    }
    public String getJoiningDate(){
        return this.joiningDate;
    }
    public String getQualification(){
        return this.qualification;
    }
    public String getAppointedBy(){
        return this.appointedBy;
    }
    public boolean getJoined(){
        return this.joined;
    }
    public boolean getTerminated(){
        return this.terminated;
    }
    public String getShifts(){
        return this.shifts;
    }
    //using setter method for shifts
    public void setShifts(String shifts){
        //if-else statement to check if staff has already been hired or not 
        if(joined==true){//if statement to display suitable message if staff has already been hired
           System.out.println("Staff has already been appointed so shift cannot be changed.");
        }else{//else statement to assign new value to shift attribute if staff has not been hired yet
            this.shifts=shifts;
        }
    }
    //method to hire part time staff for the organization 
    public void hirePartTime(String staffName, String joiningDate, String qualification, String appointedBy){
        //if-else statement to check if part time staff has already been hired or not
        if(joined==true){//if statement to display suitable message if staff has already been hired
            System.out.println(this.staffName+" was already hired on "+this.joiningDate);
        }else{//else statement to update various attributes if the staff hasn't been hired yet
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
            System.out.println(staffName+" has been hired.");
            System.out.println("        ------        ");
        }
    }
    //method used for termination of staff
    public void termination(){
        //if-else statement to check if staff has already been terminated or not
        if(terminated==true){//if statement to display suitable message if staff has already been terminated
            System.out.println("The staff has already  been terminated.");
            System.out.println("        ------        ");
        }
        else{//else statement to remove values from various attributes to terminate the staff
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;  
            System.out.println("The staff has been terminated");
            System.out.println("        ------        ");
        }
    }
    //display method to display information on the part time staff hired or for the still vacant position
    public void displayDetails(){
        //calling superclass display method
        super.displayDetails();
        System.out.println("        ------        ");
        //if-else statement to display required information when staff has been hired and when not   
        if(joined==true){//if statement to display information of hired part time staff
        System.out.println("Name of staff appointed: "+staffName);
        System.out.println("Wages Per Hour: "+wagesPerHour);
        System.out.println("Working Hour: "+workingHour);
        System.out.println("Joining Date: "+joiningDate);
        System.out.println("Qualification: "+qualification);
        System.out.println("Appointed By: "+appointedBy);
        System.out.println("Income Per Day: "+wagesPerHour*workingHour);
        System.out.println("--------------------------------------------------");
        }        
        else{//else statement to display vacancy of position
        System.out.println("This position is still vacant.");
        System.out.println("        ------        ");
        }
    }
}


            
            

        
    

