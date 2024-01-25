public class Employee extends Person{
    //Create varibales
    private String position;
    private double salary;
    //Create constructor
    public Employee() {
        super();
    }
    public Employee(String name,String surname, String position,Double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);
    }
    //Create getter and setter
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
    public String getPosition(){
        return position;
    }
    public Double getSalary(){
        return salary;
    }
    //Create getPaymentAmount() method
    @Override
    public double getPaymentAmount() {
        return salary;
    }
    //Create toString() method
    public String toString(){
        return "Employee: "+super.toString() +" earns "+ getSalary()+" tenge";
    }
}
