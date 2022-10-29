package user;

import command.Command;

public class User {
    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    protected String userName;
    protected String nickName;
    protected String password;

    public User(String nickName, String userName, String password) {
        this.nickName = nickName;
        this.userName = userName;
        this.password = password;
    }
}
