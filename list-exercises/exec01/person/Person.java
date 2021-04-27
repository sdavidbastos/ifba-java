package person;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Crie uma classe para representar uma pessoa, com os atributos privados de
 * nome, data de nascimento e altura. Crie os métodos públicos necessários para
 * sets e gets e também um método para imprimir todos dados de uma pessoa. Crie
 * um método para calcular a idade da pessoa.
 */
public class Person {
    private String name;
    private String birthDate;
    private double height;

    Person(String name, String birthDate, double height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    public int getAge() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();

        Date birthDate = sdf.parse(this.birthDate);

        cal.setTime(birthDate);

        int yearOfBirthDate = cal.get(Calendar.YEAR);

        Date currentDate = new Date();
        cal.setTime(currentDate);

        int currentYear = cal.get(Calendar.YEAR);

        int age = currentYear - yearOfBirthDate;

        return age;

    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public double getHeight() {
        return this.height;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}