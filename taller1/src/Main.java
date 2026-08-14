//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int []  miArrey = {70, 12, 19, 54, 11, 33 };
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();
        misAlgoritmos.linearSearch(miArrey, 12);

        System.out.println(misAlgoritmos.linearSearch(miArrey, 12));
        System.out.println(misAlgoritmos.binarySearch(miArrey, 12));

    }
}