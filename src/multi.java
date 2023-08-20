
class multi extends Thread {
    public void run() {
        System.out.println("Thread Runningg>>>>>>>>>>>>>>*****************/////////////////////.........");

    }
    public static void main(String[] args) {
        multi t1 = new multi();
        t1.start();
    }
}