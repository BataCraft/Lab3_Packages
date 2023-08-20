public class Threade {
    public static void main( String[]args)
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread name : " +t);
        //get current time in milliseconds
        // change the name of thread
        t.setName("my string");
        try{
            for (int n = 5; n>0; n--){
                System.out.println("" + n);
                Thread.sleep(1000);

            }
            
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
    }
}
