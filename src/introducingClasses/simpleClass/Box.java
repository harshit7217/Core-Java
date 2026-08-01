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

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width * height * depth;
    }

    void Dem(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
