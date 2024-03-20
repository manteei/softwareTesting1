package third;

public class Event {
    private String name;
    private String description;
    private int influence;
    private Orator initiator;

    public Event(String name, String description, int influence, Orator initiator) {
        this.name = name;
        this.description = description;
        this.influence = influence;
        this.initiator = initiator;
    }

    public double getInfluenceOfOrator() {
        double resp = initiator.countSupport();
        if (resp > 0) {
            return resp * influence;
        } else if (resp == 0) {
            return influence;
        } else {
            return 0;
        }
    }


}
