public class consumatore implements Runnable{
    private buffer Buffer;
    private int pari, dispari;
    public consumatore(buffer a) {
        Buffer = a;
        pari = 0;
        dispari = 0;
    }
    public void run() {
        int n;
        while (true) {
            if (Buffer.Pieno()) {
                n = Buffer.pop();
                if (n != -1) {
                    if (n % 2 == 0) {
                        pari++;
                    } else {
                        dispari++;
                    }
                    System.out.println("Ho letto " + n + ", n dispari: " + dispari + " n pari: " + pari);
                }
            }
        }
    }
}
