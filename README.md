# AppClimaSantiago
Prueba

# Preparaciones Iniciales:

-Crear base de datos en postgres segun esta configurado en el aplication.yml 

Ejemplo:
"# Database
  datasource:
    driver-class-name: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/c1?createDatabaseIfNotExist=true
    username: ppl	
    password: ppl123"
    
    
-En el aplication.yml se puede personalizar niveles de seguridad, conexiones, entre otrs de ser necesario.

# Para Copilar y ejecutar correr el siguiente comando en raiz de proyecto:

mvn clean spring-boot:run

# Metodos y Endpoint son los siguientes:

-Agregar nuevo Clima:

POST /api/comunaClima

http://localhost:8080/api/comunaClima

<img src="https://github.com/imundo/AppClimaSantiago/blob/master/img/addClima.PNG">


-Mostrar todos los Climas Registrados:

GET /api/comunaClima

http://localhost:8080/api/comunaClima

<img src="https://github.com/imundo/AppClimaSantiago/blob/master/img/viewClima.PNG">



-Buscar Clima por ID: 

GET /api/comunaClima/{id}

http://localhost:8080/api/comunaClima/{id}



-Buscar Clima por Nombre: 

GET /api/comunaClima?name=name

http://localhost:8080/api/comunaClima?name=name



-Borrar Clima por ID: 

DELETE /api/comunaClima/{id}

http://localhost:8080/api/comunaClima/{id}



-Borrar todos los registros

DELETE /api/comunaClima

http://localhost:8080/api/comunaClima







