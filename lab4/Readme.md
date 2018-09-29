Images of the following CRC files are added:
	
	1. Customer CRC - This class represents customer of the restaurant. It is a observer.
	2. Restaurant CRC - This class represents the restaurant. It is a observer.
	3. Table CRC - This class represents tables of the restaurant. It acts as subject of the observer pattern.
	4. TableAvailable CRC - This class represents the available state of the table.
	5. TableOccupied CRC - This class represents the occupied state of the table.

Design patterns used:
	
	1. State pattern: It is used to maintain the states of the tables which are available and occupied.
	   This states are used to to trigger wait-list management.
	
	2. Observer pattern:There are two observers: Customer and Restaurant.
	   Customer receives the notifications and acts according to it.
	   When table state changes to available, Restaurant determines the next customer from the wait-list and notify that customer.
	   Also on receiving the message from the customer, it acts according to it whether assign that table to customer(On confirm) or 
	   remove that customer from the wait-list and find the next customer from the wait-list(On cancel).
	