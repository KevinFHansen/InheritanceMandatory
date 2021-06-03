public class Staff {

    //Opretter variabler for Staff
    private String name;
    private int age;
    private String gender;
    private String address;

    //Laver en constructor for en Staff
    public Staff(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    //Man kan også nedarve metoder
    public void shoutYourJobFunction(){
    }
}
