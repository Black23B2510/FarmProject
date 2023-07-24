package Project;
import java.util.*;
public class FarmTest {
    static Farm fa = new Farm();
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int choose;
        do {
            Menu();
            choose = sc.nextInt();
            switch (choose ) {
                case 1:
                    chickenMenu();
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter number of chicken: ");
                            int number = sc.nextInt();
                            for(int i= 0; i< number; i++){
                                System.out.println("Enter information of chicken "+(i+1)+": ");
                                Animal animal = new Chicken();
                                fa.AddAnimal(animal);
                            } 
                            
                            break;
                    
                        case 2:
                            System.out.println("-------------------------------LIST OF CHICKEN----------------------");
                            System.out.printf("||     %-5s %-10s %-10s %-10s %-15s ||","ID","Type","Gender","ID_of_henhouse","Average_weight");
                            System.out.println();
                            fa.ShowChicken(Farm.ListAnimal);
                            System.out.println("--------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("Let search chicken in our farm!");
                            System.out.println("Enter chicken's id to search: ");
                            int index = sc.nextInt();
                            System.out.println("Information of chicken has id "+index+" is: ");
                            fa.findChicken(index, Farm.ListAnimal);
                            break;
                        case 4:
                            System.out.println("Enter id of chicken to remove: ");
                            int vt = sc.nextInt();
                            fa.removeChicken(vt, Farm.ListAnimal);
                            System.out.println();
                            break;
                        case 5:
                            fa.countChicken(Farm.ListAnimal);
                            break;
                        case 6:
                            System.out.printf("||     %-5s %-10s %-10s %-10s %-15s ||","ID","Type","Gender","ID_of_henhouse","Average_weight");
                            System.out.println();
                            fa.sortChicken(Farm.ListAnimal);
                            break;
                        default:
                            System.out.println("                  Your choice unavailable! ");
                            break;
                    }
                    break;
                case 2:
                    pigMenu();
                    int choi = sc.nextInt();
                    switch (choi) {
                        case 1:
                            System.out.println("Enter number of pig: ");
                            int num = sc.nextInt();
                            for (int i=0; i<num; i++){
                                System.out.println("Enter information of pig "+(i+1)+": ");
                                Animal ani = new Pig();
                                fa.AddAnimal(ani);
                            }
                            break;
                    
                        case 2:
                            System.out.println("----------------------------LIST OF PIG------------------------------------- ");
                            System.out.printf("||     %-5s %-10s %-10s %-10s %-15s||","ID","Type","Gender","ID_of_pigsty","Average_weight");
                            System.out.println();
                            fa.showPig(Farm.ListAnimal);
                            System.out.println("----------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("Let search pig in our farm!");
                            System.out.println("Enter chicken's id to search: ");
                            int index = sc.nextInt();
                            System.out.println("Information of chicken has id "+index+" is: ");
                            fa.findPig(index, Farm.ListAnimal);
                            break;
                        case 4:
                            System.out.println("Enter id of pig to remove: ");
                            int loca = sc.nextInt();
                            fa.removePig(loca, Farm.ListAnimal);
                            System.out.println();
                            break;
                        case 5:
                            fa.countPig(Farm.ListAnimal);
                            break;
                        case 6:
                            System.out.printf("||     %-5s %-10s %-10s %-10s %-15s     ||","ID","Type","Gender","ID_of_pigsty","Average_weight");
                            System.out.println();
                            fa.sortPig(Farm.ListAnimal);
                            break;
                        default:
                            System.out.println("                Your choice unavailable!");
                            break;
                    }
                    break;
                case 3:
                    employeeMenu();
                    int selection = sc.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.println("Enter number of employee: ");
                            int select = sc.nextInt();
                            for(int i=0; i<select;i++){
                                System.out.println("Enter information of employee "+(i+1)+":");
                                Employee emp = new Employee();
                                fa.addEmployee(emp);
                            }
                            break;
                        case 2:
                            System.out.println("                ----------LIST OF EMPLOYEES----------\n");
                            System.out.printf("%-5s %-20s %-15s %-10s %-10s","ID","Name","Phone_number","Gender","Basic_salary");
                            System.out.println();
                            fa.showEmployee(Farm.employee);
                            break;
                        case 3:
                            System.out.println("Enter employee's id to search: ");
                            int ma = sc.nextInt();
                            System.out.print("Information of employee has id "+ma+" is: " );
                            fa.searchEmployee(ma,Farm.employee);
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("Enter employee's id to remove: ");
                            int maID = sc.nextInt();
                            fa.removeEmployee(maID, Farm.employee);
                            System.out.println();
                            break;
                        case 5:
                            System.out.println("Let calculate employee's salary");
                            fa.calSalary(Farm.employee);
                            break;
                        case 6:
                            System.out.println("           --------LIST OF EMPLOYEE AFTER SORTING-------- ");

                            fa.sortEmployee(Farm.employee);
                            break;
                        case 7:
                            System.out.println("Let update employee's information!");
                            fa.updateEmployee(Farm.employee);
                            break;
                        default:
                            System.out.println("               Your choice unavailable!");
                            break;
                    }
                    break;
                
            }
        } while (choose != 4);
    }
        
        // Bảng chọn công việc để thực hiện
        static void Menu(){
            System.out.println("\n\n              ===============================================================================");
            System.out.println("              -----------------------------WELCOME TO FARM MANAGER PROGRAM-------------------");
            System.out.println("              ||                            1. Tasks with chicken                          ||");
            System.out.println("              ||                            2. Tasks with pig                              ||");
            System.out.println("              ||                            3. Tasks with employee                         ||");
            System.out.println("              ||                            4. Exit                                        ||");
            System.out.println("              ===============================================================================");
            System.out.println("Enter your choice: ");
        }

        // Bảng chọn cho các thao tác với Chicken
        static void chickenMenu(){
            System.out.println("\n               ---------------------CHICKEN------------------------");
            System.out.println("               ||              1. Add chicken                    ||");
            System.out.println("               ||              2. Show chicken                   ||");
            System.out.println("               ||              3. Search chicken                 ||");
            System.out.println("               ||              4. Remove chicken with ID         ||");
            System.out.println("               ||              5. Show number of chicken         ||");
            System.out.println("               ||              6. Sort chicken with ID           ||");
            System.out.println("               ----------------------------------------------------");
            System.out.println("Enter your choice: ");
        }

        // Bảng chọn cho các thao tác với Pig
        static void pigMenu(){
            System.out.println("\n             --------------------------PIG--------------------------");
            System.out.println("             ||                   1. Add pig                      ||");
            System.out.println("             ||                   2. Show pig                     ||");
            System.out.println("             ||                   3. Search pig                   ||");
            System.out.println("             ||                   4. Remove pig with ID           ||");
            System.out.println("             ||                   5. Show number of pig           ||");
            System.out.println("             ||                   6. Sort pig with ID             ||");
            System.out.println("             -------------------------------------------------------");
            System.out.println("Enter your choice: ");
        }

        //  Bảng chọn cho các thao tác với Employee
        static void employeeMenu(){
            System.out.println("\n             ------------------------EMPLOYEE-----------------------");
            System.out.println("             ||                1. Add employee                    ||");
            System.out.println("             ||                2. Show employee's information     ||");
            System.out.println("             ||                3. Search employee                 ||");
            System.out.println("             ||                4. Remove employee                 ||");
            System.out.println("             ||                5. Calculate employee's salary     ||");
            System.out.println("             ||                6. Sort employee                   ||");
            System.out.println("             ||                7. Update employee information     ||");
            System.out.println("             -------------------------------------------------------");
            System.out.println("Enter your choice: ");
        }
        
        
        
}
            
        


        
        

