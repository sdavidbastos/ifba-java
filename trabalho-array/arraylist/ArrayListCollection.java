package arraylist;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // Cria um ArrayList de strings
        ArrayList<String> items = new ArrayList<String>();

        /**
         * Methods do ArrayList - add("red") -> Adiciona um elemento ao array -
         * add(0,yellow") -> Adiciona um elemento ao array na posição 0 - size() ->
         * retona o tamanho do array - get(índice) -> retorna o valor correspondente ao
         * índice - remove(1) -> remove o elemento daquele indice - remove("yellow") ->
         * remove o elemeto com o valor yellow - contains("red") -> verifica se existe
         * "red" na lista
         */
        items.add("red");
        items.add(0, "yellow");

        System.out.print("Dados da lista: ");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }

        display(items, "\n Exibe as core: ");

        items.add("green");
        items.add("yellow");

        display(items, "\n Novas cores adicionadas: ");

        items.remove("yellow");
        items.remove(1);

        display(items, "\n Algumas cores removidas: ");

        System.out.printf("\"red\" is %sin the list\n", items.contains("red") ? "" : "not");

        System.out.printf("Size: %s \n", items.size());
    }

    public static void display(ArrayList<String> items, String message) {
        System.out.print(message);

        for (String color : items) {
            System.out.printf(" %s", color);
        }

        System.out.println();
    }
}
