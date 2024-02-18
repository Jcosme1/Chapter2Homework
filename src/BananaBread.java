public class BananaBread extends Bread{
    private double banana;
    //https://www.simplyrecipes.com/recipes/banana_bread/
    //bananas are a rare ingredient for bread so im adding it just for this class
    public BananaBread(double banana){
        this.banana = banana;
        setBreadName("Banana Bread");
        setButter(.33);
        setBakingPowder(.50);
        setSalt(1);
        setSugar(.75);
        setEgg(1);
        setVanillaExtract(1);
        setFlour(1.50);
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.printf("%.2f very ripe bananas\n", banana);
        System.out.printf("%.2f cup of melted butter\n", getButter());
        System.out.printf("%.2f teaspoon of baking powder\n", getBakingPowder());
        System.out.printf("%.2f pinch of salt\n",getSalt());
        System.out.printf("%.2f cup of sugar\n", getSugar());
        System.out.printf("%.2f large beaten egg\n", getEgg());
        System.out.printf("%.2f teaspoon vanilla extract \n", getVanillaExtract());
        System.out.printf("%.2f cups of all-purpose flour\n", getFlour());
    }

    @Override
    public void printIntstructions() {
        super.printIntstructions();
        System.out.println("1. Preheat oven to 350f\n" +
                "2. Mash bananas with a fork and add butter into a bowl\n" +
                "3. Mix all remaining ingredients and add to a baking tin\n" +
                "4. Bake the bread for 55-65 minutes or until toothpick inserted into the center comes out clean\n" +
                "5. Cool the bread for few minutes and enjoy!\n");
    }

    @Override
    public String toString() {
        return super.toString() + "This is my favorite sweet bread! ";
    }
}
