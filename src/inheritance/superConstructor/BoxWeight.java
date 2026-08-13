package inheritance.superConstructor;

public class BoxWeight extends Box {
    private int weight;

//    Using Object
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

//    Using three dimension of the Box
    BoxWeight(int width, int height, int depth, int weight){
        super(width, height, depth);
        this.weight = weight;
    }

//    Using no dimension of the box
    BoxWeight(){
        super();
        weight = -1;
    }

//    Using cube of the box
    BoxWeight(int len, int weight){
        super(len);
        this.weight = weight;
    }

    int getWeight(){
        return weight;
    }
}
