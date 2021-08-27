
/**
 * Write a description of class TheINGNepal here.
 *
 * @author Alesh Babu Shrestha
 * @version 0.1
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class INGNepal implements ActionListener{
    JFrame frm;
    JPanel pnlFullTimeStaffHire,pnlPartTimeStaffHire;
    JLabel lblFullTimeStaffHire,lblPartTimeStaffHire,lblVacancyNumber1,lblVacancyNumber2,lblVacancyNumber3,lblVacancyNumber4,lblVacancyNumber5,lblDesignation1,lblDesignation2,lblSalary,lblJobType1,lblJobType2,lblWorkingHour1,lblWorkingHour2,lblStaffName1,lblStaffName2,lblQualification1,lblQualification2,lblJoiningDate1,lblJoiningDate2,lblAppointedBy1,lblAppointedBy2,lblShifts,lblWagesPerHour,lblTermination;
    JTextField txtVacancyNumber1,txtVacancyNumber2,txtVacancyNumber3,txtVacancyNumber4,txtVacancyNumber5,txtDesignation1,txtDesignation2,txtSalary,txtWorkingHour1,txtWorkingHour2,txtQualification1,txtQualification2,txtJoiningDate1,txtJoiningDate2,txtAppointedBy1,txtAppointedBy2,txtStaffName1,txtStaffName2,txtShifts,txtWagesPerHour;
    JComboBox cmbJobType1,cmbJobType2;
    JButton btnVacancy1,btnVacancy2,btnAppoint1,btnAppoint2,btnTermination,btnDisplayDetails1,btnDisplayDetails2,btnClear;
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();
    public static void main(String[]args){
        INGNepal  obj= new INGNepal();
        obj.INGNepal();
    }    
    public void INGNepal(){
        frm=new JFrame("TheINGNepal");
        Container container=frm.getContentPane();
        frm.setLayout(null);
        frm.setVisible(true);
        
        pnlFullTimeStaffHire=new JPanel();
        pnlFullTimeStaffHire.setBounds(25,25,625,565);
        
        container.add(pnlFullTimeStaffHire);
        pnlFullTimeStaffHire.setLayout(null);
                   
        pnlPartTimeStaffHire=new JPanel();
        pnlPartTimeStaffHire.setBounds(625,25,625,565);
        pnlFullTimeStaffHire.setBackground(Color.WHITE);
        
        container.add(pnlPartTimeStaffHire);
        pnlPartTimeStaffHire.setLayout(null);
        pnlPartTimeStaffHire.setBackground(Color.WHITE);
            
        pnlFullTimeStaffHire.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        pnlPartTimeStaffHire.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
           
        lblFullTimeStaffHire=new JLabel("FullTimeStaffHire");
        lblFullTimeStaffHire.setFont(new Font("Century Gothic",Font.BOLD,30));
        lblFullTimeStaffHire.setForeground(Color.BLACK);
        lblFullTimeStaffHire.setBounds(200,10,400,30);
        pnlFullTimeStaffHire.add(lblFullTimeStaffHire);
            
        lblVacancyNumber1=new JLabel("Vacancy number:");
        lblVacancyNumber1.setBounds(35,80,100,25);
        pnlFullTimeStaffHire.add(lblVacancyNumber1);
        txtVacancyNumber1=new JTextField();
        txtVacancyNumber1.setBounds(135,80,140,25);
        pnlFullTimeStaffHire.add(txtVacancyNumber1);                   
            
        lblDesignation1=new JLabel("Designation:");
        lblDesignation1.setBounds(35,120,100,25);
        pnlFullTimeStaffHire.add(lblDesignation1);
        txtDesignation1=new JTextField();
        txtDesignation1.setBounds(135,120,140,25);
        pnlFullTimeStaffHire.add(txtDesignation1);
                    
        lblJobType1=new JLabel("Job Type:");
        lblJobType1.setBounds(35,160,100,25);
        pnlFullTimeStaffHire.add(lblJobType1);
        String jobType1[]={"Full Time","Part Time"};
        cmbJobType1=new JComboBox(jobType1);
        cmbJobType1.setBounds(135,160,140,25);
        pnlFullTimeStaffHire.add(cmbJobType1);
        
        lblSalary=new JLabel("Salary:");
        lblSalary.setBounds(350,80,100,25);
        pnlFullTimeStaffHire.add(lblSalary);
        txtSalary=new JTextField();
        txtSalary.setBounds(435,80,150,25);
        pnlFullTimeStaffHire.add(txtSalary);
            
        lblWorkingHour1=new JLabel("Working Hour:");
        lblWorkingHour1.setBounds(350,120,100,25);
        pnlFullTimeStaffHire.add(lblWorkingHour1);
        txtWorkingHour1=new JTextField();
        txtWorkingHour1.setBounds(435,120,150,25);
        pnlFullTimeStaffHire.add(txtWorkingHour1);
            
        btnVacancy1=new JButton("ADD");
        btnVacancy1.setBounds(435,200,150,30);
        btnVacancy1.addActionListener(this);
        pnlFullTimeStaffHire.add(btnVacancy1);
        
        lblVacancyNumber2=new JLabel("Vacancy number:");
        lblVacancyNumber2.setBounds(35,320,100,25);
        pnlFullTimeStaffHire.add(lblVacancyNumber2);
        txtVacancyNumber2=new JTextField();
        txtVacancyNumber2.setBounds(135,320,140,25);
        pnlFullTimeStaffHire.add(txtVacancyNumber2);                                
            
        lblJoiningDate1=new JLabel("Joining Date:");
        lblJoiningDate1.setBounds(35,360,100,25);
        pnlFullTimeStaffHire.add(lblJoiningDate1);
        txtJoiningDate1=new JTextField();
        txtJoiningDate1.setBounds(135,360,140,25);
        pnlFullTimeStaffHire.add(txtJoiningDate1);
        
        lblStaffName1=new JLabel("Staff Name:");
        lblStaffName1.setBounds(35,400,150,25);
        pnlFullTimeStaffHire.add(lblStaffName1);
        txtStaffName1=new JTextField();
        txtStaffName1.setBounds(135,400,140,25);
        pnlFullTimeStaffHire.add(txtStaffName1);
            
        lblQualification1=new JLabel("Qualification:");
        lblQualification1.setBounds(350,320,100,25);
        pnlFullTimeStaffHire.add(lblQualification1);
        txtQualification1=  new JTextField();
        txtQualification1.setBounds(435,320,150,25);
        pnlFullTimeStaffHire.add(txtQualification1);
            
        lblAppointedBy1=new JLabel("Appointed By:");
        lblAppointedBy1.setBounds(350,360,100,25);
        pnlFullTimeStaffHire.add(lblAppointedBy1);
        txtAppointedBy1=new JTextField();
        txtAppointedBy1.setBounds(435,360,150,25);
        pnlFullTimeStaffHire.add(txtAppointedBy1);                    
               
        btnAppoint1=new JButton("APPOINT");
        btnAppoint1.setBounds(435,400,150,30);
        btnAppoint1.addActionListener(this);
        pnlFullTimeStaffHire.add(btnAppoint1); 
        
        btnDisplayDetails1=new JButton("DISPLAY");
        btnDisplayDetails1.setBounds(435,480,150,30);
        btnDisplayDetails1.addActionListener(this);
        pnlFullTimeStaffHire.add(btnDisplayDetails1);
            
        frm.setVisible(true);
        frm.setSize(1300,650);
        frm.setLayout(null);
            
        lblPartTimeStaffHire=new JLabel("PartTimeStaffHire");
        lblPartTimeStaffHire.setFont(new Font("Century Gothic",Font.BOLD,30));
        lblPartTimeStaffHire.setForeground(Color.BLACK);
        lblPartTimeStaffHire.setBounds(200,10,300,30);
        pnlPartTimeStaffHire.add(lblPartTimeStaffHire);
                
        lblVacancyNumber3=new JLabel("Vacancy Number:");
        lblVacancyNumber3.setBounds(50,80,100,25);
        pnlPartTimeStaffHire.add(lblVacancyNumber3);
        txtVacancyNumber3=new JTextField();
        txtVacancyNumber3.setBounds(155,80,140,25);
        pnlPartTimeStaffHire.add(txtVacancyNumber3);
        
        lblDesignation2=new JLabel("Designation:");
        lblDesignation2.setBounds(50,120,100,25);
        pnlPartTimeStaffHire.add(lblDesignation2);
        txtDesignation2=new JTextField();
        txtDesignation2.setBounds(155,120,140,25);
        pnlPartTimeStaffHire.add(txtDesignation2);
            
        lblJobType2=new JLabel("Job Type:");
        lblJobType2.setBounds(50,160,100,25);
        pnlPartTimeStaffHire.add(lblJobType2);
        String jobType2[]={"Part Time", "Full Time"};
        cmbJobType2=new JComboBox(jobType2);
        cmbJobType2.setBounds(155,160,140,25);
        pnlPartTimeStaffHire.add(cmbJobType2);
        
        lblWorkingHour2=new JLabel("WorkingHour:");
        lblWorkingHour2.setBounds(350,80,100,25);
        pnlPartTimeStaffHire.add(lblWorkingHour2);
        txtWorkingHour2=new JTextField();
        txtWorkingHour2.setBounds(450,80,150,25);
        pnlPartTimeStaffHire.add(txtWorkingHour2);
                                    
        lblWagesPerHour=new JLabel("Wages Per Hour:");
        lblWagesPerHour.setBounds(350,120,100,25);
        pnlPartTimeStaffHire.add(lblWagesPerHour);
        txtWagesPerHour=new JTextField();
        txtWagesPerHour.setBounds(450,120,150,25);
        pnlPartTimeStaffHire.add(txtWagesPerHour);                    
            
        lblShifts=new JLabel("Shifts:");
        lblShifts.setBounds(350,160,100,25);
        pnlPartTimeStaffHire.add(lblShifts);
        txtShifts=new JTextField();
        txtShifts.setBounds(450,160,150,25);
        pnlPartTimeStaffHire.add(txtShifts);
            
        btnVacancy2=new JButton("ADD");
        btnVacancy2.setBounds(450,200,150,30);
        btnVacancy2.addActionListener(this);
        pnlPartTimeStaffHire.add(btnVacancy2); 
        
        lblVacancyNumber4=new JLabel("Vacancy number:");
        lblVacancyNumber4.setBounds(50,320,100,25);
        pnlPartTimeStaffHire.add(lblVacancyNumber4);
        txtVacancyNumber4=new JTextField();
        txtVacancyNumber4.setBounds(155,320,140,25);
        pnlPartTimeStaffHire.add(txtVacancyNumber4);
        
        lblJoiningDate2=new JLabel("Joining Date:");
        lblJoiningDate2.setBounds(50,360,100,25);
        pnlPartTimeStaffHire.add(lblJoiningDate2);
        txtJoiningDate2=new JTextField();
        txtJoiningDate2.setBounds(155,360,140,25);
        pnlPartTimeStaffHire.add(txtJoiningDate2);
            
        lblStaffName2=new JLabel("Staff Name:");
        lblStaffName2.setBounds(50,400,150,25);
        pnlPartTimeStaffHire.add(lblStaffName2);
        txtStaffName2=new JTextField();
        txtStaffName2.setBounds(155,400,140,25);
        pnlPartTimeStaffHire.add(txtStaffName2);                                        
            
        lblQualification2=new JLabel("Qualification:");
        lblQualification2.setBounds(350,320,100,25);
        pnlPartTimeStaffHire.add(lblQualification2);
        txtQualification2=new JTextField();
        txtQualification2.setBounds(435,320,150,25);
        pnlPartTimeStaffHire.add(txtQualification2);
            
        lblAppointedBy2=new JLabel("Appointed By:");
        lblAppointedBy2.setBounds(350,360,100,25);
        pnlPartTimeStaffHire.add(lblAppointedBy2);
        txtAppointedBy2=new JTextField();
        txtAppointedBy2.setBounds(435,360,150,25);
        pnlPartTimeStaffHire.add(txtAppointedBy2);
        
        lblTermination=new JLabel("Termination of Part Time Staff");
        lblTermination.setFont(new Font("Century Gothic",Font.BOLD,20));
        lblTermination.setForeground(Color.BLACK);
        lblTermination.setBounds(50,435,300,30);
        pnlPartTimeStaffHire.add(lblTermination);
                       
        lblVacancyNumber5=new JLabel("Vacancy number:");
        lblVacancyNumber5.setBounds(50,470,100,25);
        pnlPartTimeStaffHire.add(lblVacancyNumber5);
        txtVacancyNumber5=new JTextField();
        txtVacancyNumber5.setBounds(155,470,140,25);
        pnlPartTimeStaffHire.add(txtVacancyNumber5);                                   
                           
        btnTermination=new JButton("TERMINATE");
        btnTermination.setBounds(50,500,150,30);
        btnTermination.addActionListener(this);
        pnlPartTimeStaffHire.add(btnTermination);  
        
        btnAppoint2=new JButton("APPOINT");
        btnAppoint2.setBounds(435,400,150,30);
        btnAppoint2.addActionListener(this);
        pnlPartTimeStaffHire.add(btnAppoint2);
            
        btnDisplayDetails2=new JButton("DISPLAY ");
        btnDisplayDetails2.setBounds(435,480,150,30);
        btnDisplayDetails2.addActionListener(this);
        pnlPartTimeStaffHire.add(btnDisplayDetails2);
                       
        btnClear=new JButton("CLEAR ALL");
        btnClear.setBounds(435,520,150,30);
        btnClear.addActionListener(this);
        pnlPartTimeStaffHire.add(btnClear);
                        
        frm.setVisible(true);
        frm.setSize(1300,650);
        frm.setLayout(null);
    }    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnVacancy1){   
               if(txtVacancyNumber1.getText().isEmpty() || txtSalary.getText().isEmpty() || txtDesignation1.getText().isEmpty() || txtWorkingHour1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frm, "Please fill up all the necessary fields.");
               }
               else{
                    try{
                        int vacancyNumber = Integer.parseInt(txtVacancyNumber1.getText());
                        String designation = txtDesignation1.getText();
                        String jobType= cmbJobType1.getSelectedItem().toString();
                        int salary = Integer.parseInt(txtSalary.getText());
                        int workingHour = Integer.parseInt(txtWorkingHour1.getText());
                        boolean isDuplicate =false;
                        for (StaffHire item : list) {
                            if(item.getVacancyNumber()==vacancyNumber) {
                                if(item instanceof FullTimeStaffHire){
                                    isDuplicate=true;
                                    break;
                                }
                             }
                        }
                        if(Integer.parseInt(txtWorkingHour1.getText())>12){ 
                            JOptionPane.showMessageDialog(frm,"Error: Working hour cannot exceed 12 hours.");                  
                        }                 
                        if(Integer.parseInt(txtWorkingHour1.getText())<= 0) { 
                            JOptionPane.showMessageDialog(frm,"Error: Working hour cannot have negative or null values."); 
                        } 
                        if(Integer.parseInt(txtSalary.getText())<= 0) { 
                            JOptionPane.showMessageDialog(frm,"Error: Salary cannot have negative or null values."); 
                        }                  
                        if(isDuplicate==false){
                            FullTimeStaffHire obj= new FullTimeStaffHire(vacancyNumber, designation, jobType,salary,workingHour);
                            list.add(obj);
                            JOptionPane.showMessageDialog(frm,"A new vacant position is now available.");
                        }
                        
                        else{
                             JOptionPane.showMessageDialog(frm,"The vacant position already exists.");                                     
                        }
                    }
                    catch(Exception exp){
                        JOptionPane.showMessageDialog(frm,"Invalid entry has been detected.");
                    } 
               }
        }
        if(e.getSource() == btnAppoint1){
            if(txtStaffName1.getText().isEmpty() || txtJoiningDate1.getText().isEmpty() || txtVacancyNumber2.getText().isEmpty() || txtQualification1.getText().isEmpty() || txtAppointedBy1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frm, "Please fill up all the necessary fields.");
            }
            else{
                try{
                    String StaffName = txtStaffName1 .getText();
                    String JoiningDate = (txtJoiningDate1.getText());
                    int VacancyNumber =Integer.parseInt(txtVacancyNumber2.getText());
                    String Qualification = txtQualification1.getText();
                    String AppointedBy = txtAppointedBy1.getText();
                    int count=1;
                    for(StaffHire obj:list){
                        if(obj.getVacancyNumber()==VacancyNumber){
                            if(obj instanceof FullTimeStaffHire){
                                FullTimeStaffHire f=(FullTimeStaffHire)obj;
                                if(f.getJoined()==true){
                                    JOptionPane.showMessageDialog(frm,"Staff has already been hired.");
                                    break;
                                }
                                else
                                {
                                    f.hireFullTime(StaffName,JoiningDate,Qualification,AppointedBy);
                                    String name=txtStaffName1.getText();
                                    JOptionPane.showMessageDialog(frm,name+" has been appointed successfully.");
                                    break;
                                }
                            }
                            else
                            {
                                if(count==list.size())
                                  {
                                      JOptionPane.showMessageDialog(frm,"The entered vacancy is unavailable.");
                                      break;
                                    }
                            }
                        }
                        else
                        {
                            if(count==list.size())
                            {
                             JOptionPane.showMessageDialog(frm,"The entered vacancy number does not exist.");
                             break;
                             }
                        }
                        count++;
                    }
                }
                catch(Exception exp){
                    JOptionPane.showMessageDialog(frm,"Invalid entry has been detected.");
                } 
            }
        } 
        if(e.getSource() == btnVacancy2){
            if(txtVacancyNumber3.getText().isEmpty() || txtDesignation2.getText().isEmpty() || txtWorkingHour2.getText().isEmpty() || txtWagesPerHour.getText().isEmpty() || txtShifts.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frm, "Please fill up all the necessary fields.");
            }
            else{
                try{
                    int VacancyNumber =Integer.parseInt(txtVacancyNumber3.getText());
                    String Designation = txtDesignation2.getText();
                    int WorkingHour =Integer.parseInt(txtWorkingHour2.getText());
                    int WagesPerHour =Integer.parseInt(txtWagesPerHour.getText());
                    String JobType = cmbJobType2.getSelectedItem().toString();
                    String Shift = txtShifts.getText();                
                    boolean isDuplicate =false;
                    for (StaffHire item : list){
                        if(item.getVacancyNumber()==VacancyNumber){
                            if(item instanceof PartTimeStaffHire){
                                isDuplicate=true;
                                break;
                            }
                        }
                    }
                    if(Integer.parseInt(txtWorkingHour2.getText())>5){ 
                        JOptionPane.showMessageDialog(frm,"Error: Working hour cannot exceed 5 hours."); 
                        return;
                    }                  
                    if(Integer.parseInt(txtWorkingHour2.getText())<= 0){ 
                        JOptionPane.showMessageDialog(frm,"Error: Working hour cannot have negative or null values."); 
                        return;
                    } 
                    if(Integer.parseInt(txtWagesPerHour.getText())<= 0){ 
                        JOptionPane.showMessageDialog(frm,"Error: Wages per hour cannot have negative or null values."); 
                        return;
                    }                
                    if(isDuplicate==false){
                        PartTimeStaffHire obj= new PartTimeStaffHire(VacancyNumber, Designation, JobType,WorkingHour,WagesPerHour,Shift);
                        list.add(obj);
                        JOptionPane.showMessageDialog(frm,"A new vacant position is now available.");                              
                    }
                    else{
                        JOptionPane.showMessageDialog(frm,"The vacant position already exists.");                                     
                    }
                }    
                catch(Exception exp){
                    JOptionPane.showMessageDialog(frm,"Invalid entry has been detected.");
                } 
            }
        }        
        if(e.getSource() == btnAppoint2){
            if(txtStaffName2.getText().isEmpty() || txtJoiningDate2.getText().isEmpty() || txtVacancyNumber4.getText().isEmpty() || txtQualification2.getText().isEmpty() || txtAppointedBy2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frm, "Please fill up all the necessary fields.");
            }
            else{
                try{
                    String StaffName = txtStaffName2.getText();
                    String JoiningDate =txtJoiningDate2.getText();
                    int VacancyNumber =Integer.parseInt(txtVacancyNumber4.getText());
                    String Qualification = txtQualification2.getText();
                    String AppointedBy = txtAppointedBy2.getText();
                    int count=1;
                    for(StaffHire h:list){
                        if(h.getVacancyNumber()==VacancyNumber){
                            if(h instanceof PartTimeStaffHire){
                                PartTimeStaffHire p=(PartTimeStaffHire)h;
                                if(p.getJoined()==true){
                                    JOptionPane.showMessageDialog(frm,"Staff has already been hired.");
                                    break;
                                }
                                else{
                                    p.hirePartTime(StaffName,JoiningDate,Qualification,AppointedBy);
                                    String name=txtStaffName2.getText();
                                    JOptionPane.showMessageDialog(frm,name+" has been appointed successfully.");
                                    break;
                                }
                            }
                            else{
                                if(count==list.size()){
                                    JOptionPane.showMessageDialog(frm,"The entered vacancy is unavailable.");
                                    break;
                                }
                            }
                        }
                        else{
                            if(count==list.size()){
                                JOptionPane.showMessageDialog(frm,"The entered vacancy number does not exist.");
                                break;
                            }
                        }
                        count++;
                    }
                }
                catch(Exception exp){
                    JOptionPane.showMessageDialog(frm,"Invalid entry has been detected.");
                } 
            }
        } 
        if(e.getSource() == btnTermination){
            if(txtVacancyNumber5.getText().isEmpty()){
                JOptionPane.showMessageDialog(frm, "Enter the Vacancy number for termination");
            }
            else{
                try{
                   int VacancyNumber = Integer.parseInt(txtVacancyNumber5.getText());                                  
                   int count=1;
                   for(StaffHire obj:list){
                       if(obj.getVacancyNumber()==VacancyNumber){
                           if(obj instanceof PartTimeStaffHire){
                               PartTimeStaffHire Parttime=(PartTimeStaffHire)obj;
                               if(Parttime.getTerminated()==true){
                                   JOptionPane.showMessageDialog(frm,"The said staff has already been terminated.");
                                   break;
                               }
                               else{
                                   Parttime.termination();
                                   JOptionPane.showMessageDialog(frm,"The staff has been successfully terminated.");
                                   break;
                               }
                           }
                           else{
                               if(count==list.size()){
                                   JOptionPane.showMessageDialog(frm,"The entered vacany number does not exist.");
                                   break;
                               }
                           }
                       }
                       else{
                           if(count==list.size()){
                               JOptionPane.showMessageDialog(frm,"The entered vacany number does not exist.");
                               break;
                           }
                       }
                       count++;
                   }
                }
                catch(Exception exp){
                    JOptionPane.showMessageDialog(frm,"Invalid entry has been detected.");
                } 
            }
        }            
        if(e.getSource()==btnDisplayDetails1){
            for(StaffHire a:list){
                if(a instanceof FullTimeStaffHire){
                    FullTimeStaffHire f=(FullTimeStaffHire) a;
                    f.displayDetails();
                }  
             }
        }        
        if(e.getSource()==btnDisplayDetails2){
            for(StaffHire b:list){
                if(b instanceof PartTimeStaffHire){
                    PartTimeStaffHire p=(PartTimeStaffHire) b;
                    p.displayDetails();
                }  
            }
        }                                
        if (e.getSource() == btnClear)
        {
            txtVacancyNumber1.setText("");
            txtSalary.setText("");
            txtDesignation1.setText("");
            cmbJobType1.setSelectedIndex(0);
            txtWorkingHour1.setText("");
            txtStaffName1.setText("");
            txtJoiningDate1.setText("");
            txtQualification1.setText("");
            txtAppointedBy1.setText("");
            txtVacancyNumber2.setText("");
            txtVacancyNumber3.setText("");
            cmbJobType2.setSelectedIndex(0);
            txtWorkingHour2.setText("");
            txtDesignation2.setText("");
            txtWagesPerHour.setText("");
            txtShifts.setText("");
            txtStaffName2.setText(""); 
            txtAppointedBy2.setText("");
            txtQualification2.setText("");
            txtVacancyNumber4.setText("");
            txtJoiningDate2.setText("");
        }        
    }
}

    
   
       