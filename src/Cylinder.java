public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with Height = "+this.height+" Volume = "+this.getVolume()+" m3. which is subclass of "+super.toString();
    }
}
