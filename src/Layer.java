public class Layer {

    protected Node[] nodes;
    protected int size;
    protected Layer nextLayer;

    public Layer(int numberOfNodes) {


        nodes = new Node[numberOfNodes];
        for(int i = 0; i < numberOfNodes; i++){
            nodes[i] = new Node();
        }

        size = numberOfNodes;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
