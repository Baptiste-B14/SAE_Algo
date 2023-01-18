import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] données = générerDonnéesEntreBornes(50, 0, 20);
//        System.out.println(Arrays.toString(données));

        int[] données = Tris.générerDonnéesEntreBornes(10, 0, 20);
        //Tris.afficheTab(données);

        long tempsDébut = System.nanoTime();

        //Arrays.sort(données); // trie le tableau en utilisant un algorithme de type Quicksort
        //TriSelection.triSelection(données);

        System.out.println("tableau trié :");

        Tris.triComptage( 0, 20, données);
        long tempsFin = System.nanoTime();
        System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDébut) / 1000000) );

//        System.out.println(Arrays.toString(données));
    }

}
