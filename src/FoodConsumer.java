public class FoodConsumer extends Thread {
    private FoodBank bank;
    public FoodConsumer(FoodBank food){
        this.bank=food;
    }

    @Override
    public void run(){
        try {
            while(true){
                int food = (int)(Math.random() *  101) + 0;
                bank.takeFood(food);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
