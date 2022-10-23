package thirdhometask.thirdpart.task2;

public class Main {
    public static void main(String[] args) {
        Stool stool = new Stool();
        Table table = new Table();

        boolean isPossibleToFixStool = BestCarpenterEver.isPossibleToFixFurniture(stool);
        boolean isPossibleToFixTable = BestCarpenterEver.isPossibleToFixFurniture(table);

        System.out.println(isPossibleToFixStool);
        System.out.println(isPossibleToFixTable);
    }
}
