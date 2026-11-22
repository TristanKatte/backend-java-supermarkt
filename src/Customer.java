public class Customer {
    String name;
    SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    void buyItem(String productName, int amount) {
        if (this.superMarket == null) {
            IO.println("Select a supermarket to go to first");
            return;
        } else if (productName.equals("bread")) {
            superMarket.buyBread(amount);
        } else if (productName.equals("fruit")) {
            superMarket.buyFruit(amount);
        } else if (productName.equals("cheese")) {
            superMarket.buyCheese(amount);
        } else if (productName.equals("toilet paper")) {
            superMarket.buyToiletPaper(amount);
        } else {
            IO.println("We don't sell " + productName);
        }
    }

    void goToSupermarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }
}
