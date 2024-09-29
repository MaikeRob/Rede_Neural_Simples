# Suprimir avisos do TensorFlow sobre não termos a CPU
import os

os.environ['TF_CPP_MIN_LOG_LEVEL'] = '3' #exibe apenas erros criticos


from keras import layers, models, datasets

# Tratamento de dados
mnist = datasets.mnist

(x_train, y_train), (x_test, y_test) = mnist.load_data()

x_train, x_test = x_train / 255.0, x_test / 255.0

# Definição de modelo
model = models.Sequential([
    layers.Input(shape=(28, 28)), # Defina a entrada explicitamente
    layers.Flatten(),
    layers.Dense(10, activation='relu'),  # Primeira camada totalmente conectada com 128 neurônios
    layers.Dropout(0.2),                   # Dropout para evitar overfitting
    layers.Dense(10, activation='softmax') # Camada de saída com 10 neurônios (10 classes de dígitos)
])


model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy',
              metrics=['accuracy'])


# Validação
model.fit(x_train, y_train, epochs=5)

# Avaliar o modelo no conjunto de testes
#model.evaluate(x_test, y_test)

model.summary()

# Recuperando os pesos e bias de todas as camadas do modelo ruim
for i, layer in enumerate(model.layers):
    weights, biases = layer.get_weights()  # Obtém os pesos e bias da camada
    print(f"Camada {i + 1}: {layer.name}")
    print(f"  Pesos (weights): {weights.shape}")
    print(f"  Bias: {biases.shape}")

