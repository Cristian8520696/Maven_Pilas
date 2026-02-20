📦 StackHandler

Implementación de Pila  y Evaluación de Ofuscación

📝 Descripción General

El proyecto StackHandler consiste en una aplicación desarrollada en Java 11, cuyo propósito es implementar una estructura de datos tipo pila (Stack) utilizando nodos enlazados creados manualmente.

El programa permite analizar expresiones que contienen paréntesis (), corchetes [] y llaves {}, verificando si se encuentran correctamente balanceados.

Adicionalmente, se aplicó un proceso de ofuscación mediante ProGuard, con el objetivo de analizar cómo cambia la representación del código cuando se intenta realizar ingeniería inversa sobre el archivo compilado.

🖥️ Tecnologías utilizadas

El desarrollo y pruebas del proyecto se realizaron con:

Java 11

Maven 3.9.12

ProGuard

Es necesario contar con estas herramientas configuradas en el sistema para poder compilar y ejecutar el proyecto correctamente.

📁 Componentes principales

El proyecto incluye los siguientes archivos relevantes:

Node.java → Clase que define el nodo genérico utilizado en la lista enlazada.

StackLinked.java → Implementación de la pila con operaciones básicas.

Main.java → Clase principal que recibe la expresión y realiza la validación.

pom.xml → Archivo de configuración de Maven, incluyendo el perfil para generar la versión ofuscada.

⚙️ Proceso de compilación
1️⃣ Descomprimir el archivo proporcionado

Primero se debe:

Extraer el contenido del archivo .zip en una carpeta local.

Abrir una terminal o consola dentro de la carpeta raíz del proyecto (donde se encuentra el archivo pom.xml).

2️⃣ Compilar y generar el JAR normal

Dentro de la carpeta del proyecto ejecutar:

mvn clean package

Al finalizar el proceso, Maven generará el siguiente archivo:

target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies.jar

Este corresponde a la versión sin ofuscación.

3️⃣ Generar el JAR ofuscado

Para compilar el proyecto aplicando la ofuscación con ProGuard, ejecutar:

mvn clean package -Pobfuscate

Esto generará el archivo:

target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies-obf.jar

Esta versión contiene el código ofuscado.

▶️ Ejecución del programa

El programa recibe como parámetro una expresión que será evaluada para determinar si sus símbolos están balanceados.

Ejecutar versión normal
java -jar target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies.jar "(a+b)*[c-d]"
Ejecutar versión ofuscada
java -jar target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies-obf.jar "(a+b)*[c-d]"

En ambos casos, el resultado funcional debe ser el mismo.

🧪 Pruebas realizadas

Se evaluaron distintas expresiones para comprobar el funcionamiento del sistema.

Ejemplo correcto:

(a+b)*[c-d]

Ejemplo incorrecto:

(a+b]*c-d)

El comportamiento fue consistente tanto en la versión normal como en la versión ofuscada, confirmando que la ofuscación no modifica la lógica interna del programa.

🔎 Evaluación de la ofuscación

Al analizar el archivo ofuscado mediante herramientas de decompilación, se pudo observar que los nombres originales de clases, métodos y variables fueron reemplazados por identificadores más cortos y menos descriptivos.

Aunque el código sigue siendo técnicamente decompilable, su comprensión resulta más compleja. Esto evidencia que la ofuscación no elimina la posibilidad de ingeniería inversa, pero sí incrementa el esfuerzo necesario para interpretar el funcionamiento del sistema.

📌 Conclusión

La práctica permitió reforzar la implementación de estructuras dinámicas como la pila utilizando listas enlazadas en Java. Asimismo, la aplicación de ProGuard permitió comprender mejor cómo se puede añadir una capa de protección al código antes de su distribución.

En términos generales, el proyecto cumple correctamente su propósito funcional y demuestra que la ofuscación actúa como un mecanismo de dificultad adicional frente a la ingeniería inversa, aunque no representa una solución absoluta de seguridad.
