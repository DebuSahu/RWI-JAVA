public class IntExp extends Thread {
    public void run(){
        try {
            for(int i=1;i<=10;i++){
                System.out.println(i);
                if(i==5){
                    System.out.println("You have only 5 seconds left");
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Time Over");
    }

    public static void main(String[] args) {
        IntExp t = new IntExp();
        t.start();
    }
    
}
