import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez vos nombres, séparés par une virgule : ");
        String nbSaisis = scanner.nextLine();

        List<String> tabNbStr = new ArrayList<>(List.of(nbSaisis.replace(" ", "").split(",")));
        //System.out.println(tabNbStr);

        List<Integer> tabNbInt = new ArrayList<>();
        //Vérification si nombre + stockage dans nouveau tableau int
        for(String valNb : tabNbStr){
            if(!valNb.isEmpty()){
                boolean estNombre = true;
                for(char car: valNb.toCharArray()){
                    if(!Character.isDigit(car)){
                        estNombre = false;
                        break;
                    }
                }
                if(estNombre){
                    tabNbInt.add(Integer.parseInt(valNb));
                }
            }
        }

        //Retrait du tri Bubble pour utilisation de la méthode sort()
        Collections.sort(tabNbInt);
        System.out.println(tabNbInt);

        int nbManquant = trouverNbManquant(tabNbInt);
        System.out.println(nbManquant);
    }

    //Recherche chiffre manquant
   public static int trouverNbManquant(List<Integer> listeNb){
       int tailleTab = listeNb.size() - 1;
        for(int i=0; i < tailleTab; i++){
            if(listeNb.get(i) + 1 != listeNb.get(i+1)) {
                return listeNb.get(i) + 1;
            }
        }
        return 0;
   }

}