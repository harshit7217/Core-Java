package aCloserLookAtMethodsAndClasses.OverloadingConstructor;

public class Box {
    double width;
    double height;
    double depth;

//    constructor used when all dimension specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

//    constructor used when no dimensions specified
    Box(){
        this.width = this.height = this.depth = -1;
    }

//    constructor used when cube is created
    Box(double len){
        this.width = this.height = this.depth = len;
    }

//    computed and return volume
    double volume() {
        return width * height * depth;
    }
}
