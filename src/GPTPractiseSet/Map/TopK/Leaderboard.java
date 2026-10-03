package GPTPractiseSet.Map.TopK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Leaderboard {

    Comparator<EmployeeScore> comp=Comparator
            .comparingInt(EmployeeScore::getScore)
            .reversed()
            .thenComparing(EmployeeScore::getEmployeeId);

    private final int k;
    PriorityQueue<EmployeeScore> pq=new PriorityQueue<>(comp);

    public Leaderboard(int k) {
        this.k=k;
    }

    public void addScore(EmployeeScore employee) {
        pq.add(employee);
    }

    public List<EmployeeScore> getTopK() {
        List<EmployeeScore> ans=new ArrayList<>();
        int cnt=k;
        while(cnt>0){
            ans.add(pq.poll());
            cnt--;
        }
        return ans;
    }
}
