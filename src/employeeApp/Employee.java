package employeeApp;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String[] getHealthplans() {
        return this.healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters.");
        }
    }

    public void addHealthplan(int index, String name) {
        if (healthplans[index] == null) {
            this.healthplans[index] = name;
        } else {
            System.out.println("Healthplan already exists at index " + index);
        }
    }

    public String toString() {
        String rtnStr = "ID: " + id + "\nName: " + fullName + "\nEmail: " + email + "\nPassword: " + password
                + "\nHealthplans: ";
        int i = 0;
        for (String healthplan : healthplans) {
            if (i == healthplans.length - 1) {
                rtnStr += healthplan;
            } else {
                rtnStr += healthplan + ", ";
                ++i;
            }
        }
        return rtnStr;
    }

}
