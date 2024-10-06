

public class Model {

    private InputLayer inputLayer;
    private ExitLayer exitLayer;

    public Model(int numOfInputNodes, int numberOfNodes, int numOfExitNodes) {

        ExitLayer exitLayer = new ExitLayer(numOfExitNodes);
        Layer hiddenLayer = new Layer(numberOfNodes);
        hiddenLayer.nextLayer = exitLayer;
        InputLayer inputLayer = new InputLayer(numOfInputNodes);
        inputLayer.nextLayer = hiddenLayer;

    }

    void receiveBiasAndWheightValues() {

    }

    void predict(float[] data) {
        this.inputLayer.receiveData(data);
    }


}
