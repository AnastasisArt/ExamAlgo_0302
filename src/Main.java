import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez vos nombres, séparés par une virgule : ");
        String nbSaisis = scanner.nextLine();

        List<String> tabNbStr = new ArrayList<>(List.of(nbSaisis.replace(" ", "").split(",")));
        System.out.println(tabNbStr);

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

        System.out.println(tabNbStr);
        System.out.println(tabNbInt);
    }
}