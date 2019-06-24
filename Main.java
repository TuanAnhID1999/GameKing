package GameKing;

import GameKing.GroupCharacter.King;

public class Main {
    private static FoodStorage foodStorage = new FoodStorage();

    private static void init() {
        King king = new King(foodStorage);
        // Gọi do thám.
        king.dieuHanhQuanDoi(foodStorage);
        // Gọi nông dân
        king.dieuHanhDatNuoc(foodStorage);

    }


    public static void main(String[] args) {
       init();
    }


}
