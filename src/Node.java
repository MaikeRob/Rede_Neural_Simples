public class Node{

    private float bias;
    private Connection[] connections;


    public Node() {
        this.bias = 0;
    }

    public float getBias() {
        return bias;
    }

    public void setBias(float bias) {
        this.bias = bias;
    }

    public void createConnections(Layer nextLayer) {
        connections = new Connection[nextLayer.size];
        for (int i = 0; i < nextLayer.size; i++) {
            connections[i] = new Connection(this, nextLayer.nodes[i]);

        }
    }
}