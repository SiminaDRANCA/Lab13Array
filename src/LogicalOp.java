public class LogicalOp {

    /* 2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.*/
    public int[] listArrayOfValues(int positions) {
        int[] myArray = new int[positions];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public int[] printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + ", ");
        }
        return myArray;
    }

    /*3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate
     valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza
     un array, deci acesta va trebui surprins si afisat folosind o bucla.*/
    public int[] listArrayOfEvens() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i += 2) {
            myArray[i] = i + 2;
        }
        return myArray;
    }

    public int[] printEvenArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i += 2) {
            System.out.println(myArray[i] + ", ");
        }
        return myArray;
    }


    /*4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa
     calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza*/
    public float getAverageFromArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum / myArray.length;

    }
/*5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de
tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa
 returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public boolean doNamesMatch(String[] myArrayOfNames, String name) {
        for (int i = 0; i < myArrayOfNames.length; i++) {
            if (myArrayOfNames[i] == name) {
                return true;
            }
        }
        return false;
    }


    /*6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip
    numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe
    care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.*/
    public int getTheIndexForMyValues(int[] myValues, int theValue) {
        for (int i = 0; i < myValues.length; i++) {
            if (myValues[i] == theValue) {
                return i;
            }
        }
        return -1;
    }


   /*7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:


- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -

- - - - - - - - - -*/

    public String[] printGrill(String[10] {
         for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
    return printGrill();

    }
            }




/*8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
 Apelati metoda in main() pentru a verifica daca functioneaza.

9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array. Apelati metoda in
 main() pentru a verifica daca functioneaza.

10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
 Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea. Apelati metoda in main()
  pentru a verifica daca functioneaza.
*/


