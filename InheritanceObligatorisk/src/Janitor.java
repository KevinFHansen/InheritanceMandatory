public class Janitor extends Staff{

    //Opretter variabler som kun er gældende for Employee, og de klasser der måtte nedarve employee
    private int numberOfKeys;
    private int phoneNumber;

    //Opretter en constructor til nåletræet.
    public Janitor(String name, int age, String gender, String address, int numberOfKeys, int phoneNumber){
        //Her deklarerer jeg hvilke attributter jeg har taget fra superklassen "Staff"
        super(name, age, gender, address);
        this.numberOfKeys = numberOfKeys;
        this.phoneNumber = phoneNumber;
    }
    //Her overrider jeg metoden "shoutYourJobFunction" fra Staff klassen, og giver Janitor sin egen unikke skrig
    @Override
    public void shoutYourJobFunction(){
        System.out.println("I AM A JANITOR");
    }
}
