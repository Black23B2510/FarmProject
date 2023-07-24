package Project;
import java.util.*;
public class Pig extends Animal {
    private int pigsty_id;
    private Float avg_weight;
    public Pig(){
        super();
    }
    public Pig( int id,String type, String gender,int pigsty_id, Float avg_weight){
        super( id, type, gender);
        this.pigsty_id = pigsty_id;
        this.avg_weight = avg_weight;
    }
    public void setPigsty_id(int pigsty_id){
        this.pigsty_id = pigsty_id;
    }
    public int getPigsty_id(){
        return pigsty_id;
    }
    public void setAvg_weight( Float avg_weight){
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
        System.out.println("Enter gender: \n1.Boar\n2.Sow");
        setGender(sc.nextLine());
        System.out.println("Enter pigsty_id: ");
        setPigsty_id(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the avarage weight of the pig: ");
        setAvg_weight(sc.nextFloat());
        sc.nextLine();
    }
    public void showInformation(){
        System.out.printf("||     %-5d %-10s %-10s %10d %15f  ||", getID(), getType(),getGender(),  getPigsty_id(), getAvg_weight());
        System.out.println();
    }
    
    
}
