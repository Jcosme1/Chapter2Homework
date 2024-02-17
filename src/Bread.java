public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName = "Bread";
    private boolean  isBaked;

    public Bread(){
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.breadName = "Bread ";

    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName,boolean isBaked){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;

    }
    //setters and getters
    public double getFlour() {
        return flour;
    }
    public void setFlour(double flour) {
        this.flour = flour;
    }
    public double getWater() {
        return water;
    }
    public void setWater(double water) {
        this.water = water;
    }
    public double getSalt() {
        return salt;
    }
    public void setSalt(double salt) {
        this.salt = salt;
    }
    public double getSugar() {
        return sugar;
    }
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public double getBakingPowder() {
        return bakingPowder;
    }
    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }
    public double getYeast() {
        return yeast;
    }
    public void setYeast(double yeast) {
        this.yeast = yeast;
    }
    public String getBreadName() {
        return breadName;
    }
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public boolean isBaked(){
        return isBaked;
    }
    public void setIsBaked(boolean baked){
        this.isBaked = baked;
    }
    public void getIngredients(){
        System.out.printf("Ingredients of %s are: \n", breadName);
        System.out.printf("%.2f cups of flour\n", flour);
        System.out.printf("%.2f teaspoon of salt\n", salt);


    }
    public void printIntstructions(){ //

    }
}
