public class Demo02 {
    public static void main(String[] args) {
        // This Demo violates SRP , O/I , DIP
        Decoder decoder = new SimpleDecorder();
        UI render = new SimpleUI();
        Cache cache = new SimpleCache();
        Player player = new Player(decoder,render,cache);
        player.play(new byte[]{1,2,3,4});
    }
}
