public class PrinterwithScanner implements Printer, Scanner {

    public void print(String text) {
        System.out.println("Print: " + text);
    }

    public void scan(String dstPath) {
        System.out.println("Scanning to: " + dstPath);
    }
}
