package introducingClasses.simpleClass;

public class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    void Dem(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
