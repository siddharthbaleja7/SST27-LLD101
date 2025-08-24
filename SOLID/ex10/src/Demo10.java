public class Demo10 {
    public static void main(String[] args) {
        // This Demo Violates SRP , DIP and OCP
        Logger logger = new ConsoleLogger();
        ReportService reportService = new ReportService(logger);
        reportService.generate();
    }
}
