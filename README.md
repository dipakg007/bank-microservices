# Bank Microservices Project

![Bank Microservices](https://github.com/dipakg007/bank-microservices/blob/main/bank-microservices.png)

Welcome to the Bank Microservices project! This repository houses a collection of microservices designed to manage various aspects of a bank's operations. Each microservice is containerized using Docker and orchestrated using Docker Compose for easy development, testing, and deployment.

## Project Overview

The Bank Microservices project aims to demonstrate the benefits of a microservices architecture for managing a banking system. It's divided into several microservices, each responsible for specific functionalities such as user management, account management, transactions, and more.

### Microservices Included

1. **Account Service**: Manages customer bank accounts and transactions.
2. **Customer Service**: Handles customer registration, authentication, and profile management.
3. **Transaction Service**: Records and processes financial transactions.
4. **Notification Service**: Sends notifications to customers for various banking activities.
5. **Eureka Server**: Service discovery server to help microservices find and communicate with each other.
6. **Zuul Gateway**: API gateway to manage routing and access to microservices.

## Getting Started

Follow these steps to set up and run the project on your local machine:

### Prerequisites

- Docker and Docker Compose installed on your system.

### Clone the Repository

```bash
git clone https://github.com/dipakg007/bank-microservices.git
cd bank-microservices
```

### Run the Microservices

Use Docker Compose to spin up all the microservices:

```bash
docker-compose up -d
```

This command will create Docker containers for each microservice and start them in the background.

### Access the Microservices

Once the containers are up and running, you can access the microservices via their respective endpoints. Refer to the individual microservices' documentation for API endpoints and usage details.

### Cleanup

To stop and remove the containers:

```bash
docker-compose down
```

## Contributing

We welcome contributions from the community. If you find issues or want to enhance the project, please submit pull requests or open issues on the GitHub repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Happy microservice banking! 🏦🚀

For more information, visit the [GitHub repository](https://github.com/dipakg007/bank-microservices).
