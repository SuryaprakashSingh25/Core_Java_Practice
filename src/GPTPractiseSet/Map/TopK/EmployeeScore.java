package GPTPractiseSet.Map.TopK;

public class EmployeeScore {
    private int employeeId;
    private String name;
    private int score;

    public EmployeeScore(int employeeId, String name, int score) {
        this.employeeId = employeeId;
        this.name = name;
        this.score = score;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "EmployeeScore{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
