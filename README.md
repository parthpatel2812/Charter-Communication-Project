# Charter-Communication-Project

Request 
curl --location --request POST 'http://localhost:8080/api/rewards/calculate' \
--header 'Content-Type: application/json' \
--data-raw '[
    {
        "customerId": "C001",
        "amount": 120.0,
        "date": "2024-01-10"
    },
    {
        "customerId": "C001",
        "amount": 80.0,
        "date": "2024-01-15"
    },
    {
        "customerId": "C001",
        "amount": 150.0,
        "date": "2024-02-10"
    },
    {
        "customerId": "C002",
        "amount": 100.0,
        "date": "2024-02-15"
    },
    {
        "customerId": "C001",
        "amount": 40.0,
        "date": "2024-03-05"
    }
]'



Response 

{
    "C002": {
        "monthlyPoints": {
            "FEBRUARY": 50
        },
        "totalPoints": 50
    },
    "C001": {
        "monthlyPoints": {
            "JANUARY": 120,
            "MARCH": 0,
            "FEBRUARY": 150
        },
        "totalPoints": 270
    }
}
