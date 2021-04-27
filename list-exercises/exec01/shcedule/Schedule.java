package shcedule;

import java.util.ArrayList;

public class Schedule {
    /**
     * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de
     * realizar as seguintes operações: void armazenaPessoa(String nome, int idade,
     * float altura); void removePessoa(String nome); int buscaPessoa(String nome);
     * // informa em que posição da agenda está a pessoa void imprimeAgenda(); //
     * imprime os dados de todas as pessoas da agenda void imprimePessoa(int index);
     * // imprime os dados da pessoa que está na posição “i” da agenda.
     */

    private ArrayList<Person> schedule = new ArrayList<Person>();

    public void addPerson(String name, int age, double height) {
        Person person = new Person(name, age, height);
        schedule.add(person);
    }

    public void displayPersons() {
        for (Person person : schedule) {
            System.out.println(person.name);
            System.out.println(person.age);
            System.out.println(person.height);
        }
    }

    public void displayPerson(Person person) {
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);
    }

    public void removePerson(String targetName) {
        for (Person person : schedule) {
            if (person.name == targetName) {
                schedule.remove(person);
            }
        }
    }

    public void getPersonByName(String targetName) {
        for (Person person : schedule) {
            if (person.name == targetName) {
                displayPerson(person);
                break;
            }
            System.out.println("Pessoa não existe!");
        }
    }

    public void getPersonByIndex(int index) {
        displayPerson(schedule.get(index));

    }

}
