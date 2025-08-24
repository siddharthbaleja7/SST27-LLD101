public class SimpleDecorder implements  Decoder{
    @Override
    public Frame decode(byte[] fileBytes){ 
        return new Frame(fileBytes); 
    }

}
