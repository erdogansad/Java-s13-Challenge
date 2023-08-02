package employeeApp;

enum Plan {
    STANDART("STANDART", 1000),
    SILVER("SILVER", 2000),
    GOLD("GOLD", 3000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}