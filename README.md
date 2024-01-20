# Currency Exchange Conversion Service

## Overview
This project implements a microservices architecture to provide a currency exchange and conversion service. It's designed with scalability and modularity in mind, featuring several key services like currency conversion, exchange rate fetching, and service discovery.

## Services
- **API Gateway**: Routes incoming API requests and implements logging.
- **Currency Conversion Service**: Handles the conversion of currency based on exchange rates.
- **Currency Exchange Services**: Provides current exchange rates. Instances run on ports 8000 and 8001.
- **Limits Service**: Manages operational limits within the application.
- **Naming Server**: Service registry for microservices discovery.
- **Spring Cloud Config Server**: Manages external configuration.

## Technologies
- Java with Spring Boot
- Maven for dependency management
- Docker for containerization
- Eureka for service discovery
- Spring Cloud Config for externalized configuration

## Getting Started
To run this project locally, you'll need Docker and Maven installed on your machine. Follow these steps:

1. Clone the repository: 
 git clone https://github.com/ahmedhossam318/currency-exchange-conversion.git

2. Build the project with Maven:
 docker-compose up


## API Endpoints

### API Gateway
- **Route Requests**
  - **Endpoint**: `/api/{service-name}/{endpoint}`
  - **Method**: GET/POST
  - **Description**: Routes requests to the appropriate microservice.
  - **Request Parameters**: Dependent on specific service endpoint.
  - **Response Format**: Dependent on specific service endpoint.

### Currency Conversion Service
- **Convert Currency**
  - **Endpoint**: `/currency-conversion/from/{from}/to/{to}/quantity/{quantity}`
  - **Method**: GET
  - **Request Parameters**:
    - `from`: Source currency (e.g., USD)
    - `to`: Target currency (e.g., INR)
    - `quantity`: Amount to be converted
  - **Response Format**: JSON containing converted amount and conversion details.

### Currency Exchange Service
- **Retrieve Exchange Rate**
  - **Endpoint**: `/currency-exchange/from/{from}/to/{to}`
  - **Method**: GET
  - **Request Parameters**:
    - `from`: Source currency
    - `to`: Target currency
  - **Response Format**: JSON with the exchange rate and additional currency details.

### Limits Service
- **Retrieve Configuration Limits**
  - **Endpoint**: `/limits`
  - **Method**: GET
  - **Description**: Fetches the current configuration limits.
  - **Response Format**: JSON containing configuration details like minimum and maximum values.


## Contributing
Contributions to the project are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature-branch-name`.
3. Make your changes and commit them: `git commit -m 'Commit message'`.
4. Push to the original branch: `git push origin feature-branch-name`.
5. Create the pull request.

Alternatively, see the GitHub documentation on [creating a pull request](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## Contact
For any queries, feel free to contact us.



