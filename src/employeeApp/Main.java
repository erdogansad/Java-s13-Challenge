package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin
 * oluşturulmasıdır.
 *
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan healthplanOne = new Healthplan(1, "Company a", Plan.STANDART);
        Healthplan healthplanTwo = new Healthplan(2, "Company b", Plan.SILVER);
        Healthplan healthplanThree = new Healthplan(3, "Company c", Plan.GOLD);

        String[] healthPlans = new String[5];
        healthPlans[0] = healthplanOne.getName();
        healthPlans[1] = healthplanTwo.getName();
        healthPlans[2] = healthplanThree.getName();

        Employee employeeOne = new Employee(1, "Steve Green", "steve.green@email.com", "p@ssw*rd", healthPlans);
        employeeOne.addHealthplan(3, "Company d");

        String[] developers = new String[2];
        developers[0] = employeeOne.getFullName();

        Company company = new Company(1, "Company", 20000, developers);

        System.out.println("------------------------------");
        System.out.println(healthplanOne.toString());
        System.out.println("------------------------------");
        System.out.println(employeeOne.toString());
        System.out.println("------------------------------");
        System.out.println(company.toString());

        Employee employeeTwo = new Employee(2, "May Jones", "may.jones@email.com", "pass*#rd", healthPlans);
        employeeTwo.addHealthplan(4, "Company e");
        developers[1] = employeeTwo.getFullName();

        System.out.println("------------------------------");
        System.out.println(employeeTwo.toString());
        System.out.println("------------------------------");
        System.out.println(company.toString());
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot
     * olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi
     * kalabalık bir hale gelmemiş olur.
     *
     * 
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman
     *             alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
