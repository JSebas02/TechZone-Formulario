# TechZone – Formulario de Inscripción

## Descripción del proyecto

TechZone es una aplicación móvil desarrollada en Android Studio utilizando Java y XML. Está orientada al sector tecnológico y permite que los usuarios realicen una inscripción indicando sus datos personales y sus intereses relacionados con la tecnología.

El propósito de la aplicación es implementar los conceptos básicos del desarrollo Android, incluyendo el diseño de interfaces, la navegación entre Activities, el uso de componentes gráficos y la transferencia de información.

## ¿Por qué se eligió este sector?

Se seleccionó el sector tecnológico debido a su constante crecimiento y a la importancia que tienen áreas como el hardware, el software, los videojuegos, la inteligencia artificial y la programación.

TechZone busca ofrecer una experiencia de registro sencilla para usuarios interesados en estas temáticas.

## Funcionalidades

- Pantalla de presentación con información sobre la aplicación.
- Formulario para ingresar el nombre y correo electrónico.
- Selección de una categoría de interés: Hardware o Software.
- Selección de intereses: Gaming, Inteligencia Artificial y Programación.
- Validación de los campos obligatorios.
- Pantalla de confirmación que muestra los datos ingresados.
- Botón para salir de la aplicación.

## Estructura de la aplicación

### 1. MainActivity – Presentación

Es la pantalla inicial de TechZone. Contiene el nombre de la aplicación, una breve descripción y el botón **Comenzar**, que permite acceder al formulario.

### 2. RegistroActivity – Formulario

Permite ingresar los datos personales y seleccionar los intereses tecnológicos mediante campos de texto, botones de radio y casillas de selección.

Al presionar **Registrarse**, la información se envía a la siguiente Activity.

### 3. ConfirmacionActivity – Confirmación

Recibe y muestra el nombre, correo electrónico, categoría e intereses seleccionados por el usuario.

También incluye el botón **Salir** para finalizar las Activities de la aplicación.

## Componentes utilizados

- **TextView:** visualización de títulos, instrucciones y datos.
- **EditText:** ingreso de nombre y correo.
- **Button:** navegación, registro y salida.
- **RadioButton y RadioGroup:** selección de una categoría.
- **CheckBox:** selección de múltiples intereses.
- **LinearLayout:** organización vertical de los elementos.
- **ScrollView:** desplazamiento del formulario y de la confirmación.

## Transferencia de información

La aplicación utiliza `Intent` y `putExtra()` para enviar los datos desde el formulario hasta la pantalla de confirmación.

Posteriormente, los datos se recuperan utilizando `getStringExtra()`.

No se emplea una base de datos, ya que la información se transmite directamente entre Activities.

## Tecnologías utilizadas

- Java
- XML
- Android Studio
- Gradle
- Git y GitHub

## Pruebas de funcionamiento

La aplicación fue ejecutada en un emulador Android para comprobar:

- La navegación entre las tres ventanas.
- El ingreso de datos en el formulario.
- La selección de categorías e intereses.
- La transferencia y visualización de la información.
- El funcionamiento del botón de salida.

## Ejecución del proyecto

1. Descargar o clonar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Sincronizar Gradle.
4. Seleccionar un emulador o dispositivo Android compatible.
5. Ejecutar la aplicación mediante **Run**.

## Finalidad académica

Proyecto individual desarrollado para aplicar los conocimientos adquiridos sobre programación de aplicaciones móviles Android, componentes de interfaz, manejo de eventos y navegación entre Activities.
