package elevator;

public class Elevator {
    private int currentFloor = 0;
    private int totalFloors;
    private int totalCapacity;
    private int amountOfPeople;

    Elevator(int totalCapacity, int totalFloors) {
        this.totalCapacity = totalCapacity;
        this.totalFloors = totalFloors;
    }

    private boolean hasSpace() {
        return this.amountOfPeople < this.totalCapacity;
    }

    private boolean hasPeople() {
        return this.amountOfPeople > 0;
    }

    private boolean hasFloor() {
        return this.currentFloor < this.totalFloors && this.currentFloor > 0;
    }

    // Entra
    public void addPeople() {
        if (hasSpace()) {
            this.amountOfPeople++;
            return;
        }

        System.out.println("Elevador cheio");
    }

    // Sai
    public void removePeople() {
        if (hasPeople()) {
            this.amountOfPeople--;
            return;
        }
        System.out.println("Elevador vazio");
    }

    // Sobe
    public void addFloor() {
        if (hasFloor()) {
            this.currentFloor++;
            return;
        }

        System.out.println("Já está último andar");
    }

    // desce
    public void removeFloor() {
        if (hasFloor()) {
            this.currentFloor--;
            return;
        }

        System.out.println("Já está no térreo");
    }
}
