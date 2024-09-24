import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "john.doe@example.com", 30, 50000);
        System.out.println(emp.toString());

        //Class Intern
        try {
            Intern intern = new Intern("Jane Doe", "jane.doe@example.com", 22, 18000);
            System.out.println(intern.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //Asignar salario superior al limite
        try {
            Intern internHigh = new Intern("John Smith", "john.smith@example.com", 21, 25000);
            System.out.println(internHigh.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); //lanza una excepcion
        }

        //Actualizar salario por encima del limite
        try {
            Intern intern = new Intern("Jane Doe", "jane.doe@example.com", 22, 18000);
            intern.setSalary(22000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //Crear un array de empleados
        Employee[] employees = new Employee[10];

        //Rellenar el array
        employees[0] = new Employee("John Doe", "john.doe@example.com", 30, 50000);
        employees[1] = new Employee("Jane Doe", "jane.doe@example.com", 28, 48000);
        employees[2] = new Employee("Alice Johnson", "alice.johnson@example.com", 35, 55000);
        employees[3] = new Employee("Bob Smith", "bob.smith@example.com", 40, 60000);
        employees[4] = new Employee("Charlie Brown", "charlie.brown@example.com", 25, 45000);
        employees[5] = new Employee("Emily Davis", "emily.davis@example.com", 32, 53000);
        employees[6] = new Employee("George Miller", "george.miller@example.com", 29, 47000);
        employees[7] = new Employee("Hannah Wilson", "hannah.wilson@example.com", 27, 46000);
        employees[8] = new Employee("Ian White", "ian.white@example.com", 38, 58000);
        employees[9] = new Employee("Julia Green", "julia.green@example.com", 31, 52000);

        //Llamar el metodo para escribir los datos en un archivo
        writeEmployeesToFile(employees, "employees.txt");
    }
        //Metodo para escribir las info en un archivo
        public static void  writeEmployeesToFile(Employee[]employees, String filename) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                // Escribir los datos de cada empleado
                for (Employee employee : employees) {
                    writer.println("Name: " + employee.getName());
                    writer.println("Email: " + employee.getEmail());
                    writer.println("Age: " + employee.getAge());
                    writer.println("Salary: $" + employee.getSalary());
                    writer.println(); // Línea en blanco entre empleados
                }
                System.out.println("Datos de los empleados escritos en " + filename);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    }