public class SimpleCache implements Cache {
    private Frame last;

    @Override
    public void store(Frame f) {
        last = f;
        System.out.println("Cached last frame? " + (last != null));
    }
}
