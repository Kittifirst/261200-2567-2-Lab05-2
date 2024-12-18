import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name,int year,int month,int day) {
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }

    public Boolean isBirthday(){
        if(LocalDate.now().getDayOfMonth() == dob.getDayOfMonth() && LocalDate.now().getMonth() == dob.getMonth()){
            return true;
        }
        else {
            return false;
        }
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

    public String getName(){
        return name;
    }

    public LocalDate getdob(){
        return dob;
    }

    public void displayInfo(){
        System.out.println("User Name : " + getName());
        System.out.println("Birthday : " + getdob());
    }
}
