package Project;
import java.util.*;
public class Chicken extends Animal {
    private int henhouse_id;
    private Float avg_weight;

    public Chicken(){
        super();
    }
    public Chicken(int id,String type,String gender, int henhouse_id, Float avg_weight){
        super(id, type, gender);
        this.henhouse_id = henhouse_id;
        this.avg_weight = avg_weight;
    }
    public void setHenhouse_id(int henhouse_id){
        this.henhouse_id = henhouse_id;
    }
    public int getHenhouse_id (){
        return henhouse_id;
    }
    public void setAvg_weight(Float avg_weight){
        this.avg_weight = avg_weight;
    }
    public Float getAvg_weight(){
        return avg_weight;
    }
    Scanner sc = new Scanner (System.in);
    public void inputInformation(){
        System.out.println("Enter ID: ");
        setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Type: ");
        setType(sc.nextLine());
        System.out.println("Enter gender: \n1. Rooster\n2. Hen");
        setGender(sc.nextLine());
        System.out.println("Enter the id of henhouse: ");
        setHenhouse_id(sc.nextInt());
        System.out.println("Enter avarage weight: ");
        setAvg_weight(sc.nextFloat());
    
    }
    public void showInformation(){
        System.out.printf("||     %-5d %-10s %-10s %10d %15f     ||", getID(), getType(),getGender(), getHenhouse_id(), getAvg_weight());
        System.out.println();
    }

    
   
    
    
    
}
