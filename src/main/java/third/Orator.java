package third;

public class Orator extends Person{
    private double liaRatio;
    private boolean isMarried;
    private boolean isSmoking;
    private boolean isDrinking;
    public Orator(String name, int age, Education education, boolean isMarried, boolean isSmoking, boolean isDrinking, double liaRatio) {
        super(name, age, education);
        this.isMarried = isMarried;
        this.isSmoking = isSmoking;
        this.isDrinking = isDrinking;
        this.liaRatio = liaRatio;
    }

    public double countSupport(){
        double edu = super.eduPoints();
        double wellBeing = 1;
        if (isMarried){
            wellBeing+=1/3;
        }
        if(!isSmoking){
            wellBeing+=1/3;
        }
        if(!isDrinking){
            wellBeing+=1/3;
        }
        return liaRatio*wellBeing*edu;
    }

}
