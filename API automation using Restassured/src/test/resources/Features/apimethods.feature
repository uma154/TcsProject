Feature: verify and validate the get  employee details and delete employee details apis

Scenario: verify the get method retrieves all the employee details

	Given the user is given with the base uri
	When the user calls the get employee details api
	Then all the employee details are displayed successfully
	Then verify the success code 200
	


Scenario Outline: verify the get method retrieves the employee details
	Given the user is given with the base uri
	When  the user calls the get employee details api with the "<id>"
	Then the employee details should be displayed successfully
	Then verify the success code 200

Examples:
|id|
|1|


#Scenario Outline: verify the delete method deletes the employee details
#	Given the user is given with the base uri
#	When  the user calls the delete employee details api with the "<id>"
#	Then the employee details should be deleted successfully
#	Then verify the success code 200
#Examples:
#|id|
#|2|