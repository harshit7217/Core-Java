package inheritance.superConstructor;

public class Box {
    private int width;
    private int height;
    private int depth;

//    Creating a box using object
    Box (Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

//    Creating a box using three dimension
    Box (int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

//    Creating a box on zero dimension
    Box () {
        width = height = depth = -1;
    }

//    Creating a cube of the Box
    Box(int len){
        width = height = depth = len;
    }

//    Finding the volume of the Box
    int volume(){
        return width*height*depth;
    }
}
