package com.sunilos.gateway;

import org.springframework.boot.SpringApplication;

/**
 * <h1>API Gateway - Central Routing Service</h1>
 * <p>
 * The {@code ApiGatewayApplication} class serves as the **API Gateway** in a 
 * **Spring Cloud Microservices Architecture**. It acts as a **single point of entry** 
 * for all client requests and routes them to the respective microservices.
 * </p>
 * 
 * <h3>Key Features:</h3>
 * <ul>
 *     <li>Implements **Spring Cloud Gateway** for intelligent request routing.</li>
 *     <li>Uses **Eureka Discovery Client** for dynamic service discovery.</li>
 *     <li>Handles **CORS (Cross-Origin Resource Sharing)** for frontend applications.</li>
 * </ul>
 * 
 * <h3>Service Routing:</h3>
 * <p>
 * The API Gateway dynamically routes incoming requests to the appropriate 
 * microservices based on defined **routes** in the configuration.
 * </p>
 * 
 * <h3>Example API Requests:</h3>
 * <pre>
 * GET http://localhost:8080/order-service/details
 * (Forwarded to the "order-service")
 *
 * GET http://localhost:8080/payment-service/process
 * (Forwarded to the "payment-service")
 * </pre>
 * 
 * @author Nidhi Agrawal
 *
 * 
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {
	
	 /**
     * The main entry point for the Spring Boot application.
     * This method launches the API Gateway service, allowing it to route client requests.
     *
     * @param args Command-line arguments
     */
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
