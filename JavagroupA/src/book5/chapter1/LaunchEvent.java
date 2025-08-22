package book5.chapter1;

public class LaunchEvent implements Runnable {
    private  int start;
    private  String message;
TimeMonitor tm;
    public LaunchEvent(int start, String message, TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    @Override
    public void run() {
        {
            boolean eventDone = false;
            boolean abort = false;
            while (!eventDone) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    abort = true;
                }
                if (Thread.interrupted()){
                    abort = true;
                }
                if (abort){
                    System.out.println("Aborting" + message);
                    break;
                }
                if (tm.getTime() <= start) {
                    System.out.println(this.message);
                    eventDone = true;
                    System.out.println("ABORT!!!!");

                }
            }
        }
    }
}
