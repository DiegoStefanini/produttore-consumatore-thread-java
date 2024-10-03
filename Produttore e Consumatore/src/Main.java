//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        buffer RisorsaCondivisa = new buffer();
        produttore prod = new produttore(RisorsaCondivisa);
        consumatore cons = new consumatore(RisorsaCondivisa);
        Thread a = new Thread(prod);
        Thread b = new Thread(cons);
        a.start();
        b.start();
    }
}