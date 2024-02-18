public class Muffins extends Bread{
//    private double egg;
//    private double milk;
//    private double vegetableOil;
//https://www.allrecipes.com/recipe/6874/best-ever-muffins
    public Muffins(double egg, double milk, double vegetableOil){
//        super();
//        this.egg = 1.0;
//        this.milk = 1.0;
//        this.vegetableOil = 0.25;
        setEgg(1.0);
        setMilk(1.0);
        setVegetableOil(.25);
        setBakingPowder(3);
        setBreadName("Muffins");
        setFlour(2);
        setSugar(0.75);
        setSalt(0.5);

    }
    // added oil milk and eggs sourdough does not use those three
    public void getIngredients(){
       super.getIngredients();
        System.out.printf("%.2f egg\n", getEgg());
        System.out.printf("%.2f cup of milk\n", getMilk());
        System.out.printf("%.2f cup of vegetable oil\n", getVegetableOil());
        System.out.printf("%.2f cup of white sugar\n", getSugar());
        System.out.println("\n");
    }
    public String toString(){
        return super.toString()+"Muffins are usually too sweet!";
    }

    @Override
    public void printIntstructions() {
        super.printIntstructions();
        System.out.println("1. Preheat oven to 400F and grease up a muffin tin\n" +
                "2. Stir flour baking powder salt and sugar in a bowl and make a well in the center\n" +
                "3. Beat an egg with a fork in a bowl, whisk with milk and oil \n" +
                "4. Mix quickly with a fork \n" +
                "5. spoon made batter into prepared muffin tins 3/4 full\n" +
                "6. Bake in preheated oven for around 25 minutes and serve after cooled for 10 mintues \n");
    }
}
