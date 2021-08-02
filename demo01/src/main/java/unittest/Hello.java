package unittest;

public class Hello {
    public String hi(String name) {
        return "Hello, " + name;
    }

    UserDB userDB;

    public String workWithDb(int id) {
        // Tight coupling => Loose coupling
        return userDB.getNameById(id);
    }
}

interface UserDB {
    public String getNameById(int id) throws UserNotFoundException;
}
