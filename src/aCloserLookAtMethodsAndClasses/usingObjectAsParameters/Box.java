package aCloserLookAtMethodsAndClasses.usingObjectAsParameters;

public class Box {
    double width;
    double height;
    double depth;

//    Notice this constructor. It takes an object of type Box.
    Box(Box ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

//    constructor used when all dimension specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

//    constructor used when no dimension specified
    Box(){
        this.width = this.depth = this.height = -1;
    }

//    constructor used when cube is created
    Box(double len){
        this.width = this.depth = this.height = len;
    }

//    compute and return volume
    double volume(){
        return width * height * depth;
    }
}
