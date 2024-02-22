public interface PrintService {
    default void print(Person[] people){
        System.out.println("!!!!!!");
    };

    void print(Customer[] customers);

    void print(Gamer[] gamers);
}
