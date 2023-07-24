package Project;
import java.util.*;
public class Farm {
    
    static Scanner sc = new Scanner (System.in);
    static ArrayList<Animal>  ListAnimal = new ArrayList<>();
    static ArrayList<Employee> employee = new ArrayList<>();
    
    // Thêm thông tin cho Pig và Chicken thuộc lớp Animal
    public void AddAnimal(Animal animal){
        animal.inputInformation();
        ListAnimal.add(animal);
    }
    
    // CÁC METHOD CHO CHICKEN

    // Hiển thị thông tin của Chickens
    public void ShowChicken(ArrayList<Animal> ListAnimal){
        for (Animal ani: ListAnimal){
            if (ani instanceof Chicken){
                ani.showInformation();
            }
        }
    }
    // Tìm kiếm Chicken theo id
    public static int findChicken(int id,ArrayList<Animal> ListAnimal){
        for (Animal ani: ListAnimal){
            if (ani instanceof Chicken){
                if (ani.getID() == id){
                    System.out.printf("Type:%-10s Henhouse_id:%-3d Avg_weight:%4f",((Chicken)ani).getType(),((Chicken)ani).getHenhouse_id(),((Chicken)ani).getAvg_weight());
                    return ListAnimal.indexOf(ani);
                }

            }
        }
        return -1;
    }
    // Xóa chicken theo id
    public  void removeChicken(int Id, ArrayList<Animal> ListAnimal){
        int index = findChicken(Id, ListAnimal);
        if (index != -1) ListAnimal.remove(index);
        else System.out.println("Error! ID unavailable.");

    }
    // Đếm số lượng chicken
    public  void countChicken(ArrayList<Animal> ListAnimal){
        int count =0, count1=0, count2=0;
        for (Animal ani: ListAnimal){
            if(ani instanceof Chicken)
                count+=1;  
                if(ani.getGender().equals("rooster")){
                    count1+=1;
                }
                else count2 += 1;
        }
        System.out.println("Number of chicken is: "+count);
        System.out.println("Number of rooster is: "+count1);
        System.out.println("Number of hen is: "+count2);
    }
    // Hàm sắp xếp chicken theo thứ tự tăng dần mã ID
    public void sortChicken(ArrayList<Animal> ListAnimal){
        ArrayList<Animal> chicken = new ArrayList<>(); // Tạo một ArrayList để lưu trữ đối tượng chicken trong quá trình sắp xếp
        for(Animal ani: ListAnimal){
            if (ani instanceof Chicken){
                chicken.add(ani);
            }
        }

        for(int i=0; i< chicken.size()-1;i++){
            for(int j=0; j<chicken.size()-1-i;j++){
                if (chicken.get(j).getID() > chicken.get(j+1).getID()){
                    Animal temp = chicken.get(j);
                    chicken.set(j, chicken.get(j+1));
                    chicken.set(j+1, temp);
                }
            }
        }

        for(Animal ani: chicken){
            ani.showInformation();
        }
    }


    // CÁC METHOD CHO PIG

    // Hiển thị thông tin của Pigs
    public void showPig(ArrayList<Animal> ListAnimal){
        for (Animal ani: ListAnimal){
            if (ani instanceof Pig){
                ani.showInformation();
            }
        }
    }
    // Tìm kiếm Pig theo id
    public static int findPig(int id, ArrayList<Animal> ListAnimal){
        for (Animal ani: ListAnimal){
            if (ani instanceof Pig){
                if (ani.getID() == id){
                    System.out.printf("Type:%-10s Pigsty_id:%3d Avg_weight:%5f",((Pig)ani).getType(),((Pig)ani).getPigsty_id(),((Pig)ani).getAvg_weight());
                    return ListAnimal.indexOf(ani);
                }
            }
        }
        return -1;
    }
    // Xóa pig theo id
    public  void removePig (int id, ArrayList<Animal> ListAnimal){
        int index = findPig(id, ListAnimal);
        if (index != -1) ListAnimal.remove(index);
        else System.out.println("Error! ID unavailable.");
    }
    // Đếm số lượng pig
    public void countPig(ArrayList<Animal> ListAnimal){
        int count = 0, count1=0, count2=0;
        for (Animal ani: ListAnimal){
            if (ani instanceof Pig){
                count+=1;
                if (ani.getGender().equals("boar")) {
                    count1 +=1;
                }
                else count2 += 1;
            }      
        }
        System.out.println("Number of pig is: "+count);
        System.out.println("Number of boar (lợn đực) is: "+count1);
        System.out.println("Number of sow (lợn cái) is: "+count2);
    }
    // Sắp xếp pig theo id
    public void sortPig(ArrayList<Animal> ListAnimal){
        ArrayList<Animal> pig = new ArrayList<>(); //Tạo một ArrayList để lưu trữ các đối tượng là Pig để sắp xếp
        for(Animal ani: ListAnimal){
            if (ani instanceof Pig){
                pig.add(ani);
            }
        }
        // Thuật toán sắp xếp theo thứ tự tăng dần mã ID
        for(int i=0; i< pig.size()-1;i++){
            for(int j=0; j<pig.size()-1-i;j++){
                if (pig.get(j).getID() > pig.get(j+1).getID()){
                    Animal temp = pig.get(j);
                    pig.set(j, pig.get(j+1));
                    pig.set(j+1, temp);
                }
            }
        }
        // Hiển thị dãy pig sau khi đã sắp xếp
        for(Animal ani: pig){
            ani.showInformation();
        }
    }



