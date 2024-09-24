public class Intern extends Employee {
    private static final double salaryLimit = 20000;

    //constructor
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary); // llama al constructor del padre (employee)
        //validar el salario al crear el intern
        if (salary > salaryLimit) {
            throw new IllegalArgumentException("El salario no puede exceder " + salaryLimit);
        }
    }

    //SOBREESCRIBIR EL SETTER DE SALARIO PARA IMPONER EL LIMITE
    @Override
    public void setSalary(double salary) {
        if (salary > salaryLimit) {
            throw new IllegalArgumentException("El salario no puede exceder " + salaryLimit);
        } else if (salary < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        } else {
            super.setSalary(salary); //llama al set del padre
        }
    }

    //mostrar info del inter
    @Override
    public String toString() {
        return "Intern:  " + getName() + ", Email: " + getEmail() + ", Age: " + getAge() + ", Salary: $" + getSalary();
    }
}
