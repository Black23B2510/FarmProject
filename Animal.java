package Project;
import java.util.*;
public abstract class Animal  {
    private int id;
    private String type;
    private String gender;

    public Animal(){

    }

    public Animal(int id,String type, String gender){
        this.id = id;
        this.type= type;
        this.gender = gender;
        
    }

    public void setType( String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    
    public void setID(int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }

    Scanner sc = new Scanner (System.in);

    // Nhập thông tin của con vật
    public void inputInformation(){
        
    }
    public void showInformation(){
        
    }




    
}
