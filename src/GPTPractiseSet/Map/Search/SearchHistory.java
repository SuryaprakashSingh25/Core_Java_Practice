package GPTPractiseSet.Map.Search;

import java.util.LinkedHashSet;

public class SearchHistory {
    private final int n;
    private final LinkedHashSet<String> ans;
    public SearchHistory(int n){
        this.n=n;
        ans=new LinkedHashSet<>();
    }

    public void add(String val){
        if(ans.contains(val)){
            ans.remove(val);
            ans.addLast(val);
        }
        else if(ans.size()==n){
            ans.removeFirst();
            ans.add(val);
        }
        else{
            ans.add(val);
        }
    }

    public LinkedHashSet<String> getHistory(){
        return ans;
    }

}
