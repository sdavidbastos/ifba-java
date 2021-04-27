package shcedule;

public class Person {
    /**
     * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de
     * realizar as seguintes operações: void armazenaPessoa(String nome, int idade,
     * float altura); void removePessoa(String nome); int buscaPessoa(String nome);
     * // informa em que posição da agenda está a pessoa void imprimeAgenda(); //
     * imprime os dados de todas as pessoas da agenda void imprimePessoa(int index);
     * // imprime os dados da pessoa que está na posição “i” da agenda.
     */
    public String name;
    public int age;
    public double height;

    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

}
