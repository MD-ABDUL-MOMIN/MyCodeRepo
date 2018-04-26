from sklearn.model_selection import train_test_split
from sklearn.datasets import load_iris
import mglearn
import pandas as pd
from pandas.plotting import scatter_matrix
import matplotlib.pyplot as plt
iris_dataset = load_iris()
X_train,X_test,y_train,y_test = train_test_split(iris_dataset['data'],iris_dataset['target'],random_state=0)
iris_dataframe = pd.DataFrame(X_train,columns=iris_dataset.feature_names)
grr = scatter_matrix(iris_dataframe,c=y_train,figsize=(15,15),marker='o',cmap=mglearn.cm3,hist_kwds={'bins':20},s=40,alpha=.8,)
plt.show()