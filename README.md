# employeeexpense

#Dependencies

  - To install java visit the link  - https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html
  - To initiate spring boot project - https://start.spring.io/
  - To install MySQL version 8 or later - https://dev.mysql.com/downloads/installer/
 
 
 #Description 
 
  - This repository gives you an overview of how to design a basic employee expenses management service using Java,Spring boot and Hibernate,MySQL. Basically this is a RESTful API.

#Request and Response 

 - For validate employee id is exist or not
      url: {{base_url}}/api/employee/validate/{employeeId}
      method: Get
      body: 
      response: {
    "isValid": true,
    "employeeId": 14,
    "message": "This employee id exist"
     }

 - For submit expense
 
  url: {{base_url}}/api/employee/expenses/expense
      method: Post
      body: {   
  "employeeId": 14,
  "itemType": "Expense",
  "type": "Gas", 
  "amount": { 
    "value": "1000.00", 
    "currency": "INR"
            },  
  "description": "It is a dummy expense",
  "status": "paid" 
} 
      response: {
    "message": "expense submitted successfully",
    "isSuccess": true
}
 
  - For get expenses list for a employee id

 url: {{base_url}}/api/employee/expenses/expense/{employeeId}
      method: Get
      body: 
      response:[
    {
        "employeeId": 14,
        "itemType": "Expense",
        "type": "Gas",
        "amount": {
            "value": "1000.00",
            "currency": "INR"
        },
        "description": "It is a dummy expense",
        "status": "submitted"
    },
    {
        "employeeId": 14,
        "itemType": "Expense",
        "type": "Internet",
        "amount": {
            "value": "1000.00",
            "currency": "INR"
        },
        "description": "It is a dummy expense",
        "status": "paid"
    }
    ]

