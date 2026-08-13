package inheritance.morePracticalExample;

public class Box {
    int width;
    int height;
    int depth;

//    Passing Box object constructor
    public Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

//    Passing three dimension of the Box
    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

//    Passing no dimension of the Box
    public Box() {
        width = height = depth = -1;
    }

//    Passing the cube dimension of the box
    public Box(int length){
        width = height = depth = length;
    }

//    Volume of the box
    public double volume() {
        return width*height*depth;
    }
}
