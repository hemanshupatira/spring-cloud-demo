# spring-cloud-demo
The project demostrates Spring Boot, Config Server, Eureka, Ribbon, Feign, Hystrix and Clould Bus.

## Follow the below steps to demostrate all the above functionality 

1. Start the config server by following instructions at [spring-config-server-demo](https://github.com/hemanshupatira/spring-config-server-demo)
2. Start the Eureka server by following instructions at [spring-eureka-server-demo](https://github.com/hemanshupatira/spring-eureka-server-demo)
3. Start the greeting service by following instructions at [spring-cloud-demo-greeting](https://github.com/hemanshupatira/spring-cloud-demo-greeting)
4. Start the name sevice by following instructions at [spring-cloud-demo-name](https://github.com/hemanshupatira/spring-cloud-demo-name)
5. Start the spring-cloud-demo by running the below command
```
./gradlew bootRun
```

## Endpoint
```
GET http://localhost:8002/greet
```

## Response
```
Good Morning Hemanshu!
```

The response is got from other two services [spring-cloud-demo-greeting](https://github.com/hemanshupatira/spring-cloud-demo-greeting) and [spring-cloud-demo-name](https://github.com/hemanshupatira/spring-cloud-demo-name). 

All the services are discoverable through Eureka and are load balanced using Ribbon. 

The services uses Feign templates to invoke ther RESTFul services and uses Hystrix for fallback. To see Hystrix in action just shutdown any of the greeting or name service completely.

Spring Clould Bus is used to propagate config changes to the services.
