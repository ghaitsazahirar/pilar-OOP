public class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Staff extends Employee {
    public Staff(int id, String name) {
        super(id, name);
    }
}

public class Manager extends Employee {
    public Manager(int id, String name) {
        super(id, name);
    }
}
