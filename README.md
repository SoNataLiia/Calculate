# Calculadora Java con Interfaz Gráfica

Una calculadora de escritorio desarrollada en Java con interfaz gráfica Swing, que permite realizar las operaciones aritméticas básicas.

---

## Características

- Operaciones aritméticas: suma, resta, multiplicación y división
- Botón `+/-` para cambiar el signo del número
- Botón de borrado carácter a carácter (←)
- Botón `CE` para limpiar la pantalla
- Botón `C` para reiniciar todos los valores y el estado de la calculadora
- Soporte para números decimales
- Manejo de error por división entre cero
- Encadenamiento de operaciones (el resultado de una operación sirve como primer operando de la siguiente)
- **Control por teclado**: se pueden usar los dígitos, operadores (`+`, `-`, `*`, `/`), el punto decimal (`.`) y la tecla `Enter` para calcular el resultado

---

## Requisitos

- **Java SE 8** o superior (JDK/JRE)
- **Biblioteca MigLayout** (`miglayout-*.jar`) en el classpath — se utiliza para la disposición de los componentes en la ventana

---

## Estructura del proyecto

```
Calculator/
├── src/
│   └── Calculator/
│       └── Calculator.java   ← Clase principal (JFrame)
└── lib/
    └── miglayout-*.jar       ← Dependencia de diseño
```

---

## Compilación y ejecución

### Con línea de comandos

```bash
# Compilar
javac -cp lib/miglayout-*.jar -d bin src/Calculator/Calculator.java

# Ejecutar
java -cp bin:lib/miglayout-*.jar Calculator.Calculator
```

> En Windows, sustituye `:` por `;` en el classpath:
> ```
> java -cp bin;lib/miglayout-*.jar Calculator.Calculator
> ```

### Con un IDE (Eclipse, IntelliJ IDEA, NetBeans)

1. Importa el proyecto.
2. Añade `miglayout-*.jar` como librería externa.
3. Ejecuta la clase `Calculator.Calculator`.

---

## Uso

| Acción | Descripción |
|---|---|
| Clic en un dígito / tecla numérica | Introduce un dígito en pantalla |
| Clic en `+`, `-`, `*`, `/` o tecla correspondiente | Selecciona la operación y guarda el primer operando |
| Clic en `=` o tecla `Enter` | Calcula y muestra el resultado |
| Clic en `.` | Añade el separador decimal (solo una vez por número) |
| Clic en `+/-` | Cambia el signo del número en pantalla |
| Clic en `←` | Elimina el último carácter introducido |
| Clic en `CE` | Borra únicamente el valor que se muestra en pantalla |
| Clic en `C` | Reinicia completamente la calculadora |

---

## Notas técnicas

- El resultado se muestra sin decimales innecesarios (p. ej., `6` en lugar de `6.0`).
- La división entre cero muestra el mensaje `Error` en pantalla.
- El estado interno (`EnterNum1`, `Operate`, `Result`) se gestiona directamente en la clase `Calculator`.

---

## Licencia

Este proyecto se distribuye con fines educativos. Siéntete libre de modificarlo y adaptarlo a tus necesidades.
