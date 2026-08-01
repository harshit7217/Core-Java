package introducingClasses.simpleClass;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return width * height * depth;
    }

    void Dem(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
