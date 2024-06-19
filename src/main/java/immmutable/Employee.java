package immmutable;

public class Employee {

        private String name;
        private int age;
        private String department;
        private double salary;
        private boolean isFresher;

        public Employee() {
            this("Venkat", 28, "Developer", 30000, true);
        }

        public Employee(String name, int age, String department, double salary) {
            this(name, age, department, salary, false);
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", isFresher=" + isFresher +
                '}';
    }

        public Employee(String name, int age, String department, double salary, boolean isFresher) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
            this.isFresher = isFresher;
            if (isFresher) {
                System.out.println("Fresher details initialized");
            } else {
                System.out.println("Experienced employee details initialized");
            }
        }


        public static void main(String[] args) {
            Employee emp1 = new Employee();
            System.out.println(emp1);
            Employee emp2 = new Employee("Sateesh", 28, "Developer", 70000);
            System.out.println(emp2);

        }
    }


