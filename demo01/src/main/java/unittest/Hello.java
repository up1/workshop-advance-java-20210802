package unittest;

public class Hello {
    public String hi(String name) {
        return "Hello, " + name;
    }

    public String workWithDb(int id) {
        // Tight coupling
        UserDB userDB = new UserDB();
        return userDB.getNameById(id);
    }
}

class UserDB { // Connect to DB
    public String getNameById(int id) {
        // Unstable with dependency
        throw new RuntimeException("DB Fail");
    }
}
