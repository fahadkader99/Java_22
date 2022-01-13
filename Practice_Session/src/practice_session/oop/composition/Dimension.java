package practice_session.oop.composition;

public class Dimension {

    private int height;
    private int width;
    private int dept;

    public Dimension(int height, int width, int dept) {
        this.height = height;
        this.width = width;
        this.dept = dept;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDept() {
        return dept;
    }
}
