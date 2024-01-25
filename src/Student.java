public class Student extends Person{
    //create varibales
    private static final double step = 36660.00;
    private double gpa;
    //Create constructor
    public Student(){
        super();
    }
    public Student(String name, String surname, Double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGPA(gpa);
    }
    //Create getter and setter
    public void setGPA(Double gpa){
        this.gpa = gpa;
    }
    public Double getGPA(){
        return gpa;
    }
    //Create toString() method

    public String toString(){
        return  super.toString()+" earns "+ getPaymentAmount()+" tenge";
    }
    //Create getPay,entAmount() method
    public double getPaymentAmount(){
        return gpa > 2.67 ? step : 0;

    }
}
