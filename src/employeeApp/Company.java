package employeeApp;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGiro() {
        return this.giro;
    }

    public String[] getDeveloperNames() {
        return this.developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Name must be at least 3 characters.");
        }
    }

    public void setGiro(int giro) {
        if (giro > 0) {
            this.giro = giro;
        }
    }

    public void addEmployee(int index, String name) {
        if (this.developerNames[index] == null) {
            this.developerNames[index] = name;
        } else {
            System.out.println("Developer already exists.");
        }
    }

    public String toString() {
        String devNames = "";
        int i = 0;
        for (String devName : developerNames) {
            if (devName != null) {
                if (i == developerNames.length - 1) {
                    devNames += devName;
                } else {
                    devNames += devName + ", ";
                    ++i;
                }
            }
        }
        return "ID: " + id + "\nName: " + name + "\nGiro: " + giro + "\nDevelopers: " + devNames;
    }
}
