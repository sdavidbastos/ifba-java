package array;

public class PassArray {
    public static void main(String[] args) {
        /**
         * Cria um array de interios e inicializandos os valores dele.
         */
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println("Valores sem alterações");

        /**
         * O for abaixo é uma mais curta de escrever todo o looping. Vai printar os
         * valores do array.
         */
        for (int value : array)
            System.out.printf(" %d\n", value);

        System.out.println("Valores alterados");

        /**
         * O array é passado por referência. Isto significa que as alterações feitas
         * dentro da função vão afetar o array original.
         * 
         * Diferentemente da passagem por valor que cria uma copia do valor original.
         */
        modifyArray(array);

        /**
         * Printa na tela os valores modificados
         */
        for (int value : array) {
            System.out.printf(" %d \n", value);
        }
        /**
         * Passagem por valor. Passa uma copia do 4º elemento do array. array[3] = 4
         */
        modifyElement(array[3]);
        System.out.printf("Depois de modifyElement(array[3]): %d\n", array[3]);

    }

    // Mutiplica todos os elementos do array por dois
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;

        }
    }

    // Mutiplica o elemento por dois
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Dentro de modifyElement(array[3]): %d\n", element);
    }
}