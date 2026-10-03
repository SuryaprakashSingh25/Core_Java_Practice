package GPTPractiseSet.Map.TopK;

public class TopKMain {
    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard(3);

        leaderboard.addScore(new EmployeeScore(101, "Surya", 80));
        leaderboard.addScore(new EmployeeScore(102, "Rohit", 95));
        leaderboard.addScore(new EmployeeScore(103, "Bumrah", 90));
        leaderboard.addScore(new EmployeeScore(104, "Axar", 70));
        leaderboard.addScore(new EmployeeScore(105, "Gill", 95));

        System.out.println(leaderboard.getTopK());
    }
}
