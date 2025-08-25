public class Square implements Shape {
    int side;
    void setSide(int side){
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}