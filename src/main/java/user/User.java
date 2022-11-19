package user;

public class User {
    public User(String userName, String nickName, String password, String emailAddress) {
        this.nickName = nickName;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
    }
    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {return emailAddress; }

    protected String userName;
    protected String nickName;
    protected String password;
    protected String emailAddress;

    @Override
    public String toString() {
        return nickName + " " + userName + " " + password;
    }
}