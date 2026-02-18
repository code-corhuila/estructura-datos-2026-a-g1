# CORPORACIÓN UNIVERSITARIA DEL HUILA – CORHUILA  
## Manual Técnico  
### Uso de Etiquetas de Código en Markdown (.md)

**Dependencia/Programa:** Ingeniería Multimedia / ADSO (según aplique)  
**Documento:** Manual de apoyo – Documentación técnica  
**Versión:** 1.0  
**Fecha:** 10/02/2026  
**Autor:** Jesús Ariel González Bonilla  

---

## 1. Propósito

Establecer una guía institucional y práctica para documentar **código fuente**, **comandos**, **fragmentos técnicos**, **salidas de consola** y **cambios (diff)** usando Markdown (.md), garantizando claridad, legibilidad y estandarización en entregables académicos y técnicos.

---

## 2. Alcance

Aplica a:
- Informes y guías en formato `.md`
- Repositorios Git (README, documentación técnica, bitácoras)
- Entregables de cursos y semilleros
- Documentación de APIs, microservicios y bases de datos

---

## 3. Convenciones generales

- **Backtick (acento grave):** `  
- **Bloque de código (fenced):** ```  
- **Lenguaje (syntax highlighting):** se indica tras los tres backticks (ej.: `sql`, `go`, `java`, `bash`, `json`, `yaml`).

> Regla institucional de presentación:  
> **Todo fragmento de código debe ir en inline o bloque de código; evitar imágenes para código.**

---

## 4. Código en línea (Inline)

### 4.1 Descripción
Se usa para porciones pequeñas dentro de un párrafo: comandos cortos, variables, funciones o rutas.

### 4.2 Sintaxis
```md
`texto de código`
```

### 4.3 Ejemplo
```md
Ejecute `git status` y valide la función `p_dossier_query()`.
```

---

## 5. Bloques de código (Fenced code blocks)

### 5.1 Descripción
Se usan para código de varias líneas.

### 5.2 Sintaxis
```md
```text
código aquí
```
```

### 5.3 Ejemplo (sin lenguaje)
```text
Línea 1
Línea 2
Línea 3
```

---

## 6. Bloques con resaltado por lenguaje (Syntax Highlighting)

### 6.1 Reglas de uso
- Siempre que sea posible, indicar el lenguaje.
- Mantener consistencia en el documento.

### 6.2 Ejemplos por lenguaje

#### Java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}
```

#### Go (Golang)
```go
package main

import "fmt"

func main() {
    fmt.Println("Hola desde Go")
}
```

#### SQL
```sql
SELECT *
FROM dossier d
WHERE d.gov_entity_id = '4ca7b263-5ccb-3c04-6b54-ffdf9d5f77e5'::uuid;
```

#### Bash
```bash
git pull
git add .
git commit -m "feat: update docs"
git push
```

#### PowerShell
```powershell
cd C:\Users\robay\Downloads\demo\demo
.\mvnw.cmd spring-boot:run
```

#### JSON
```json
{
  "tax_id": "3f7e05c7-dde8-0f48-8460-d9c8b426fa22",
  "limit": 20
}
```

#### YAML
```yaml
server:
  port: 8080
  name: api-service
```

#### HTML
```html
<!doctype html>
<html lang="es">
  <head><meta charset="utf-8"><title>Demo</title></head>
  <body><h1>Hola</h1></body>
</html>
```

#### CSS
```css
.card {
  border-radius: 10px;
  padding: 15px;
}
```

#### JavaScript
```javascript
const suma = (a, b) => a + b;
console.log(suma(5, 3));
```

---

## 7. Bloques para logs y salidas de consola

### 7.1 Recomendación
Para logs, respuestas HTTP, trazas y salidas de CLI, usar `text`.

```text
HTTP/1.1 200 OK
Content-Type: application/json

[]
```

---

## 8. Formatos especiales

### 8.1 Diff (cambios en código)
Útil para evidenciar modificaciones de manera controlada.

```diff
- console.log("Error");
+ console.log("Éxito");
```

### 8.2 INI (configuración)
```ini
[database]
host=localhost
port=5432
```

### 8.3 XML
```xml
<user>
  <name>Jesús</name>
</user>
```

---

## 9. Escapar backticks

### 9.1 Caso
Cuando se requiere mostrar ``` dentro de un bloque.

### 9.2 Solución
Usar más backticks por fuera del bloque:

````md
````
Ejemplo con ```
````
````

---

## 10. Buenas prácticas CORHUILA (presentación profesional)

- Usar **inline** solo para fragmentos cortos.
- Para procedimientos, funciones, scripts o respuestas de API, usar **bloques con lenguaje**.
- Para evidenciar cambios en actividades (control de versiones), usar **diff**.
- No mezclar múltiples lenguajes en un mismo bloque (salvo que sea estrictamente necesario).
- Mantener ejemplos mínimos, reproducibles y claros.

---

## 11. Plantillas reutilizables

### 11.1 Plantilla de comando + salida
```md
**Comando:**
```bash
git status
```

**Salida:**
```text
On branch main
nothing to commit, working tree clean
```
```

### 11.2 Plantilla para documentación de API (respuesta)
```md
**Respuesta:**
```json
{
  "status": "ok",
  "code": 200
}
```
```

---

## 12. Control de versiones del documento

- **v1.0 (10/02/2026):** Primera versión del manual institucional de etiquetas de código en Markdown.

---
**Fin del documento.**
