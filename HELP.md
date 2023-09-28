# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.16/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.16/gradle-plugin/reference/html/#build-image)
* [Jersey](https://docs.spring.io/spring-boot/docs/2.7.16/reference/htmlsingle/index.html#web.servlet.jersey)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### 1. Crear archivo de configuaración para Jersey
En este archivo se indica la ruta de los controladores, que son quienes reciben las peticiones HTTP entrantes y las procesa.

### 2. Crear los controladores
Contienen los métodos a través de los cuales se va a consumir el servicio.

### 3. Crear los modelos
Contienen el mapeo de las entidades.

### 4. Crear los servicios
Comunican los modelos con los controlladores. Los servicios constan de una interfaces que declaran las operaciones y clases implementadoras de dichas operaciones. 

## Conclusión:
* El repositorio acepta la petición.
* El modelo contiene la información.
* El servicio sirve de comunicación Controllador - Modelo.


