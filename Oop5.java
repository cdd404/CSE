package kk1;

class shape {
    public void draw() { System.out.println("Drawing a shape"); }
    public void erase() { System.out.println("Erasing a shape"); }
}

class circle extends shape {
    @Override
    public void draw() { System.out.println("Drawing a circle"); }
}

class Triangle extends shape {
    @Override
    public void draw() { System.out.println("Drawing a triangle"); }
}

class Square extends shape {
    @Override
    public void draw() { System.out.println("Drawing a square"); }
    @Override
    public void erase() { System.out.println("Erasing a square"); }
}

class Main {
    public static void main(String[] args) {
        shape s = new shape();
        circle c = new circle();
        s.draw();
        c.draw();
    }
}
