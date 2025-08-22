package book5.chapter1;

class LaunchEventNew implements Runnable{

    private String message;
    public LaunchEventNew(String message)
    {
        this.message = message;
    }
    @Override
    public void run()
    {
        System.out.println(message);
    }
}