public class DemoCondition {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        User activeUser = new ActiveUser();
        User deletedUser = new DeletedUser();
        loginService.login(activeUser);
        loginService.login(deletedUser);
    }
}

class LoginService {
    public void login(User user) {
        user.startLogin();
    }
}




