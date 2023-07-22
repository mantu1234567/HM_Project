# Hotel Management Practice

This repository contains a simple Java application for Hotel Management. It provides functionality to manage hotel rooms and their details.

## Tech Stack

The application is built using the following technologies:

- Java
- Spring Boot
- Spring Data JPA (for data access)
- Lombok (for reducing boilerplate code)
- Jakarta Persistence API (JPA)
- Maven (for dependency management)

## Project Structure

The project is organized into packages to keep related files together:

1. `com.geekster.Hotelmanagement_practies.model`: This package contains the entity classes used for representing the hotel room data. The `HotelRoom` class represents a hotel room, and the `TYPE` enum specifies the types of rooms available (e.g., AC, NON_AC, DELUX).

2. `com.geekster.Hotelmanagement_practies.controller`: This package contains the RESTful API controllers that handle incoming requests related to hotel rooms. The `RoomController` class contains methods for adding, updating, deleting, and retrieving hotel rooms.

3. `com.geekster.Hotelmanagement_practies.service`: This package contains the service layer of the application. The `RoomService` class provides methods to perform various operations on hotel rooms.

4. `com.geekster.Hotelmanagement_practies.repository`: This package contains the Spring Data JPA repositories. The `RoomRepo` interface extends `CrudRepository` to perform database operations on `HotelRoom` entities.

## Controller
The Controller layer is responsible for handling incoming HTTP requests and returning appropriate responses. It interacts with the Service layer to perform various operations on hotel rooms. The RoomController class contains the following endpoints:

Add Room: Endpoint to add one or multiple hotel rooms to the system.

Find All Rooms: Endpoint to retrieve all available hotel rooms.

Find Room by ID: Endpoint to retrieve a specific hotel room by its ID.

Check Room Existence: Endpoint to check if a hotel room exists by its ID.

Update Room: Endpoint to update the details of a hotel room by its ID.

Total Number of Rooms: Endpoint to get the total number of hotel rooms.

Find Rooms by Status: Endpoint to find hotel rooms by their availability status (occupied or vacant).

Find Rooms by Status and Type: Endpoint to find hotel rooms by their availability status and type (AC, NON_AC, DELUX).

Find Rooms by Status, Type, and Price Range: Endpoint to find hotel rooms by their availability status, type, and price within a specific range.

Delete Room: Endpoint to delete a hotel room by its ID.

## Service
The Service layer contains the business logic of the application. The RoomService class is responsible for implementing various operations related to hotel rooms. It interacts with the Repository layer to access the data. The RoomService class provides the following methods:

Add Rooms: Method to add one or multiple hotel rooms to the system.

Find All Rooms: Method to retrieve all available hotel rooms.

Get Room by ID: Method to retrieve a specific hotel room by its ID.

Check Room Existence: Method to check if a hotel room exists by its ID.

Update Room: Method to update the details of a hotel room.

Get Total Rooms: Method to get the total number of hotel rooms.

Get Rooms by Status: Method to find hotel rooms by their availability status (occupied or vacant).

Get Rooms by Status and Type: Method to find hotel rooms by their availability status and type.

Get Rooms by Status, Type, and Price Range: Method to find hotel rooms by their availability status, type, and price within a specific range.

Delete Room by ID: Method to delete a hotel room by its ID.

## Repository
The Repository layer is responsible for data access and communication with the database. The RoomRepo interface extends the CrudRepository provided by Spring Data JPA to perform CRUD (Create, Read, Update, Delete) operations on the HotelRoom entities. The interface contains the following methods:

Find Room by ID: Method to find a hotel room by its ID.

Find Rooms by Status: Method to find hotel rooms by their availability status.

Find Rooms by Status and Type: Method to find hotel rooms by their availability status and type.

Find Rooms by Status, Type, and Price Range: Method to find hotel rooms by their availability status, type, and price within a specific range.

Delete Room by ID: Method to delete a hotel room by its ID.

## Functionality

The application provides the following functionalities:

1. Add Room: Endpoint to add one or multiple hotel rooms to the system.

2. Find All Rooms: Endpoint to retrieve all available hotel rooms.

3. Find Room by ID: Endpoint to retrieve a specific hotel room by its ID.

4. Check Room Existence: Endpoint to check if a hotel room exists by its ID.

5. Update Room: Endpoint to update the details of a hotel room by its ID.

6. Total Number of Rooms: Endpoint to get the total number of hotel rooms.

7. Find Rooms by Status: Endpoint to find hotel rooms by their availability status (occupied or vacant).

8. Find Rooms by Status and Type: Endpoint to find hotel rooms by their availability status and type (AC, NON_AC, DELUX).

9. Find Rooms by Status, Type, and Price Range: Endpoint to find hotel rooms by their availability status, type, and price within a specific range.

10. Delete Room: Endpoint to delete a hotel room by its ID.

## Getting Started

To run the application locally, follow these steps:

1. Ensure you have Java JDK and Maven installed on your system.

2. Clone this repository to your local machine.

3. Open the project in your preferred Java IDE.

4. Build the project using Maven.

5. Run the application.

6. The application should now be running, and you can use tools like Postman to test the RESTful API endpoints.

## Contributing

If you wish to contribute to this project, feel free to create pull requests or open issues for improvements or bug fixes.

