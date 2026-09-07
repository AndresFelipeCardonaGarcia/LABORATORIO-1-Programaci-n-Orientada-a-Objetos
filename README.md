            MANUAL PARA EL USUARIO


============================================================
                    OBJETIVO DEL SISTEMA
=============================================================

El sistema permite gestionar una biblioteca donde se pueden registrar,
prestar, devolver, descargar, editar y eliminar diferentes tipos de materiales.

Tipos de materiales:

- Libros (físicos que se prestan)
- Revistas (físicas que se prestan)
- Libros Digitales (se descargan)

____________________________________________________________
                    ¿QUÉ PUEDE HACER EL USUARIO?
____________________________________________________________
1. REGISTRAR MATERIAL
============================================================
Permite agregar nuevos materiales a la biblioteca.

Pasos para agregar un nuevo material:
- Seleccionar la opción 1 en el menú principal.
- Elegir el tipo de material:
        1 => Libro
        2 => Revista
        3 => Libro Digital
- Completar los datos solicitados.
    (El sistema asigna automáticamente un ID único.)

Datos que solicita dependiendo del tipo de material:

        Tipo          | Datos
        ---------------------------------------------------------------------------
        Libro         | Nombre, Año de publicación, Autor
        Revista       | Nombre, Año de publicación,Número de edición
        Libro Digital | Nombre, Año de publicación, Autor, Tamaño del archivo (MB)
        ---------------------------------------------------------------------------

-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_
Consejo: Puede presionar Enter para omitir campos opcionales.
-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_


2. MOSTRAR MATERIALES
============================================================
Muestra todos los materiales registrados en la biblioteca.

Pasos para mostrar:

- Seleccionar la opción 2 en el menú principal.
    (El sistema muestra todos los materiales registrados.)

El sistema muestra:
        + ID
        + Nombre
        + Año de publicación
        + Autor (para libro y libro digital)
        + Estado (Disponible / Prestado)
        + Número de edición (para revistas)
        + Tamaño del archivo (para libros digitales)
        + Número de descargas (para libros digitales)


3. PRESTAR MATERIAL
============================================================
Permite prestar un libro o revista disponible.

Pasos:
- Seleccionar la opción 3 en el menú principal.
    (El sistema muestra todos los materiales disponibles para prestar.)
- Ingresar el ID del material que desea prestar.
- Confirmar la operación presionando Enter.

-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_
IMPORTANTE:
Solo se pueden prestar libros y revistas.
Los libros digitales no se prestan, se descargan.
-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_


4. DEVOLVER MATERIAL
============================================================
Permite devolver un libro o revista que estaba prestado.

Pasos para devolver:
- Seleccionar la opción 4 en el menú principal.
    (El sistema muestra todos los materiales que están prestados.)
- Ingresar el ID del material que desea devolver.
- Confirmar la operación presionando Enter.

-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_
IMPORTANTE:
Solo se pueden devolver materiales que ya están prestados.
-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_


5. DESCARGAR LIBRO DIGITAL
============================================================
Permite descargar un libro digital.

Pasos para descargar:
- Seleccionar la opción 5 en el menú principal.
    (El sistema muestra todos los libros digitales disponibles)
- Ingresar el ID del libro digital que desea descargar.
- El sistema registra la descarga.
- Se muestra el contador actualizado de descargas.

-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_
NOTA:
Solo se pueden descargar los libros digitales.
-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_


6. ELIMINAR MATERIAL
============================================================
Permite eliminar un material de la biblioteca.

Pasos:
- Seleccionar la opción 6 en el menú principal.
    (El sistema muestra todos los materiales)
- Ingresar el ID del material que desea eliminar.
- Confirmar la operación presionando Enter.

-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_
RESTRICCIONES:
- No se puede eliminar un material que está prestado.
- El ID eliminado no se vuelve a utilizar.
-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_


7. EDITAR MATERIAL
============================================================
Permite modificar los datos de un material existente.

Pasos:
- Seleccionar la opción 7 en el menú principal.
    (El sistema muestra todos los materiales)
- Ingresar el ID del material que desea editar.
- Modificar los campos que desee.
- Presionar Enter para mantener el valor actual.

Campos editables:

        Tipo de material | Campos editables
        ----------------------------------------------------
        Libro            | Nombre, Año, Autor
        Revista          | Nombre, Año, Número de edición
        Libro Digital    | Nombre, Año, Autor,
                         | Tamaño del archivo
        ----------------------------------------------------


-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_
IMPORTANTE:

- El ID nunca se modifica.
- El estado de préstamo tampoco se edita directamente.
-_--__--__--__--__--__--__--__--__--__--__--__--__--__--__--_


