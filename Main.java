public class Main {
    public static void main(String[] args) {
        User John = new User("John",1954,2,18);
        John.displayInfo();
        John.displayHappyBirthday();
        System.out.println();
        Admin Nicolas = new Admin("Nicolas",1964,12,18);
        Nicolas.displayInfo();
        Nicolas.displayHappyBirthday();
        System.out.println();
        Nicolas.displayInfo(true);
        System.out.println();
        Nicolas.displayInfo(false);
    }
}