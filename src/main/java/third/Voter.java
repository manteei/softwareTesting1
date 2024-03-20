package third;

public class Voter extends Person{

    private double critical_thinking;
    private int volume;

    public Voter(String name, int age, Education education, int volume, double critical_thinking) {
        super(name, age, education);
        this.volume = volume;
        this.critical_thinking = critical_thinking;
    }
    public double shout(){
        return critical_thinking*volume*eduPoints();
    }


}
