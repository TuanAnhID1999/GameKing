package GameKing.GroupCharacter;


import GameKing.FoodStorage;
import GameKing.GroupCharacter.Character;

public class Farmer extends Character {


    Farmer(FoodStorage foodStorage) {
        super(foodStorage);
    }

    protected void trongTrot(FoodStorage foodStorage) {
        // Điều hành đất nước
        System.out.println("Nông dân tạo ra 10 tấn.");
       foodStorage.themLuongThuc(10);
        System.out.println("Số lương thực trong kho sau khi nông dân tạo ra là = " + foodStorage.baoCaoLuongThucConLai());


    }


    @Override
    protected void setMucTieuThu() {
        this.mucTieuThu = 1;
    }
}
