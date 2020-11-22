# Ubicaciones
Programa de Ubicaciones

# Desripción técnica
1. Se realiza la creación de la tabla location sobre el motos de base de datos MYSql Workbech con la siguiente estructura.
  CREATE TABLE `location` (
    `idlocation` int NOT NULL AUTO_INCREMENT,
    `name` varchar(45) NOT NULL,
    `area_m2` int NOT NULL,
    PRIMARY KEY (`idlocation`,`name`),
    UNIQUE KEY `idlocation_UNIQUE` (`idlocation`)
  ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

2. Se crea la conexion JDBC en la consola de glassfish para la conexión a la base de datos desde nuestro API
  
3. En el desarrollo del API se hace la configuración del pom.xml, configuración de la persistencia con JPA, creación de archivos de idiomas,
    archivos de face-config para el direccionamiento de cada vista, y la implementación de estilos a cada una de ellas.
4. Finalmente para el manejo de la tabla location se crearon el respectivo controlador, helpers, el modelo (clase location), la persistencia de la clase y el servicio para el control
    de la información de esta clase contra la base de datos.
    
    
   
# Descripción de funcionalidad
1. Inicialmente encontramos una pantalla de inicio donde tenemos un botón ingresar el cual nos direcciona a la pantalla principal de nuestro API
2. En la pantalla principal encontramos un menu en la parte superior derecha donde podemos acceder a la tabla de ubicaciones o salir del menu principal
3. A la hora de dar clic en el botón ubicaciones nos muestra una pantalla donde se listan las ubicaciones existentes en nuestra base de datos
4. Dentro de esta pantalla podemos realizar la CRUD de nuestra información permitiendo adicionar nuevos registros, modificar registros ya existentes, consultar registros y 
    eliminar registros de nuestra base de datos.
    
