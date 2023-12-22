public class Employe {
    String fullname;
    double salary;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setFullnameAndSalary(String fullname,double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
