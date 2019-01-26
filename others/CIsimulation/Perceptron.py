import numpy as np

class Perceptron(object):

	def __init__(self,n,epoch=100,alpha=0.10,bias=1):
		self.alpha=alpha
		self.epoch=epoch
		self.weights=np.ones(n)
		self.bias=bias

	def predict(self, inputs):
		sum=np.dot(inputs,self.weights)+self.bias
		if sum>0:
			a=1
		else:
			a=0
		return a

	def train(self,training_set, y):
		for _ in range(self.epoch):
			for i,j in zip(training_set,y):
				t=self.predict(i)
				self.weights+=self.alpha*(j-t)*i
				self.bias+=self.alpha*(j-t)