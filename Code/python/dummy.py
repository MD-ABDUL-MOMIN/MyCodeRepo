#!/usr/bin/python3

class Employee:
	'common base class for all employees'
	empcount = 0
	def __init__(self,name,salary):
		self.name = name
		self.salary = salary
		Employee.empcount +=1;
	def display(self):
		print("Total employee ",Employee.empcount)
emp1 = Employee("zara",200)
emp1.display()
