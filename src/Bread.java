public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName = "Bread";
    private double milk;
    private double egg;
    private double vegetableOil;
    private double starter;
    private boolean isBaked;
    private double butter;
    private double vanillaExtract;

    public Bread(){
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.breadName = "Bread ";

    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName,boolean isBaked, double egg, double milk, double vegetableOil, double starter,double butter,double vanillaExtract           ){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.milk = milk;
        this.egg = egg;
        this.vegetableOil = vegetableOil;
        this.starter = starter;
        this.butter = butter;
        this.vanillaExtract = vanillaExtract;


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


    public void setIsBaked(boolean baked){
        this.isBaked = baked;
    }
    public double getMilk(){
        return milk;
    }
    public void setMilk(double milk){
        this.milk = milk;
    }
    public double getEgg(){
        return egg;
    }
    public void setEgg(double egg){
        this.egg = egg;
    }

    public double getVegetableOil() {
        return vegetableOil;
    }

    public void setVegetableOil(double vegetableOil) {
        this.vegetableOil = vegetableOil;
    }

    public double getStarter() {
        return starter;
    }

    public void setStarter(double starter) {
        this.starter = starter;
    }

    public void setBaked(boolean baked) {
        isBaked = baked;
    }
    public double getButter(){
        return butter;
    }
    public void setButter(double butter) {
        this.butter = butter;
    }
    public double getVanillaExtract(){
        return vanillaExtract;
    }
    public void setVanillaExtract(double vanillaExtract) {
        this.vanillaExtract = vanillaExtract;
    }
    public void getIngredients(){
        System.out.printf("Ingredients of %s are: \n", breadName);
        System.out.printf("%.2f cups of flour\n", flour);
        System.out.printf("%.2f teaspoon of salt\n", salt);


    }
//    public String getIngredients(){
//        return "Ingredients for " + breadName;
//    }
    public void printIntstructions(){ //

        System.out.printf("Instructions for %s:\n",breadName); //added this to if you get instructions for any bread it also shows the correct bread name
    }

    public void bake(boolean isBaked){
        if(isBaked){
            System.out.print(breadName +" is baked!");
        }
        else System.out.println(breadName + " is not baked!");
    }
    public String toString(){
        return breadName + " has something I like:\n";
    }
}
