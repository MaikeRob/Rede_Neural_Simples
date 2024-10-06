public class Connection {

    private Node from;
    private Node to;
    private float weight;

    public Connection(Node from, Node to) {
        weight = (float) (Math.random() * 2 - 1);
        this.from = from;
        this.to = to;
    }
    
}