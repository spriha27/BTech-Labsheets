import numpy as np
from Perceptron import Perceptron

training_inputs=[]
training_inputs.append(np.array([1,1]))
training_inputs.append(np.array([1,0]))
training_inputs.append(np.array([0,1]))
training_inputs.append(np.array([0,0]))

y=np.array([1,0,0,0])

perceptron=Perceptron(2);
perceptron.train(training_inputs,y)

example=np.array([1,1])
print("inputs: 1, 1 gives :"+str(perceptron.predict(example)))

example=np.array([0,1])
print("inputs: 0, 1 gives :"+str(perceptron.predict(example)))
