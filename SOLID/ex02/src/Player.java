public class Player {
    private Decoder decoder;
    private UI render;
    private Cache cache;
    public Player(Decoder decoder , UI render , Cache cache){
        this.decoder = decoder;
        this.render = render;
        this.cache = cache;
    }
    void play(byte[] fileBytes){
        // // decode
        // Frame f = new Frame(fileBytes); // pretend decoding
        // last = f;
        // // draw UI
        // System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // // cache
        // System.out.println("Cached last frame? " + (last!=null));
        Frame f = decoder.decode(fileBytes);
        render.show(f);
        cache.store(f);
    }
}