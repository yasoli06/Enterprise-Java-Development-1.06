public class Employee {

    private String name;
    private String email;
    private int age;
    private double salary;

    //constructor
    public Employee (String name, String email, int age, double salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    // Getters and setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age > 0) {
           this.age = age;
       } else {
           throw new IllegalArgumentException("La edad debe ser un valor positivo");
       }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")){
            this.email = email;
        } else {
            throw new IllegalArgumentException("El email debe ser válido.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a cero");
        }
    }

    //metodo para info del empleado
    public String toString() {
        return "Employee: " + name + ", Email: " + email + ", Age: " + age + ", Salary: $" + salary;
    }
}
