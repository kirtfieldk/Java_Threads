public class FoodProducer extends Thread {
    private FoodBank bank;
    public FoodProducer(FoodBank food){
        this.bank=food;
    }

    @Override
    public void run(){
        try {
        while(true){
                int food = (int)(Math.random() * 101) + 0;
                bank.giveFood(food);
                Thread.sleep(100);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
