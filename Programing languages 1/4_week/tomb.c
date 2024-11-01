/*

Alapvető tulajdonságok:
1. **Azonos típusú elemek tárolása**: A tömb minden eleme ugyanolyan típusú adatot tárol.
2. **Folytonos memóriaterületen tárolódnak**: Az elemek egymás után, folytonosan helyezkednek el a memóriában.
3. **Indexelés**: Az elemeket számokkal indexeljük, ahol az indexek általában 0-tól kezdődnek és (n-1)-ig tartanak, 
ahol 'n' a tömb mérete.

Létrehozás:
A tömb létrehozása előzetes deklarációval és inicializációval történik. Például:

```c
int myArray[5]; // 5 elemű egész típusú tömb deklarációja
```

Ez az utasítás egy 5 elemű egész típusú tömböt hoz létre, melyet `myArray` néven lehet elérni.

Egyéb infók:
- **Tömbméret**: A tömb méretét deklarációkor meg kell adni, és általában fix marad a tömb életciklusa során.
- **Elemek hozzáférése**: Az elemeket a tömb neve és az index kombinációjával lehet elérni. Például `myArray[0]`, `myArray[1]`, stb.
- **Elemek inicializálása**: A tömb elemeit külön-külön is inicializálhatod, például `int myArray[5] = {1, 2, 3, 4, 5};` 
vagy egy ciklus segítségével is.
- **Tömbök paraméterként**: Tömbök címét adhatod át függvényeknek paraméterként, így a függvények módosíthatják a tömb tartalmát.

Fontos megjegyezni, hogy a C tömbök nem dinamikusak, vagyis nem változtatható meg a méretük futás közben. 
Ha változó méretű adatszerkezetet szeretnél, akkor inkább dinamikus memóriakezelést kell alkalmaznod 
például a `malloc()` és `free()` függvények segítségével.*/