public class Calculator {
/*1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului.
Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa. Spre exemplu, pentru metoda
de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri, o data cu 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc.
Atentie ce returnati la final! Apelati metodele in Main pentru a testa daca functioneaza.*/

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("Addition of two numbers:" + c);
    }

    public void sum(int a, int b, int e) {
        int c = a + b + e;
        System.out.println("Addition of three numbers :" + c);
    }

    public void diff(int a, int b) {
        int c = a - b;
        System.out.println("Difference of two numbers:" + c);

    }

    public void diff(int a, int b, int e) {
        int c = a - b - e;
        System.out.println("Difference of three numbers :" + c);
    }
}
