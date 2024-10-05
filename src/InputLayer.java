public class InputLayer extends Layer{

    public InputLayer(int numOfInputNodes) {
        super(numOfInputNodes);
    }

    void receiveData(float[] data) {
        for(int i = 0; i < this.size; i++) {
            nodes[i].setBias(data[i]);
        }

    }
}
