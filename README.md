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

### The API Test

 Using the Rest Assured library we write the test code as:

 ```java
    @Test
    public void testGetUserDetails() {
        when().
            get("/user/{userId}", 1).
        then().
            statusCode(200).
            body("userId", equalTo(1),
                 "firstName", equalTo("Joe"),
                 "secondName", equalTo("Bloggs"),
                 "email", equalTo("me@email.com"),
                 "address.firstLineAddress", equalTo("My First Line Address"),
                 "address.secondLineAddress", equalTo("My Second Line Address"),
                 "address.postCode", equalTo("MU3 28P"),
                 "address.city", equalTo("Paris"),
                 "address.country", equalTo("UK"));
    }
 ```

 See `UserResourceAPITest.java` in the source code.


### Technologies

- Java 8
- Spring Boot
- Rest Assured