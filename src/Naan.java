public class Naan extends Bread{
    //https://lilluna.com/homemade-naan-bread/
    //I think this and banana bread are my favorite
    //adding greek yogurt and garlic since its more specific to this style of bread compared to really any other bread
    private double yogurt;
    private double garlic;
    public Naan(double yogurt, double garlic){
        this.yogurt = yogurt;
        this.garlic = garlic;
        setBreadName("Naan");
        setWater(.50);
        setSugar(1);
        setVegetableOil(3);
        setEgg(1);
        setSalt(.50);
        setFlour(3);
        setButter(2);
    }
    //adding these getters due to it being unique to the naan class
    //i am not sure if its better to write it like this or add every option to the bread super class
    //and just set all the values here
    public double getYogurt(){
        return yogurt;
    }
    public double getGarlic(){
        return garlic;
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.printf("%.2f cup warm water\n", getWater());
        System.out.printf("%.2f teaspoons instant yeast\n", getYeast());
        System.out.printf("%.2f teaspoon of sugar\n",getSugar());
        System.out.printf("%.2f tablespoons of vegetable oil\n", getVegetableOil());
        System.out.printf("%.2f cup plain yogurt\n", getYogurt());
        System.out.printf("%.2f egg\n", getEgg());
        System.out.printf("%.2f teaspoon salt\n", getSalt());
        System.out.printf("%.2f cups of flour\n", getFlour());
        System.out.printf("%.2f tablespoons of melted butter\n",getButter());
        System.out.printf("%.2f teaspoons minced garlic\n", getGarlic());
        System.out.println("\n");
    }

    @Override
    public void printIntstructions() {
        super.printIntstructions();
        System.out.printf("1.Combine water, yeast, and sugar to large bowl \n" +
                "2. Add enough flour to make soft, knead till smooth\n" +
                "3. Place dough in greased bowl cover and let rise\n" +
                "4. Preheat skillet in medium \n" +
                "5. cut dough into 8 pieces that are 6 inch circles \n" +
                "6. Add a bit of oil to each piece and cook on each side for 2-3 minutes\n" +
                "7. Brush top of bubbly side with the melted butter\n");
    }
    public String toString(){
        return super.toString() + "Naan is probably my favorite savory bread!";
    }
}
