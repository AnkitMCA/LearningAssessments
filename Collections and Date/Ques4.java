import java.util.*;

class Employees{

        int empId, salary;
        String name;

        public Employees(int empId, int salary, String name) {
            this.empId = empId;
            this.salary = salary;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employees{" +
                    "empId=" + empId +
                    ", salary=" + salary +
                    ", name='" + name + '\'' +
                    '}'+"\n";
        }
    }

 public class Ques4 {

     public static void main(String args[]) {

         List<Employees> employeesArrayList = new ArrayList<>();

         employeesArrayList.add(new Employees(111,12000,"Anuj"));
         employeesArrayList.add(new Employees(106,11320,"Sanju"));
         employeesArrayList.add(new Employees(198,14560,"Adi"));
         employeesArrayList.add(new Employees(156,12220,"Sumit"));

         System.out.println("Original List : \n"+employeesArrayList);
         Collections.sort(employeesArrayList, new Comparator<Employees>() {
             @Override
             public int compare(Employees o1, Employees o2) {
                 return o1.salary - o2.salary;
             }
         });

         ListIterator listIterator = employeesArrayList.listIterator();
         System.out.println("Sorted List: ");
         while (listIterator.hasNext()){
             System.out.print(listIterator.next().toString());
         }
    }

 }