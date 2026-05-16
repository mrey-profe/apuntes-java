# Manejo de errores: de Python a Java

## Conceptos clave: dos filosofías opuestas

Cuando se trata de manejar situaciones inesperadas (como intentar convertir un texto en número), Python y Java adoptan enfoques filosóficos distintos:

| Filosofía | Siglas | Traducción | Lenguaje típico |
|-----------|--------|------------|-----------------|
| **Look Before You Leap** | LBYL | "Mira antes de saltar" | Java, C |
| **Easier to Ask Forgiveness than Permission** | EAFP | "Mejor pedir perdón que permiso" | Python |

En la práctica:

- **LBYL** → Validar las condiciones *antes* de ejecutar la operación.
- **EAFP** → Intentar la operación directamente y *capturar el error* si algo falla.

---

## El ejemplo: convertir texto a entero

Tomemos un caso concreto: queremos convertir una cadena de texto en un número entero, devolviendo `0` si no es posible.

### En Python (EAFP — estilo recomendado ✅)

```python
try:
    return int(texto)
except ValueError:
    return 0
```

En Python, este es el estilo **idiomático** (el que la comunidad considera correcto y espera ver). Las excepciones son baratas en Python —no generan un stack trace completo hasta que se inspeccionan— y la propia documentación oficial promueve EAFP.

Además, `int()` ya maneja casos extra sin necesidad de validar antes:

```python
int("  42  ")  # ✅ Funciona, ignora los espacios
```

### En Java (LBYL — estilo recomendado ✅)

```java
if (texto.matches("-?\\d+")) {
    return Integer.parseInt(texto);
}
return 0;
```

En Java, las excepciones son **costosas**: generan un stack trace completo aunque no se use. Si el método se llama frecuentemente con entradas inválidas, capturar excepciones puede degradar el rendimiento notablemente.

### En Java (EAFP — no recomendado ⚠️)

```java
try {
    int valor = Integer.parseInt(texto);
    return valor;
} catch (NumberFormatException e) {
    return 0;
}
```

Aunque este código funciona, en Java las excepciones deben reservarse para situaciones **verdaderamente excepcionales**, no para controlar el flujo normal del programa.

---

## Comparativa directa

| | Python | Java |
|---|---|---|
| **Estilo recomendado** | EAFP (`try/except`) | LBYL (validar antes) |
| **Coste de excepciones** | Bajo | Alto (stack trace completo) |

---
