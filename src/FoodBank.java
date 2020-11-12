
public class FoodBank {
    private int food;
    public FoodBank(){
        this.food=0;
    }
    synchronized public void giveFood(int numFood){
        this.food+=numFood;
        System.out.println("Giving " + numFood + " items of food, the balance is now " + this.food +" items.");
        notify();
    }
    synchronized public void takeFood(int numFood) {
        if(food-numFood <= 0){
            try {
                System.out.println("Waiting to get food");
                wait();
                takeFood(numFood);
            }catch (InterruptedException e ){
                System.out.println(e);
            }

        }else {
            this.food -= numFood;
            System.out.println("Taking " + numFood + " items of food, the balance is now " + this.food +" items.");
        }
    }
}
