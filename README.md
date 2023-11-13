# **Kata2**

This project consists of processing a set of data through a series of object classes and interfaces.  The dataset consists of 4 columns (Food name, scientific name, group and subgroup to which it belongs). 
The objective is to calculate the number of food items per subgroup.

**Classes:**
- Food --> This class simulates each record of the dataset with its attributes.
- CsvFileFoodLoader --> Through its methods a data collection is obtained.
- SubGroupHistogramCalculator --> is the class that allows processing the data.
- Main --> it is used to execute the code

**Interfaces:**
- FoodLoader --> it consists of a method to obtain a list of data.
- HistogramCalculator --> has a method to calculate with the data.
