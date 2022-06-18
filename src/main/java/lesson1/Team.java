package lesson1;

public class Team {
    private String teamName;
    private Player[] players;
    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }
    public String getTeamName() {return teamName;}
    public Player[] getPlayers() {return players;}

    public static void main(String[] args) {
        Player[] player = new Player[4];
        player[0] = new Player("Алексей", 40, 60);
        player[1] = new Player("Александр", 60, 90);
        player[2] = new Player("Андрей", 50, 70);
        player[3] = new Player("Николай", 30, 60);

                Team team = new Team("Россия", player);
                Course course = new Course(50, 80);
                String result = course.doIT(team);
                System.out.println(result);
    }

}