8. MOSTRAR ESTADÍSTICAS
============================================================
Muestra información estadística de la biblioteca.

Qué muestra:
- Total de materiales actuales.
- Materiales registrados durante la ejecución.
- Materiales disponibles.
- Materiales prestados.
- Cantidad de libros.
- Cantidad de revistas.
- Cantidad de libros digitales.
- Total de descargas realizadas.

Pasos:
- Seleccionar la opción 8 en el menú principal.
    (El sistema muestra automáticamente todas las estadísticas)


9. SALIR
============================================================
Finaliza el programa.

Pasos:
- Seleccionar la opción 0 en el menú principal.
- El programa termina.

============================================================
                EJEMPLO DE FLUJO COMPLETO
============================================================
Registrar y prestar un libro:
____________________________________________________________

1. Opción 1 → Registrar material
2. Opción 1 → Libro
3. Ingresar datos:
   - Nombre: "El Quijote"
   - Año: 1605
   - Autor: "Miguel de Cervantes"
4. El sistema asigna ID: 7
5. Opción 3 → Prestar material
6. Ingresar ID: 7
7. El libro queda como "Prestado"
8. Opción 2 → Mostrar materiales
9. Verificar que el libro aparece como "Prestado"

============================================================
    Devolver un libro:
____________________________________________________________
1. Opción 4 → Devolver material
    (El sistema muestra los materiales que están prestados)
2. Ingresar el ID: 7
3. el libro cambia su estado a "Disponible"
4. Opción 2 → Mostrar materiales
5. Verificar que la revista aparece con el estado "Disponible"


============================================================
Registrar y prestar una revista:
____________________________________________________________
1. Opción 1 → Registrar material
2. Opción 2 → Revista
3. Ingresar los datos:
  - Nombre: "National Geographic"
  - Año de publicación: 2025
  - Número de edición: 150
4. El sistema asigna automáticamente el ID: 8
5. Opción 3 → Prestar material
6. Ingresar el ID: 8
7. La revista cambia su estado a "Prestado"
8. Opción 2 → Mostrar materiales
9. Verificar que la revista aparece con el estado "Prestado"
=============================================================

    Devolver una revista:
____________________________________________________________
1. Opción 4 → Devolver material
    (El sistema muestra los materiales que están prestados)
2. Ingresar el ID: 8
3. La revista cambia su estado a "Disponible"
4. Opción 2 → Mostrar materiales
5. Verificar que la revista aparece con el estado "Disponible"


Registrar y descargar un libro digital:
_____________________________________________________________
 1. Opción 1 → Registrar material
 2. Opción 3 → Libro Digital
 3. Ingresar los datos:
  - Nombre: "El principito"
  - Año de publicación: 1943
  - Autor: "Antoine de Saint-Exupéry"
  - Tamaño del archivo: 25 MB
4. El sistema asigna automáticamente el ID: 9
5. Opción 5 → Descargar libro digital
6. Ingresar el ID: 9
7. El sistema registra la descarga
8. El contador de descargas aumenta a 1
9. Opción 2 → Mostrar materiales
10. Verificar que el libro digital aparece con 1 descarga



============================================================
                 MENSAJES DE ERROR COMUNES
============================================================

1. "No existe un material con ese ID"
____________________________________________________________
Significado:
El ID ingresado no corresponde a ningún material registrado.

Solución:
Verificar que el ID ingresado sea correcto.


2. "El material ya se encuentra prestado"
____________________________________________________________
Significado:
El material seleccionado no está disponible porque actualmente
se encuentra prestado.

Solución:
Esperar a que el material sea devuelto antes de intentar
prestarlo nuevamente.


3. "El material no se encuentra prestado"
____________________________________________________________
Significado:
El material seleccionado no está actualmente en préstamo.

Solución:
Verificar el estado del material antes de realizar la devolución.


4. "Este material no se puede prestar"
____________________________________________________________
Significado:
El material seleccionado es un libro digital.

Solución:
Los libros digitales no se prestan. Deben ser descargados
utilizando la opción correspondiente.


5. "No hay materiales disponibles"
____________________________________________________________
Significado:
No existen materiales disponibles para realizar un préstamo.
Todos los materiales que pueden prestarse se encuentran
actualmente prestados.

Solución:
Esperar a que algún libro o revista sea devuelto.


============================================================
                  FIN DE MENSAJES DE ERROR
============================================================



============================================================
                    RESUMEN DEL MENÚ
============================================================

        1 => Registrar material
        2 => Mostrar materiales
        3 => Prestar material
        4 => Devolver material
        5 => Descargar libro digital
        6 => Eliminar material
        7 => Editar material
        8 => Mostrar estadísticas
        0 => Salir

============================================================
                       FIN DEL MANUAL
============================================================
```
