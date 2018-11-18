## Lab 9

#### Decorator Pattern
  
Core Design Pattern implementations:
Decorator pattern is implemented in the original code. Five decorators are used to describe the book. There is one decorator abstract class which implements the book interface.
  
  
#### Java Lambda / Functional Style
  
In the lambda way of writing the Decorator pattern, there was no need for separate classes for the different decorators. Thus the five decorators classes are eliminated and it can be implemented directly in the context class using lambda function.  
  
  
#### Comparison between Java pattern implementation and Java Lambda Implementation:
  
Lambda function treats function as a method argument without belonging to any class which leads to compact and managable code by reducing the number of classes.  
