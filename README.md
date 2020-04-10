# spring-cloud-demo
The project demostrates Spring Boot, Config Server, Eureka, Ribbon, Feign, Hystrix and Clould Bus.

## To run

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

The services uses Feign templates to invoke ther RESTFul services and uses Hystrix for fallback. 

Spring Clould Bus is used to propagate config changes to the services.
