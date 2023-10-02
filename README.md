# Bank Microservices Project

Welcome to the Bank Microservices project! This repository houses a collection of microservices designed to manage various aspects of a bank's operations. Each microservice is containerized using Docker and orchestrated using Docker Compose for easy development, testing, and deployment.

## Project Overview

The Bank Microservices project aims to demonstrate the benefits of a microservices architecture for managing a banking system. It's divided into several microservices, each responsible for specific functionalities such as user management, account management, transactions, and more.

### Microservices Included

1. **Accounts Service**: Manages customer bank accounts.
2. **Cards Service**: Handles Cards registration, authentication, and profile management.
3. **Loans Service**: Handles Loans registration, authentication, and profile management.
4. **Config Service**: To externalize the configuration

## Getting Started

Follow these steps to set up and run the project on your local machine:

### Prerequisites

- Docker and Docker Compose installed on your system.

### Clone the Repository

```bash
git clone https://github.com/dipakg007/bank-microservices.git
cd bank-microservices
```

### Navigate to docker env folder

```bash
cd docker-compose 
cd [default/qa/prod]
```

### Run the Microservices

Use Docker Compose to spin up all the microservices:

```bash
docker-compose up -d
```

This command will create Docker containers for each microservice and start them in the background. Wait for around 5min to get all the services up.

### Access the Microservices

Once the containers are up and running, you can access the microservices via their respective endpoints. Refer to the individual microservices' documentation for API endpoints and usage details.

### Below are the end points to access all the microservices 

1. [accounts-service](http://localhost:8080/swagger-ui/index.html)
2. [loans-service](http://localhost:8090/swagger-ui/index.html)
3. [cards-service](http://localhost:9000/swagger-ui/index.html)


### Cleanup

To stop and remove the containers:

```bash
docker-compose down
```

