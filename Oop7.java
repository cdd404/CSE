package jo;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int newWidth) {
        width = newWidth;
    }

    @Override
    public void resizeHeight(int newHeight) {
        height = newHeight;
    }

    public void display() {
        System.out.println("Rectangle Width: " + width);
        System.out.println("Rectangle Height: " + height);
    }
}

class TestResizable {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 10);
        System.out.println("Original Rectangle:");
        rectangle.display();
        rectangle.resizeWidth(7);
        rectangle.resizeHeight(15);
        System.out.println("Resized Rectangle:");
        rectangle.display();
    }
}
