package GPTPractiseSet.RateLimiter;

public class Main {
    public static void main(String[] args) {

        RateLimiter limiter = new RateLimiter(3, 10);

        System.out.println(limiter.allowRequest(101, 1));   // true
        System.out.println(limiter.allowRequest(101, 2));   // true
        System.out.println(limiter.allowRequest(101, 5));   // true
        System.out.println(limiter.allowRequest(101, 7));   // false
        System.out.println(limiter.allowRequest(101, 12));  // true

        // Different user has an independent limit
        System.out.println(limiter.allowRequest(102, 7));   // true
        System.out.println(limiter.allowRequest(102, 8));   // true
        System.out.println(limiter.allowRequest(102, 9));   // true
        System.out.println(limiter.allowRequest(102, 10));  // false
    }
}
