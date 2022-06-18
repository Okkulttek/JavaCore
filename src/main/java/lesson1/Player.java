package lesson1;

public class Player {
    private String name;
    private int distanceSwim;
    private int distanceRun;



    public Player(String name, int distanceSwim, int distanceRun) {
        this.name = name;
        this.distanceSwim = distanceSwim;
        this.distanceRun = distanceRun;

    }
    public String getName() {return name;}
    public int getDistanceSwim() {return distanceSwim;}
    public int getDistanceRun() {return distanceRun;}

}
