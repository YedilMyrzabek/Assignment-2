public class Person implements Payable,Comparable<Person>{
    //Create variables
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    public Person(){
        id = id_gen++;
    }

    //Create constructor
    public Person(String name,String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    //Create getter and setter
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public String getPosition(){
        return "Student:";
    }
    //Create method toString()
    public String toString(){
        return getPosition() + " "+ id + " " + name + " " + surname;
    }

    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
