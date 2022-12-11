public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        String[] myArrayOfNames = {"Daniel", "Simina", "Antim", "Gruia", "Liza"};
        int[] myValues = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        String[] myNeuronalMap = {"- "};
        op.printArray(op.listArrayOfValues(100));
        System.out.println();
        System.out.println(op.getAverageFromArray( op.printArray(op.listArrayOfValues(100))));
        op.printEvenArray(op.listArrayOfEvens());
        System.out.println(op.doNamesMatch(myArrayOfNames, "Antim"));
        int position = op.getTheIndexForMyValues(myValues,22);
        if (position == -1){
            System.out.println("valoarea nu se regăsește în array-ul dat");
        }else{
            System.out.println("valoarea se afla pe pozitia " + position);
        }

        System.out.print(op.printGrill());

        Calculator obj = new Calculator();
        obj.sum ( 30,90);
        obj.sum(45, 80, 22);
        obj.diff(45,15);
        obj.diff(100, 25, 70);


    }
    }