public class Employee {
    private static int nextID;

    private int myID;
    private String myName;

    public Employee(String name) {
        myName = name;
        myID = nextID;

        nextID++;
    }

    public String getName() {
        return myName;
    }

    public int getID() {
        return myID;
    }

    public static int getNextID() {
        return nextID;
    }
}
