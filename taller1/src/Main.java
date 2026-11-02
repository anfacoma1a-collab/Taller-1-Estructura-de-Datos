//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] miArrey = {11, 12, 19, 33, 54, 70};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();


        System.out.println(misAlgoritmos.linearSearch(miArrey, 12));
        System.out.println(misAlgoritmos.binarySearch(miArrey, 12));

    }
}