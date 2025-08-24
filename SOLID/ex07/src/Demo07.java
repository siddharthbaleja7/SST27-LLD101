public class Demo07 {
    public static void main(String[] args) {
        Printer m = new BasicPrinter();
        m.print("Hello");
        PrinterwithScanner s = new PrinterwithScanner();
        s.print("Hello");
        s.scan("/tmp/out");
    }
}
