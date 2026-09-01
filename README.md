# LABORATORIO-1-Programacion-Orientada-a-Objetos
Caso de estudio: Sistema de gestión de una biblioteca universitaria
1. Contexto y objetivo
La biblioteca de una universidad requiere una aplicación sencilla que permita registrar y gestionar distintos tipos de materiales bibliográficos. El sistema se desarrollará como una aplicación de consola en Java y deberá utilizar Programación Orientada a Objetos como enfoque principal de solución.
Al finalizar el laboratorio, el estudiante deberá demostrar que puede:
• Identificar clases, objetos, atributos y métodos a partir de un problema.
• Aplicar encapsulamiento mediante modificadores de acceso y métodos de acceso.
• Utilizar constructores y sobrecarga de constructores o métodos.
• Diferenciar miembros de instancia y miembros static.
• Modelar relaciones de herencia y utilizar clases abstractas cuando corresponda.
• Definir e implementar interfaces.
• Aplicar polimorfismo para trabajar con objetos de distintos tipos mediante una abstracción común.
• Capturar y presentar información desde una aplicación de consola.
• Traducir un diagrama de clases a una implementación funcional en Java.
2. Situación problema
Actualmente la biblioteca administra diferentes materiales de forma manual. Para iniciar la digitalización del proceso se solicita construir una primera versión del sistema que gestione, como mínimo, los siguientes tipos de material:
• Libro.
• Revista.
• Libro digital.
Todos los materiales comparten información común, por ejemplo un código, un título y un año de publicación. Sin embargo, cada tipo de material también posee datos y comportamientos propios:
Tipo de material	Datos particulares mínimos	Puede prestarse	Puede descargarse
Libro	Autor	Sí	No
Revista	Número de edición	Sí	No
Libro digital	Autor y tamaño del archivo	No	Sí

Reto de diseño
El sistema debe evitar duplicar innecesariamente atributos o comportamientos comunes entre las clases. La solución deberá justificar qué elementos pertenecen a una clase base, cuáles a clases derivadas y cuáles representan capacidades que conviene modelar mediante interfaces.

3. Requerimientos funcionales
1. Registrar un libro solicitando los datos definidos por el modelo.
2. Registrar una revista solicitando los datos definidos por el modelo.
3. Registrar un libro digital solicitando los datos definidos por el modelo.
4. Consultar y mostrar todos los materiales registrados.
5. Mostrar la información de cada material de acuerdo con su tipo concreto.
6. Permitir prestar y devolver aquellos materiales que tengan la capacidad de préstamo.
7. Permitir descargar aquellos materiales que tengan la capacidad de descarga.
8. Mostrar la cantidad total de materiales creados durante la ejecución de la aplicación.
9. Ofrecer un menú de consola que permita al usuario ejecutar las operaciones anteriores hasta seleccionar la opción de salida.
4. Requerimientos de Programación Orientada a Objetos
La solución deberá evidenciar de forma explícita los siguientes conceptos. No basta con que el programa funcione; el diseño debe utilizarlos correctamente.
Concepto	Debe evidenciarse en	Criterio mínimo
Clase y objeto	Modelo e implementación	Cada entidad relevante debe representarse mediante una clase y crearse mediante objetos.
Encapsulamiento	Atributos y acceso	Los atributos no deben exponerse directamente sin justificación.
Constructores	Creación de objetos	Los objetos deben inicializarse de forma consistente.
Sobrecarga	Constructores o métodos	Debe existir al menos un caso válido de sobrecarga.
static	Contador o dato de clase	Debe existir al menos un miembro cuyo valor pertenezca a la clase y no a cada objeto.
Herencia	Jerarquía de materiales	Debe existir una relación padre-hijo coherente con el dominio.
Clase abstracta	Abstracción común	Debe utilizarse una clase abstracta cuando represente un concepto general que no deba instanciarse directamente.
Interfaces	Capacidades del sistema	Las capacidades de prestar y/o descargar deben modelarse mediante interfaces u otra solución equivalente debidamente justificada.
Polimorfismo	Colección y operaciones comunes	La aplicación debe poder tratar objetos de distintos tipos mediante una referencia común, evitando condicionales innecesarios basados en el tipo.
5. Desarrollo del laboratorio por retos
Reto 1. Modelar un libro
• Identifique los atributos y métodos necesarios para representar un libro.
• Implemente encapsulamiento, constructor y métodos de acceso.
• Cree al menos dos objetos y demuestre su funcionamiento.
Conceptos: clase, objeto, atributos, métodos, constructor, this y encapsulamiento.
Reto 2. Incorporar sobrecarga y static
• Defina una segunda forma válida de crear un objeto cuando algún dato opcional no esté disponible.
• Implemente un contador de objetos o materiales creados utilizando un miembro static.
• Explique por qué ese contador pertenece a la clase y no a cada instancia.
Conceptos: sobrecarga, miembros de clase y miembros de instancia.
Reto 3. Generalizar los materiales
• Analice los datos comunes entre Libro, Revista y LibroDigital.
• Proponga una jerarquía que evite repetir atributos y comportamientos.
• Defina cuál debe ser la abstracción general del modelo.
Conceptos: reutilización, herencia y clase abstracta.
Reto 4. Modelar capacidades mediante interfaces
• Represente la capacidad de prestar/devolver un material.
• Represente la capacidad de descargar un material.
• Aplique cada capacidad únicamente a los tipos que corresponda.
Conceptos: interfaces e implementación de comportamientos.
Reto 5. Aplicar polimorfismo
• Almacene diferentes tipos de materiales en una colección basada en una abstracción común.
• Recorra la colección y muestre la información de cada objeto sin preguntar manualmente su tipo para decidir cómo imprimirlo.
• Demuestre que cada objeto ejecuta su propio comportamiento.
Conceptos: sobrescritura, enlace dinámico y polimorfismo.
Reto 6. Integrar la aplicación
• Implemente el menú de consola.
• Permita registrar, consultar, prestar, devolver, descargar y mostrar estadísticas.
• Valide que la aplicación pueda ejecutarse de principio a fin sin errores de flujo.
Conceptos: integración del modelo orientado a objetos y entrada/salida de información.
6. Diagrama de clases
Antes de completar la implementación, el equipo deberá elaborar un diagrama UML del sistema. El diagrama debe representar como mínimo:
• Clases principales del dominio.
• Atributos con nombre, tipo y visibilidad.
• Métodos principales.
• Constructores cuando sea pertinente.
• Relaciones de herencia.
• Interfaces y relaciones de implementación.
• Cardinalidades o relaciones adicionales si el diseño las requiere.
Importante
El diagrama UML y el código deben ser consistentes. Una clase, atributo, método o relación relevante no debería aparecer en uno y faltar en el otro sin una justificación técnica.

