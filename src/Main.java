
public class Main {
    public static void main(String[] args) {


        Customer[] customers = {
                new Customer("Сара", 30, 111, 444),
                new Customer("Джон", 10, 222, 555),
                new Customer("Иван", 25, 333, 666),
                new Customer("Чорт", 666, 666, 777),
        };

        Gamer[] gamers = {
                new Gamer("Jon", 23, 1234, "xBox"),
                new Gamer("Джон", 10, 222, "PC"),
                new Gamer("Mac", 15,78477,"XBox")
        };

        PrintService printServiceForInvestor = new PrintServiceForInvestor();
        PrintService printServiceForEmployee = new PrintServiceForEmployee();

        Person[] people = new Person[gamers.length + customers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i + customers.length] = gamers[i];
        }
        printReport(printServiceForInvestor, customers, gamers, people);
        printReport(printServiceForEmployee, customers, gamers, people);
    }

    private static void printReport(PrintService printService, Customer[] customers, Gamer[] gamers, Person[] people) {
            printService.print(customers);
            printService.print(gamers);
            printService.print(people);
        }


}
