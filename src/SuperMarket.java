public class SuperMarket {
    Product bread;
    Product fruit;
    Product cheese;
    Product toiletPaper;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {
        if (bread == null) {
            this.bread = new Product("fake", 0, 0);
        } else {
            this.bread = bread;
        }

        if (fruit == null) {
            this.fruit = new Product("fake", 0, 0);
        } else {
            this.fruit = fruit;
        }

        if (cheese == null) {
            this.cheese = new Product("fake", 0, 0);
        } else {
            this.cheese = cheese;
        }

        if (toiletPaper == null) {
            this.toiletPaper = new Product("fake", 0, 0);
        } else {
            this.toiletPaper = toiletPaper;
        }
    }

    void buyItem(Product product, int amount) {
        if (amount <= product.amount) {
            product.amount -= amount;
            double totalPrice = amount * product.price;

            IO.println("You bought " + amount + " " + product.name + " for " + totalPrice + " euro");
        } else {
            IO.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    void buyBread(int amount) {
        buyItem(this.bread, amount);
    }

    void buyFruit(int amount) {
        buyItem(this.fruit, amount);
    }

    void buyCheese(int amount) {
        buyItem(this.cheese, amount);
    }

    void buyToiletPaper(int amount) {
        buyItem(this.toiletPaper, amount);
    }
}
