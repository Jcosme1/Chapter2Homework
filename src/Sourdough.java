public class Sourdough extends Bread{



    public Sourdough(double starter){
       setBreadName("Sourdough");
       setFlour(5.00);
       setWater(1.50);
       setSalt(2.50);
       setYeast(1.00);
       setStarter(1.00);
    }
    @Override
    public void getIngredients(){
        super.getIngredients();
        System.out.printf("%.2f cups of starter\n", getStarter());
        System.out.printf("%.2f cups of water\n", getWater());
        System.out.printf("%.2f tsp of yeast \n",getYeast());
        System.out.print("\n");

    }
    public void printInstructions() {
        super.printIntstructions();
        System.out.println("A recipe of Sourdough Bread:\n1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n2. Make the dough\n3. Bulk Rise\n4. Stretch and fold the dough\n5. Cut and shape the dough6. Second rise\n6. Preheat the oven to 450°F towards the tail end of the second rise.\n7. Spray the laof with luke warm water.\n8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n9. Remove the bread from the oven.\n10. Let the bread cool until good to eat.");
        System.out.print("\n");
    }


    public String toString(){
        return super.toString() + "A really good savory bread that I can't eat much due to a medical condition ";
    }
}
