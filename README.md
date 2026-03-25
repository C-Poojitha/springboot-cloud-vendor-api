# Cloud Vendor REST API

This is a Spring Boot application demonstrating a basic RESTful API for managing Cloud Vendors. It provides Create, Read, Update, and Delete (CRUD) operations for the cloud vendor entity.

## Features

- **Create Cloud Vendor**: Add a new cloud vendor to the system.
- **Get Cloud Vendor**: Retrieve details of an existing cloud vendor using their ID.
- **Update Cloud Vendor**: Modify the details of an existing cloud vendor.
- **Delete Cloud Vendor**: Remove a cloud vendor from the system.

## Technologies Used

- **Java 17**
- **Spring Boot 4.x** (Spring Web MVC)

## Project Structure

The project follows the standard Spring Boot directory structure:

- `src/main/java/com/thinkconstructive/rest_demo/controller/CloudVendorController.java` (or similar depending on your service): Contains the REST controller exposing the CRUD API endpoints.
- `src/main/java/com/thinkconstructive/rest_demo/model/CloudVendor.java`: The POJO (Plain Old Java Object) representing the Cloud Vendor entity.

## API Endpoints

The API is accessible under the base URL `/cloudvendor`.

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| `GET` | `/cloudvendor/{vendorId}` | Retrieves the details of a specific cloud vendor. |
| `POST` | `/cloudvendor` | Creates a new cloud vendor. Expects a JSON payload in the request body. |
| `PUT` | `/cloudvendor` | Updates an existing cloud vendor. Expects a JSON payload in the request body. |
| `DELETE` | `/cloudvendor/{vendorId}` | Deletes a cloud vendor by its ID. |

## Example JSON Payload for POST/PUT

```json
{
  "vendorId": "C1",
  "vendorName": "Vendor 1",
  "vendorAddress": "Vendor Address 1",
  "vendorPhoneNumber": "1234567890"
}
```

*(Note: Adjust the fields based on the exact attributes in the CloudVendor class).*

## API Operations Output & Testing

All API endpoint operations and their outputs demonstrated below were tested and validated using [Postman](https://www.postman.com/).

### 🟢 GET Request Testing
![GET Request Verification](screenshots/get.png)

### 🟡 POST Request Testing
![POST Request Verification](screenshots/post.png)

### 🔵 PUT Request Testing
![PUT Request Verification](screenshots/put.png)

### 🔴 DELETE Request Testing
![DELETE Request Verification](screenshots/delete.png)

## Getting Started

1. Make sure you have **Java 17** or above and **Maven** installed.
2. Clone or download the repository.
3. Open a terminal or command prompt and navigate to the root directory of the project (where `pom.xml` is located).
4. Run the application using the Maven wrapper:

   **On Windows:**
   ```bash
   mvnw.cmd spring-boot:run
   ```

   **On Linux/macOS:**
   ```bash
   ./mvnw spring-boot:run
   ```

5. The application will start on the default port, usually `8080`.
6. You can use tools like [Postman](https://www.postman.com/) or `curl` to test the API endpoints.
