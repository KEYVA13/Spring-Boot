Trabajo Final Spring Boot API REST - Proyecto Final
Este proyecto representa el trabajo final del curso de Spring Boot API. Se desarrolló como una aplicación para la gestión de clientes, productos y ventas, aplicando los conceptos aprendidos de manera sencilla y rápida.

Objetivo
El objetivo principal de este proyecto es demostrar la capacidad para diseñar e implementar una API REST 
utilizando Spring Boot y otras tecnologías asociadas. Aunque el proyecto presenta funcionalidades básicas,
su desarrollo se realizó de forma concisa y eficiente para reflejar el conocimiento adquirido durante el curso.

Requisitos
Java 8 o superior
Maven
MySql
Configuración de la base de datos
Crea una base de datos en MySql llamada bazar.
Configura las credenciales de acceso a la base de datos en application.properties.(username=kevin,password=kevin)
Ejecución del proyecto

Clona este repositorio: git clone https://github.com/KEYVA13/Spring-Boot.git
Navega al directorio del proyecto: cd proyecto-final
Ejecuta la aplicación Spring Boot: mvn spring-boot:run
La aplicación estará disponible en http://localhost:8080.

Estructura del Proyecto
El proyecto sigue una estructura estándar de un proyecto Spring Boot. Aquí está la estructura de los paquetes:

com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers: Contiene los controladores de la API.
com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models: Contiene las clases de modelo para Cliente, Producto y Venta.
com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto: Contiene las clases DTO utilizadas para transferir datos entre las capas de la aplicación.
com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service: Contiene las interfaces y clases de servicio para Cliente, Producto y Venta.

ENDPOINTS:

1. ClienteController
Este controlador maneja las operaciones relacionadas con los clientes, como crear, obtener, actualizar y eliminar clientes.

Endpoint /clientes/crear (POST): Crea un nuevo cliente.
{
    "nombre" : "Juan",
    "apellido" : "Rodriguez",
    "dni" : 2345678 
}
Endpoint /clientes (GET): Obtiene todos los clientes.
Endpoint /clientes/{id} (GET): Obtiene un cliente por su ID.
Endpoint /clientes/eliminar/{id} (DELETE): Elimina un cliente por su ID.
Endpoint /clientes/editar/{id} (PUT): Actualiza un cliente por su ID.Se envian por params los datos a actualizar ejemplo: localhost:8080/clientes/editar/4?nombre=marcelo&apellido=perez&dni=1234

2. ProductosController
Este controlador maneja las operaciones relacionadas con los productos, como crear, obtener, actualizar y eliminar productos, además de obtener la lista de productos con stock menor a un número específico.

Endpoint /productos/crear (POST): Crea un nuevo producto.
{
    "nombre" : "SevenUP",
    "marca" : "CocaCola",
    "costo" : 1000,
    "cantidad" : 4
}
Endpoint /productos (GET): Obtiene todos los productos.
Endpoint /productos/{id} (GET): Obtiene un producto por su ID.
Endpoint /productos/eliminar/{id} (DELETE): Elimina un producto por su ID.
Endpoint /productos/editar/{id} (PUT): Actualiza un producto por su ID. Ej: localhost:8080/productos/editar/1?nombre=CocaCola&marca=CocaCola&costo=750&cantidad=3
Endpoint /productos/stockMenorA/{nro} (GET): Obtiene la lista de productos con stock menor a un número específico.

3. VentaController
Este controlador maneja las operaciones relacionadas con las ventas, como crear, obtener, actualizar y eliminar ventas, además de obtener información sobre las ventas para una fecha específica y la venta con el mayor total.

Endpoint /ventas/crear (POST): Crea una nueva venta.
{
    "fecha" : "2003-03-13",
    "producto" : {
        "codigo_producto" : 2
    },
    "unCliente" : {
        "id_cliente" : 2
    }
}
Endpoint /ventas (GET): Obtiene todas las ventas.
Endpoint /ventas/{id} (GET): Obtiene una venta por su ID.
Endpoint /ventas/eliminar/{id} (DELETE): Elimina una venta por su ID.
Endpoint /ventas/editar/{id} (PUT): Actualiza una venta por su ID. Ej: localhost:8080/ventas/editar/2?fecha=2004-04-12&total=3000&cliente=2
Endpoint /ventas/infoVentas (GET): Obtiene información sobre las ventas para una fecha específica.
Endpoint /ventas/mayorVenta (GET): Obtiene la venta con el mayor total.


Uso de la API
Puede utilizar cualquier cliente HTTP o herramienta como Postman para probar los endpoints de la API. Asegúrese de que la aplicación esté en funcionamiento y que los servicios estén disponibles en las URL definidas.

Asegúrese de incluir los parámetros necesarios en el cuerpo de la solicitud (en caso de métodos POST y PUT) o en la URL (en caso de métodos GET y DELETE) según lo especificado en la documentación de cada endpoint.

Consideraciones Adicionales
La API maneja errores internos de manera adecuada, devolviendo mensajes de error descriptivos en caso de que ocurra algún problema durante la ejecución de una solicitud.
Asegúrese de contar con los permisos necesarios para realizar operaciones como crear, actualizar o eliminar registros.
Los datos devueltos por la API están en formato JSON.
¡Gracias por utilizar nuestra API! Si tiene alguna pregunta o necesita asistencia adicional, no dude en ponerse en contacto con nosotros.