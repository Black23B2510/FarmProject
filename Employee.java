package Project;
import java.util.*;
public class Employee {
    private int id;
    private String name;
    private Float basicSalary;
    private String phone_number;
    private String gender;
    public Employee(){

    }
    public Employee(int id, String name, String phone_number, String gender,Float basicSalary){
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.gender= gender;
        this.basicSalary= basicSalary;
    }
    public void setID( int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }
    public void setName( String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setPhone_number( String phone_number){
        this.phone_number = phone_number;
    }
    public String getPhone_number(){
        return phone_number;
    }

    public void setGender( String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setBasicSalary( Float basicSalary){
        this.basicSalary= basicSalary;
    }
    public Float getBasicSalary(){
        return basicSalary;
    }
    Scanner sc = new Scanner (System.in);
    public void inputData(){
        System.out.println("Enter id of employee: ");
        setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        System.out.println("Enter phonenumber: ");
        setPhone_number(sc.nextLine());
        System.out.println("Enter gender: ");
        setGender(sc.nextLine());
        System.out.println("Enter basic salary of employee: ");
        setBasicSalary(sc.nextFloat());

    }
    public void displayData(){
        System.out.printf("%-5d %-20s %-15s %-10s %-10f", getID(),getName(),getPhone_number(),getGender(),getBasicSalary());
        System.out.println();
    }

    
}
