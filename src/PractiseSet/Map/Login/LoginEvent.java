package PractiseSet.Map.Login;

public class LoginEvent {
    private int userId;
    private String username;

    public LoginEvent(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "LoginEvent{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }
}
