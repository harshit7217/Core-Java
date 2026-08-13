package inheritance.morePracticalExample;

public class BoxWeight extends Box {
    int weight;

    BoxWeight(int width, int height, int depth, int weight){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}