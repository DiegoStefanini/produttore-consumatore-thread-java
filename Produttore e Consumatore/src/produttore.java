public class produttore implements Runnable{
    private buffer Buffer;
    public produttore(buffer a) {
        Buffer = a;
    }
    public void run() {
        int x, t;
        while (true) {
            x = (int) (Math.random() * 1024);
            t = (int)  (Math.random() * 1001) + 100;
            Buffer.push(x);
            try {
                Thread.sleep(t);
            } catch (InterruptedException e) {}
        }
    }
}
