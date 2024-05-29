# ArquitecturaDe-Software_juegoDeTerror_SolidPatrones


Resumen de caso de uso y funcionalidades.
    El proyecto es un videojuego con una interfaz sencilla donde tenemos un Mapa , un JugadorPrincipal y un Enemigo , se gana si el jugador llega al final del mapa (que es un arreglo simple ) y tambien hay un menu con el significado de los simbolos del mapa y con las acciones que se puede realizar en el juego.

Tecnologías usadas.
    Lenguaje Java, visual estudio code

Ejecucion 
    para lograr ejecutar el proyecto debe correr la clase "Juego.java" que esta ubicado en en la ruta VideoJuegoTerror/src/presentacion/Juego.java 
    una vez ejecutado siga el menu para poder jugar el juego.



Este proyecto se  cubre los siguientes aspectos:
Principios SOLID:

    S: Single Responsibility Principle (SRP)-Las clases como Mapa, JugadorPrincipal, Enemigo y Juego tienen una única responsabilidad bien definida. Por ejemplo, Mapa se encarga de representar el mapa del juego, JugadorPrincipal maneja la lógica del jugador, Enemigo maneja la lógica de los enemigos y Juego maneja la interacción con el usuario y el flujo del juego. Cada clase tiene una razón para cambiar relacionada con su responsabilidad específica.

    O: Open/Closed Principle (OCP)- Las clases como Mapa, JugadorPrincipal, Enemigo y Juego están diseñadas de manera que puedan extenderse mediante la creación de subclases 

    L: Liskov Substitution Principle (LSP) - Los subtipos como JugadorPrincipal y Enemigo pueden ser utilizados en lugar de sus tipos base sin introducir errores en la lógica del juego.

    I: Interface Segregation Principle (ISP) - Las interfaces como JugadorDecorado y Observador están diseñadas de manera que los clientes puedan implementar solo los métodos que necesitan. Por ejemplo, JugadorDecorado define solo los métodos relevantes para los decoradores del jugador, y Observador define solo los métodos necesarios para los observadores del juego. Esto evita que las clases clientes dependan de métodos que no necesitan.

    D: Dependency Inversion Principle (DIP) – Las clases como Juego dependen de abstracciones como las interfaces JugadorDecorado y Observador en lugar de depender de implementaciones concretas. 

Patrones de Diseño:
    Creational: Singleton (para la implementación de JugadorPrincipal y Guardar) solo debe haber una instancia del jugador principal.

    Estructural: decorator (para la implementación de RomperFoco ) al pulsar la opcion"armar" el jugador ya podra realizar la accion de mostrar su arma.

    Comportamiento: Observer(para la implementación de TransportadorEnemigo )cuando el jugador se arme el observador mueve al enemigo al lado del jugador .

Arquitectura en 3 capas:
    Capa de acceso a datos: Datos

    Capa de negocio: Negocio

    Capa de presentación: Presentacion



