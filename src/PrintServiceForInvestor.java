public class PrintServiceForInvestor implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("Размер списка " + people.length);

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя " + person.getName() +
                    "; Вoзраст " +person.getAge() +
                    "; Телефон " + person.getPhoneNumber());
        }
        System.out.println();
    }

    @Override
    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя " + customer.getName() +
                    "; Вoзраст " +customer.getAge() +
                    "; Телефон " + customer.getPhoneNumber());
        }
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка игроков " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println("Имя " + gamer.getName() +
                    "; Вoзраст " + gamer.getAge() +
                    "; Телефон " + gamer.getPhoneNumber());
        }
        System.out.println();
    }
}
