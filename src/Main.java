public class Main {
    public static void main(String[] args) {
        Product bread = new Product("bread", 2.50, 10);
        Product fruit = new Product("fruit", 1.20, 20);
        Product cheese = new Product("cheese", 4.75, 5);
        Product toiletPaper = new Product("toilet paper", 3.99, 8);

        SuperMarket superMarket = new SuperMarket(bread, fruit, cheese, toiletPaper);

        IO.print("What is your name? ");
        String name = IO.readln().trim();
        Customer customer = new Customer(name);

        customer.goToSupermarket(superMarket);

        IO.print("Which product do you want to buy? (bread, fruit, cheese, toiletPaper) ");
        String productName = IO.readln().trim();

        IO.print("How many do you want to buy? ");
        int amount = Integer.parseInt(IO.readln().trim());

        customer.buyItem(productName, amount);

    }
}
