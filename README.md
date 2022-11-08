Reward Web Services:

Build the project with below commad
mvn clean install

Run the code
mvn spring-boot:run

Rest API detail

1. Get Customer By Id

Method : Get
http://localhost:8080/customers/5
2. Get Transaction By Id
Method : Get

http://localhost:8080/transaction/1
3. Get Reward by Customer Id
Method : Get

http://localhost:8080/transaction/1888
4. Add Customer  Transaction Data
Method : Post

http://localhost:8080/rewards
Paylod
{
	"customerId":5,
	"customerName":"Test",
	"transactionId":10,
	"transactionDate":"2022-10-1 00:00:00",
	"transactionAmount":222.4
	
	
}