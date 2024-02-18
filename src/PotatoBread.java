public class PotatoBread extends Bread{
    //https://www.simplyrecipes.com/recipes/homemade_potato_bread/

    //adding potatoes since this is one of the rare breads that uses it
    private double potato;

    public PotatoBread(double potato){
        this.potato = potato;
        setBreadName("Potato bread");
        setMilk(2);
        setSalt(2);
        setSugar(1);
        setVegetableOil(2);
        setYeast(1);
        setFlour(5);
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.printf("%.2f large russet potato\n", potato);
        System.out.printf("%.2f cups of milk\n", getMilk());
        System.out.printf("%.2f teaspoon of sugar\n", getSugar());
        System.out.printf("%.2f tablespoons of extra virgin olive oil\n", getVegetableOil());
        System.out.printf("%.2f packet of instant yeast\n", getYeast());
    }

    @Override
    public void printIntstructions() {
        System.out.println("1. Cook, peel, and mash the potato\n" +
                "2. Heat the milk, whish in mashed potato\n" +
                "3. Add yeast and 2 cups of flour\n" +
                "4. Add the remaining flour and knead\n" +
                "5. Let the dough rise\n" +
                "6. Divide dough and place loaf in pans\n" +
                "7. Let the dough rise again\n" +
                "8. Preheat the oven to 350f\n" +
                "9. Bake the loaves for 40-45 minutes\n" +
                "10.Cool the loaves and enjoy!");
    }


    @Override
    public String toString() {
        return super.toString() + "Its usually sweet and has an interesting flavor";
    }
}
