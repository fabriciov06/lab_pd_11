## Justificación de Decisiones de Diseño

### Uso de Estructuras Condicionales (`switch-case`)
Para la implementación de la Parte II(cálculo de precios dinámicos según el tamaño de la bebida), se optó por utilizar la estructura `switch-case` en lugar de colecciones dinámicas como `HashMap` por las siguientes razones:

1. **Naturaleza Fija de los Datos:** Los tamaños del menú ("N" para Normal, "M" para Mediano y "G" para Grande) constituyen un conjunto de datos pequeño, constante y completamente definido. No se prevé una expansión dinámica de tamaños en tiempo de ejecución.
2. **Eficiencia y Claridad:** Para un número reducido de opciones, el `switch` ofrece un flujo de control directo y de alta legibilidad, evitando la sobrecarga (overhead) innecesaria de memoria que implica instanciar y consultar un objeto `HashMap`.
3. **Mantenimiento del Patrón Decorator:** Permite que el método `costo()` evalúe de manera limpia y cohesiva el estado del objeto antes de delegar o sumar el precio del componente base.

4. <img width="1057" height="552" alt="image" src="https://github.com/user-attachments/assets/43f31c5b-6d27-446d-a9ac-e89d2a0361ae" />
