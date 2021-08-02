abstract class User {
    public int status;
    public abstract void startLogin();
}

class ActiveUser extends User {

    @Override
    public void startLogin() {
        System.out.println("startLogin with Active User");
    }
}

class DeletedUser extends User {

    @Override
    public void startLogin() {
        System.out.println("startLogin with Deleted User");
    }
}
