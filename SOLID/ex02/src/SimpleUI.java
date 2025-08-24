public class SimpleUI implements UI {
    @Override
    public void show(Frame f) {
        System.out.println("\u25B6 Playing " + f.data.length + " bytes");
    }
}
