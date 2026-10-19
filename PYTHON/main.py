import pandas as pd


# data = [100.1,101.2,102.3]

# series = pd.Series(data, index =['a','b','c'])

 

# print(series.loc ["a"])


calories = {"Day1": 1750,"Day2": 1800,"Day3": 1900}

series = pd.Series(calories)

print(series)