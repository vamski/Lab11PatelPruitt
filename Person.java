public class Person {
    private int age;
    private String firstLast;
    private String address;
    private int zipCode;
    private double salary;

    public Person() {
    }

    public Person(int age, String firstLast, String address, int zipCode, double salary) {
        setAge(age);
        setFirstLast(firstLast);
        setAddress(address);
        setZipCode(zipCode);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public String getFirstLast() {
        return firstLast;
    }

    public String getAddress() {
        return address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstLast(String firstLast) {
        this.firstLast = firstLast;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    @Override
    public String toString() {
        String info  = new String();
        info = String.format("%d %s %s %d $%,.2f%n", getAge(), getFirstLast(), getAddress(), getZipCode(), getSalary());
        return info;
    }




}
