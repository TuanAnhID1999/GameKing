package GameKing.GroupCharacter;

import GameKing.FoodStorage;
import GameKing.GroupCharacter.Character;

public class Soldier extends Character {


     Soldier(FoodStorage foodStorage) {
        super(foodStorage);
    }

    @Override
    protected void setMucTieuThu() {
        mucTieuThu = 2;
    }

//    protected void tieuThu(FoodStorage foodStorage) {
//        int luongThucTrongKhoCon = foodStorage.baoCaoLuongThucConLai() - luongThucBinhLinhTieuHao;
//        foodStorage.setLuongThucBanDau(luongThucTrongKhoCon);
//        // System.out.println(" Số tấn tiêu thụ của Binh lính là = 2  Số tấn còn lại trong kho = " + luongThucTrongKhoCon);
//    }


     void phongThu() {
        System.out.println("Binh lính bắt đầu tham gia phòng thủ. ");
    }

}
