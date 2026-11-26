package Banking;

class Time implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=60;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }if(i==60){

                System.exit(0);
            }
        }
    }
}
