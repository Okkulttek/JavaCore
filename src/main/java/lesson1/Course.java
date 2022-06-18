package lesson1;

public class Course {
    String result;
    private int swim;
    private int run;

    public Course(int swim, int run) {
        this.swim = swim;
        this.run = run;
    }

    public String doIT(Team team) {
        result = "Команда: " + team.getTeamName() + " " + '\n';
        for (Player player : team.getPlayers()) {
            result += "Спортсмен " + player.getName() + ": " + '\n';
            int value = player.getDistanceSwim();
            int value2 = player.getDistanceRun();
            testSwim(value);
            testRun(value2);
        }
        return result;
    }
    private void testSwim(int value) {
        if (value >= swim) {
            result += "Прошел дистанцию по плаванию" + '\n';
        }
        if (value < swim) result += "Не прошел дистанцию по плаванию" + '\n';
    }

        private void testRun ( int value2){
            if (value2 >= run) {
                result += "Прошел дистанцию по бегу" + '\n';
            }
            if (value2 < run) result += "Не прошел дистанцию по бегу" + '\n';
        }
}

