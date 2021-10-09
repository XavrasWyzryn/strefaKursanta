import java.util.Scanner;

public class MultiDimensionalArraysExcersises {
    public static void main(String[] args) {
        // Zadanie 1 (gra w statki)
        // stworzyc dwuwymiarowa tablice, ktora trzyma wartosci 0 i ma rozmiary 10 x 10
        // w kilku losowych miejscach przypisac wartosc 1 (czyli zrobic statki)
        // przy pomocy Scanner pobrac wiersz i kolumne, na ktora chcemy oddac strzal
        // wyswietlic wynik, czy trafione, czy pudlo

        int[][] ships = generateShipsBoard();

        int shootColumn = getShootValue("column");
        int shootRow = getShootValue("row");

        checkIfShipWasShoot(ships, shootColumn, shootRow);

        // Zadanie 2 (zliczanie mieszkancow w budynku)
        // stworzyc trojwymiarowa tablice, ktora bedzie pod nr klatki, pietra i mieszkania
        // trzymac informacje o ilosci osob tam mieszkajacych
        // policzyc ile osob mieszka w budynku
        // czyli int[][][] budynek, gdzie np. budynek[0][0][0] to bedzie ilosc mieszkancow
        // w zerowej klatce na parterze w mieszkaniu nr 0
        int[][][] building = new int[][][]{
                {{1, 4},{3, 3},{1, 1},{2, 1}},
                {{2, 2},{4, 5},{1, 2},{3, 7}},
                {{1, 1},{2, 3},{3, 2},{4, 1}}
        };

        int amountOfPeople = countPeopleInBuilding(building);
        movePeopleFromApartment(building, 2, 3, 1, 1);
        amountOfPeople = countPeopleInBuilding(building);
        movePeopleFromApartment(building, 2, 3, 1, 5);
        amountOfPeople = countPeopleInBuilding(building);
        movePeopleIntoApartment(building, 2, 3, 1, 3);
        amountOfPeople = countPeopleInBuilding(building);
    }

    private static void movePeopleFromApartment(int[][][] building,
                                                int stairCase,
                                                int floor,
                                                int flat,
                                                int peopleLeaving) {
        if (building[stairCase][floor][flat] < peopleLeaving) {
            building[stairCase][floor][flat] = 0;
        } else {
            building[stairCase][floor][flat] = building[stairCase][floor][flat] - peopleLeaving;
        }
    }

    private static void movePeopleIntoApartment(int[][][] building,
                                                int stairCase,
                                                int floor,
                                                int flat,
                                                int peopleMovingIn) {
        building[stairCase][floor][flat] = building[stairCase][floor][flat] + peopleMovingIn;
    }

    private static int countPeopleInBuilding(int[][][] building) {
        int peopleLivingInBuilding = 0;
        for (int i = 0; i < building.length; i++) {
            for (int j = 0; j < building[i].length; j++) {
                for (int k = 0; k < building[i][j].length; k++) {
                    peopleLivingInBuilding += building[i][j][k];
                }
            }
        }
        System.out.println(peopleLivingInBuilding + " people are living in this building.");
        return peopleLivingInBuilding;
    }

    static void checkIfShipWasShoot(int[][] ships, int column, int row) {
        System.out.println("Sprawdzam strzal");
        if (ships[column][row] == 1) {
            System.out.println("Trafiony!!");
        } else {
            System.out.println("Pudło :(");
        }
    }

    static int[][] generateShipsBoard() {
        int[][] ships = new int[10][10];
        ships[0][0] = 1;
        ships[0][1] = 1;
        ships[0][2] = 1;
        ships[0][3] = 1;

        ships[6][7] = 1;
        ships[6][8] = 1;
        ships[6][9] = 1;

        ships[2][7] = 1;
        ships[3][7] = 1;
        ships[4][7] = 1;

        return ships;
    }

    static int getShootValue(String dimensionType) {
        System.out.println("Type " + dimensionType + " number to shoot:");
        Scanner scanner = new Scanner(System.in);
        int shootValue = scanner.nextInt();
        return shootValue;
    }
}