    // CÁC METHOD CỦA EMPLOYEE

    // Thêm nhân viên
    public void addEmployee(Employee employ){
            employ.inputData();
            employee.add(employ);
    }

    // Hiển thị toàn bộ thông tin của nhân viên
    public void showEmployee(ArrayList<Employee> employee){
        for(Employee emp: employee){
            emp.displayData();
        }
    }

    // Tìm kiếm nhân viên theo id
    public static int searchEmployee(int id, ArrayList<Employee> employee){
        for(Employee emp: employee){
            if(emp.getID() == id){
                System.out.printf("Name:%-20sPhone_number:%-10s   Gender:%-6s   Basic_salary:%-10f",emp.getName(),emp.getPhone_number(),emp.getGender(),emp.getBasicSalary());
                return employee.indexOf(emp);
            }
        }
        return -1;
        
    }

    // Xóa nhân viên theo id
    public void removeEmployee(int id, ArrayList<Employee> employee){
        int index = searchEmployee(id, employee);
        if(index != -1) employee.remove(index);
        else System.out.println("Error! ID unavailable.");

    }
    

    // Sắp xếp nhân viên theo tên
    public void sortEmployee(ArrayList<Employee> employee){
        for(int i=0; i< employee.size()-1; i++){
            for (int j=0; j< employee.size()-1-i;j++){
                if(employee.get(j).getName().compareTo(employee.get(j+1).getName()) > 0){
                    Employee temp = employee.get(j);
                    employee.set(j, employee.get(j+1));
                    employee.set(j+1, temp);
                }
                
            }
        }
        for (Employee emp: employee){
            emp.displayData();
        }
    }

    //Tính lương của toàn bộ nhân viên 
    public void calSalary(ArrayList<Employee> employee){
        for(Employee emp: employee){
            System.out.printf("%-5s%-20s\n","ID","Name");
            System.out.printf("%-5d%-20s",emp.getID(),emp.getName());
            System.out.println();
            System.out.println("Enter overtime of "+emp.getName()+": ");
            Float overtime = sc.nextFloat();
            Float salary = emp.getBasicSalary()+ overtime*100000; 
            System.out.println("Final salary of "+emp.getName()+" is:"+salary);
            
        }
    }

    //Cập nhật thông tin cho nhân viên
    public void updateEmployee(ArrayList<Employee> employee){
        System.out.println("Enter the employee's id to update: ");
        int emp2 = sc.nextInt();
        for (Employee emp: employee){
            if(emp.getID() == emp2){
                updateMenu();
                int luachon = sc.nextInt();
                sc.nextLine();
                if(luachon ==1){
                    System.out.println("Enter new employee's name: ");
                    emp.setName(sc.nextLine());
                }
                else if (luachon == 2){
                    System.out.println("Enter new employee's phonenumber: ");
                    emp.setPhone_number(sc.nextLine());
                }
                else if (luachon == 3){
                    System.out.println("Enter new employee's basic salary: ");
                    emp.setBasicSalary(sc.nextFloat());
                }
                else System.out.println("Your choice unavailable ");
            }
            else System.out.println("There is no this employee's id");
        }
        
    }

    // Bảng chọn thông tin để cập nhật cho nhân viên
    public void updateMenu(){
        System.out.println("\n      -------WHAT INFORMATION DO YOU WANT TO UPDATE?-------");
        System.out.println("                  1.Employee's name");
        System.out.println("                  2.Employee's basic salary");
        System.out.println("                  3.Employee's phone number");
        System.out.println("        ---------------------------------------------------\n");
        System.out.println("Enter your choice to update employee's information: ");
    }

}

    