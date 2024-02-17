public class BreadTester {
    public static void main(String[] args) {

        Sourdough sourdough = new Sourdough(1.00);
        Muffins muffins = new Muffins(1,1,.25);
        sourdough.getIngredients();
        sourdough.printInstructions();
        muffins.getIngredients();
        muffins.printIntstructions();
    }
}
