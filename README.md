#  Sistema de Pagos - Carrito de Compras en Java

Este proyecto es una aplicación de consola desarrollada en **Java**, que simula un sistema de **carrito de compras** con múltiples métodos de **pago** implementados mediante interfaces, herencia, validación y pruebas unitarias.

> Aplicación orientada a buenas prácticas como **SOLID**, **Clean Code**, diseño con interfaces, pruebas con **JUnit 5** y arquitectura extensible.

---

##  Estructura del Proyecto

pagos/
├── abstratcs/ # Clase abstracta BasePagos que centraliza lógica común
├── interfaces/ # Interfaz Pago (Strategy Pattern)
├── model/ # Modelos: Producto, CarroCompra, Bitcoin, Paypal, TarjetaCredito
├── utils/ # Clase utilitaria Validar para validaciones generales
├── App.java # Clase principal para ejecución del programa
└── test/ # Pruebas unitarias con JUnit 5


---

##  Características Técnicas

- Aplicación Java modular y bien estructurada
- Uso de:
  - Interfaces (`Pago`)
  - Clases abstractas (`BasePagos`)
  - Implementaciones concretas de pago (`Paypal`, `Bitcoin`, `TarjetaCredito`)
  - Validaciones centralizadas (`Validar`)
- Diseño orientado a objetos con principios SOLID
- Pruebas unitarias con **JUnit 5**
- Captura de salida por consola para validación en tests
- Patrón de diseño aplicado: **Strategy**

---

## Cómo ejecutar

### Requisitos

- Java 17+ (puede funcionar en Java 11+)
- Gradle (wrapper incluido)
- IDE recomendada: IntelliJ IDEA o VS Code

###  Ejecutar desde consola

./gradlew run
 Ejecutar desde IDE
Ejecuta App.java desde tu IDE con el botón "Run".

 Ejecutar pruebas
bash
Copiar código
./gradlew test
Los reportes se generarán en:

swift
Copiar código
build/reports/tests/test/index.html
 Tests cubiertos
Validación de montos inválidos (Producto, BasePagos)

Comportamiento esperado de Bitcoin, Paypal, TarjetaCredito

Validación de salida por consola (captura con ByteArrayOutputStream)

Uso de assertThrows, assertTrue, assertEquals

Diseño UML
Se utiliza un diseño basado en clases bien encapsuladas. Puedes ver el diagrama de clases en la carpeta /docs (o generar con PlantUML).

Principios aplicados:

SRP (Responsabilidad Única)

OCP (Abierto/Cerrado)

DIP (Inversión de Dependencias)

Patrón Strategy para los medios de pago

Autor
Jhonathan Gutierrez 
Proyecto académico / educativo Intelsoft.cl
Fecha: Enero 2026

📘 Licencia
Este proyecto está diseñado con fines educativos y puede ser reutilizado con fines didácticos bajo la licencia MIT.
