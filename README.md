# first-study-project

**Get user**

```shell
curl http://localhost:8080/api/v1/users/{id}
```

**Get all user**

```shell
curl http://localhost:8080/api/v1/users
```

**Create user**

```shell
curl --location 'localhost:8080/api/v1/users' \
--header 'Content-Type: application/json' \
--data '{
    "login": "testLogin",
"name": "TestName",
"lastName": "TestLastName",
"amount": "testAmount"
}'
```
**Update user**

```shell
curl --location --request PUT 'localhost:8080/api/v1/users/{id}' \
--header 'Content-Type: application/json' \
--data '{
    "name": "TestName",
    "lastName": "TestLastName"
}'
```

**Up balance user**

```shell
curl localhost:8080/api/v1/users/{id}/upBalance/{amount}
```

**Get users size**

```shell
curl localhost:8080/api/v1/users/counter
```