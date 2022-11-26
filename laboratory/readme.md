Kullanılan Teknolojiler
* Java 1.8
* Spring Boot 2.7.5
* Spring Data Jpa
* Thymeleaf
* H2-db
* Maven


Projeyi calistirmak icin, Komut satından proje dizinine gidip;

```sh
.\mvnw spring-boot:run
```

Çalıştırmak yeterli olacaktır.


h2-db Arayüzüne erişebilmek için: http://localhost:8080/h2-console endpointi kullanilabilir.

* JDBC URL: jdbc:h2:mem:testdb olarak
* User Name: sa
* Password: 

Bilgileri ile erişilebilir.



### Reference Documentation
Projede kullanılan teknolojilerin dökümanları;

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)


