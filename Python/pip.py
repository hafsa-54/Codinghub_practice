import numpy as np
import pandas as pd
# rng=np.random.default_rng()
# flips=rng.integers(0,2,size=100000)
# prob_heads=np.mean(flips)
# print("estimated probability of heads",prob_heads)
# s=pd.Series([10,20,30,30,20,40,50,43,60,21,50,43],index=['a','b','c','d','e','f','g','h','i','j','k','l'])
# print(s)
# print("values : ",s.values)
# print("index : ",s.index)
# print("data type: ",s.dtype)
# print(s.head)
# print(s.tail)
# print(s.value_counts())
data={
    'name':['alice','bob','charlie'],
    'age':[12,32,21],
    'city':['new york','china','england'],
    'salary':[70000,80000,90000]

}
fad=pd.DataFrame(data)
fad=pd.read_csv("sales_data.csv",parse_dates=["Date"],dtype={"Category":"category"})
fad.info()
# print("original data frame/n",fad)
# # print(fad)
# subset_loc=fad.loc[1:3,['name','salary']]
# print("subset with .loc",subset_loc)
# subset_iloc=fad.iloc[0:3,1:3]
# print("subset with .iloc \n",subset_iloc)
# high_salary=fad[fad['salary']>75000]
# print("high slaary",high_salary)
# fad.loc[fad['age']<30,'salary']=20000
# print("low salary",fad.loc[fad['age']<30,'salary'])
fad['Sales']=pd.to_numeric(fad['Sales'])
fad.info()
# df=pd.read_csv('sales_data.csv')_
# print("info:\n",df.info())
# print("shape :\n",df.shape)
