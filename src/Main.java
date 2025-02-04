import java.util.ArrayList;
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

        rangementNb(tabNbInt);
        //System.out.println(tabNbStr);
        System.out.println(tabNbInt);
    }

    //Tri bubble pour ranger dans l'ordre
    public static void rangementNb(List<Integer> listeNb){
        int taille = listeNb.size() - 1;
        boolean echange;
        do{
            echange = false;
            for(int i=0; i < taille; i++){
                if(listeNb.get(i) > listeNb.get(i+1)) {
                    int temp = listeNb.get(i);
                    listeNb.set(i, listeNb.get(i+1));
                    listeNb.set(i+1, temp);
                    echange = true;
                }
            }
            taille--;
        }while(echange);
    }


}