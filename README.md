# Rest Assured Example

This project gives the basic example of using Rest Assured library to test your API endpoints.

### Example

Hitting the endpoint at URL:

```
http://localhost:8080/user/1
```

and you would get back the following JSON response

```json
{
  "userId": 1,
  "firstName": "Joe",
  "secondName": "Bloggs",
  "email": "me@email.com",
  "dob": "3880-09-28T23:00:00.000+0000",
  "address": {
    "firstLineAddress": "My First Line Address",
    "secondLineAddress": "My Second Line Address",
    "postCode": "MU3 28P",
    "city": "Paris",
    "country": "UK"
  }
}
```

### Technologies

- Java 8
- Spring Boot
- Rest Assured