# Spring Boot Project with PostgreSQL and JWT Authentication

This is a sample Java project built with Spring Boot, PostgreSQL, and JWT authentication. The project is containerized using Docker and provides multiple routes that can be tested using the Postman API.

## Features

- JWT-based authentication for securing endpoints.
- PostgreSQL database integration for data storage.
- Containerization using Docker for easy deployment.
- Multiple API routes for testing various functionalities.

## Prerequisites

- Java 17 (or compatible Java version)
- Docker
- Postman (for API testing)

## Getting Started

1. Clone the repository to your local machine:

```sh
   git clone <repository-url>
   cd javaspringsecurity2
   docker compose up -d        
```
## Making request

1. post request: http://localhost:8080/auth/register
  
request body:
```sh

    {
       "username": "rakin",
       "password": "password"
    }
```

response body:
```sh

    {
        "userId": 2,
        "username": "rakin",
        "password": "...",
        "authorities": [
            {
                "id": 2,
                "authority": "USER"
            }
        ],
        ...
    }

```

2.post request: http://localhost:8080/auth/login

request body:
```sh

    {
       "username": "rakin",
       "password": "password"
    }
```

response body:
```sh

    {
    "user": {
        "userId": 2,
        "username": "rakin",
        "password": "$2a$10$RayEV9qanN0TvXX6HN8DmuJ5261Q6Snuwi1F7mB0jbd64jtBFC0yK",
        "authorities": [
            {
                "id": 2,
                "authority": "USER"
            }
        ],
        "enabled": true,
        "accountNonExpired": true,
        "accountNonLocked": true,
        "credentialsNonExpired": true
    },
    "jwt": "eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoicmFraW4iLCJpYXQiOjE2OTI0NTM4MjUsInJvbGVzIjoiVVNFUiJ9.qvqYL1Y2cOGBio4T-iQ28yUF36g3KLF9RflE_8Wxe0EwCEbYIf1WbJ8NyrpOuAo-jnbw-k8HFj4kZ_XzkxO-Gwo2Msa8mjL1S04do8pP43996Ih6ZPGXCOrhcg3l1yxK9u_SUFQOiuyGjK_FT7oM7u3-sl1uHZN0-FP7FoyuO9IiGRZU2ZMCLbYrbV9HNrsI7RNtOWgrj25hYcYZrvAr0I2ZWIxRafNF01h8DcB4B37bbn5hkWosJdaHLHqD2wMjmAqgOhyLRj4q95YuBNkh341Q10q_BAt1wA2Bl-YuyvRB_dNz141e7T2CbMikcE6cmWbCMyFkdIe8Uvx7I_6taw"
}

```


1. post request: http://localhost:8080/admin/

Authorization Bearer token put on postman:
```sh

   eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoicmFraW4iLCJpYXQiOjE2OTI0NTM4MjUsInJvbGVzIjoiVVNFUiJ9.qvqYL1Y2cOGBio4T-iQ28yUF36g3KLF9RflE_8Wxe0EwCEbYIf1WbJ8NyrpOuAo-jnbw-k8HFj4kZ_XzkxO-Gwo2Msa8mjL1S04do8pP43996Ih6ZPGXCOrhcg3l1yxK9u_SUFQOiuyGjK_FT7oM7u3-sl1uHZN0-FP7FoyuO9IiGRZU2ZMCLbYrbV9HNrsI7RNtOWgrj25hYcYZrvAr0I2ZWIxRafNF01h8DcB4B37bbn5hkWosJdaHLHqD2wMjmAqgOhyLRj4q95YuBNkh341Q10q_BAt1wA2Bl-YuyvRB_dNz141e7T2CbMikcE6cmWbCMyFkdIe8Uvx7I_6taw
```


response body:
```sh

    403 Forbidden

```

4.get request: http://localhost:8080/user/ 

Authorization Bearer token put on postman:
```sh

   eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoicmFraW4iLCJpYXQiOjE2OTI0NTM4MjUsInJvbGVzIjoiVVNFUiJ9.qvqYL1Y2cOGBio4T-iQ28yUF36g3KLF9RflE_8Wxe0EwCEbYIf1WbJ8NyrpOuAo-jnbw-k8HFj4kZ_XzkxO-Gwo2Msa8mjL1S04do8pP43996Ih6ZPGXCOrhcg3l1yxK9u_SUFQOiuyGjK_FT7oM7u3-sl1uHZN0-FP7FoyuO9IiGRZU2ZMCLbYrbV9HNrsI7RNtOWgrj25hYcYZrvAr0I2ZWIxRafNF01h8DcB4B37bbn5hkWosJdaHLHqD2wMjmAqgOhyLRj4q95YuBNkh341Q10q_BAt1wA2Bl-YuyvRB_dNz141e7T2CbMikcE6cmWbCMyFkdIe8Uvx7I_6taw
```

response body:
```sh
    hello user Access!
```

Replace `reqest body` with the user as admin then bearer token for adminUser can also access the user route.