7. Menú mínimo esperado
La aplicación debe ofrecer un menú de consola equivalente al siguiente. Los textos pueden variar, pero las funcionalidades mínimas deben conservarse:
BIBLIOTECA UNIVERSITARIA

1. Registrar libro
2. Registrar revista
3. Registrar libro digital
4. Mostrar materiales
5. Prestar material
6. Devolver material
7. Descargar material digital
8. Mostrar estadísticas
0. Salir
8. Restricciones técnicas
• El lenguaje de implementación es Java.
• La interacción principal debe realizarse por consola.
• Los atributos deben manejarse con encapsulamiento adecuado.
• No se permite resolver el comportamiento de todos los tipos mediante una única clase con un atributo "tipo" y grandes estructuras if/switch.
• No se permite reemplazar el polimorfismo por cadenas de condicionales que pregunten repetidamente si el objeto es un Libro, Revista o LibroDigital cuando el comportamiento pueda resolverse mediante sobrescritura.
• El código debe compilar y ejecutarse sin errores.
• Los nombres de clases, métodos y variables deben ser claros y coherentes con el problema.
9. Entregables
1. Diagrama UML final del sistema.
2. Proyecto Java completo con el código fuente organizado por paquetes.
3. Archivo README o documento breve con instrucciones para compilar y ejecutar la aplicación.
4. Evidencias de ejecución de los casos solicitados.
5. Respuestas a las preguntas de análisis conceptual definidas en este laboratorio.
10. Preguntas de análisis y sustentación
Estas preguntas podrán utilizarse en la entrega o en una sustentación oral. Las respuestas deben referirse al diseño implementado por el estudiante.
1. ¿Cuál es la diferencia entre una clase y un objeto dentro de su solución?
2. ¿Por qué los atributos principales se definieron con acceso restringido?
3. ¿Qué diferencia existe entre sobrecarga y sobrescritura? Identifique un ejemplo de cada una en el laboratorio.
4. ¿Qué miembro static implementó y por qué no debería pertenecer a cada objeto individual?
5. ¿Cuál es la relación de herencia principal de su modelo y por qué cumple una relación “es un”?
6. ¿Por qué la clase general de materiales puede ser abstracta?
7. ¿Qué diferencia práctica existe entre la clase abstracta y las interfaces utilizadas?
8. ¿Dónde se evidencia el polimorfismo en la aplicación?
9. ¿Qué tendría que cambiar para agregar un nuevo tipo de material llamado Tesis?
10. ¿Su ciclo para mostrar todos los materiales tendría que modificarse al agregar Tesis? Justifique.
11. Rúbrica de evaluación
Criterio	Peso	Evidencia esperada
Diagrama UML y coherencia con el código	15%	Modelo correcto y consistente
Clases, objetos y encapsulamiento	15%	Diseño orientado a objetos
Constructores y sobrecarga	10%	Inicialización y variantes válidas
Herencia y clase abstracta	15%	Jerarquía coherente
Interfaces	10%	Capacidades correctamente modeladas
Polimorfismo	15%	Comportamiento dinámico sin condicionales innecesarios
Uso de static	5%	Miembro de clase justificado
Entrada/salida y menú	5%	Aplicación operable por consola
Organización y calidad del código	5%	Código legible y organizado
Sustentación conceptual	5%	Comprensión de las decisiones de diseño
 
12. Lista de verificación antes de entregar
☐ El proyecto compila sin errores.	☐ Se utiliza una clase abstracta.
☐ Se pueden crear los tres tipos mínimos de material.	☐ Se utilizan interfaces para representar capacidades.
☐ Existe encapsulamiento de atributos.	☐ Se evidencia polimorfismo en una colección o flujo común.
☐ Se evidencia sobrecarga.	☐ El menú permite ejecutar las funcionalidades mínimas.
☐ Se utiliza al menos un miembro static correctamente.	☐ El diagrama UML corresponde al código entregado.
☐ Existe una jerarquía de herencia coherente.	☐ El código está organizado y es legible.
Criterio central de evaluación
El objetivo no es únicamente obtener una aplicación funcional. La solución debe mostrar que el estudiante comprende por qué y cuándo utilizar cada concepto de Programación Orientada a Objetos.
