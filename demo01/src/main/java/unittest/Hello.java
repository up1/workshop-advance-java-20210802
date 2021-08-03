package unittest;

// System Under Test (SUT)
public class Hello {
    public Hello(UserDB userDB) {

    }

    public Hello() {

    }

    public String hi(String name) {
        return "Hello, " + name;
    }

    UserDB userDB;

    public String workWithDb(int id) {
        // Tight coupling => Loose coupling
        return userDB.getNameById(id);
    }

    public String workWithDb(UserDB userDB, int i) {
        return null;
    }
}

interface UserDB {
    public String getNameById(int id) throws UserNotFoundException;
}
