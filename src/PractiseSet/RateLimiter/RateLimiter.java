package PractiseSet.RateLimiter;

import java.util.*;

public class RateLimiter {
    private final int maxRequests;
    private final int windowSeconds;
    private final Map<Integer, Queue<Long>> mp;

    public RateLimiter(int maxRequests, int windowSeconds) {
        this.maxRequests = maxRequests;
        this.windowSeconds = windowSeconds;
        mp=new HashMap<>();
    }

    public boolean allowRequest(int userId, long timestamp) {
        // Your implementation
        Queue<Long> requests=mp.computeIfAbsent(
                userId,
                k -> new ArrayDeque<>()
        );
        while(!requests.isEmpty() && timestamp-requests.peek()
        >=windowSeconds){
            requests.poll();
        }
        if(requests.size()>=maxRequests){
            return false;
        }
        requests.offer(timestamp);
        return true;
    }
}
