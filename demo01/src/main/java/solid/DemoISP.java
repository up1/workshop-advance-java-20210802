package solid;

public class DemoISP {
}


class Employee {
    int id;
    String name;
}
// Inheritance
class EmployeeWithType extends Employee {
    int type;
}

// Composition
class EmployeeAndType {
    Employee employee;
    int type;
}

interface UserRepository {
    // R
    void getAllUsers();
    void getUserById(int id);
    void search();
    // CUD
    void newUser();
    void updateUser(int id);
    void deleteAll();
    void deleteById(int id);
}

interface QueryUserRepository {
    void getAllUsers();
    void getUserById(int id);
    void search();
}

interface CommandUserRepository {
    void newUser();
    void updateUser(int id);
    void deleteAll();
    void deleteById(int id);
}

class MySqlUserRepository implements UserRepository {

    @Override
    public void newUser() {

    }

    @Override
    public void getAllUsers() {

    }

    @Override
    public void getUserById(int id) {

    }

    @Override
    public void search() {

    }

    @Override
    public void updateUser(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(int id) {

    }
}
