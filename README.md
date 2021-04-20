# plf08

FIXME: App de codificacion y decodificacion mediante Cuadrado de Polibio y Transposicion de Columnas.

## Usage

FIXME: Ejecutar mediante CMD o la terminal de VSCode

Codificar polibio:

    lein run "polibio" "cifrado" "clave" "ruta del archivo limpio, plano" "ruta del archivo original" 

Decodificar polibio:

    lein run "polibio" "descifrar" "clave" "ruta del archivo limpio, plano" "ruta del archivo codificado"

Codificar columnas:

    lein run "columnas" "cifrado" "clave" "ruta del archivo limpio, plano" "ruta del archivo original" 

Decodificar columnas:

    lein run "columnas" "descifrar" "clave" "ruta del archivo limpio, plano" "ruta del archivo codificado"   

## Options

FIXME: listing of options this app accepts.

## Examples

    lein run "polibio" "cifrar" " " "C:/tmp/prueba.txt" "C:/tmp/kafka.txt"

    lein run "polibio" "descifrar" " " "C:/tmp/prueba.txt" "C:/tmp/limpio.txt"

    
    lein run "columnas" "cifrar" "hola" "C:/tmp/prueba.txt" "C:/tmp/kafka.txt"

    lein run "columnas" "descifrar" "hola" "C:/tmp/prueba.txt" "C:/tmp/limpio.txt"

### Bugs

    El descifrado presenta desface ya que cuando encuentra simbolos que no reconoce, salta la seleccion
    de caracteres y compara mal.

### That You Think

    Se puede mejorar

### Might be Useful

## License

Copyright © 2020 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
