package Quizzes;


class credentials{

    private String userName="BugBusters";
    private String password="Cybertek123";
    private String getUserName(){
        return userName;
    }
    private String getPassword(){
        return password;
    }


}

public class LogIn {
    public static void main(String[] args) {
            credentials obj=new credentials();
       // obj.getUserName();

    }
}
