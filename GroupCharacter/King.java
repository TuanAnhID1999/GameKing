package GameKing.GroupCharacter;

import GameKing.*;

public class King extends Character {


    public King(FoodStorage foodStorage) {
        super(foodStorage);
    }

    public void dieuHanhQuanDoi(FoodStorage foodStorage) {
        Spy spy = new Spy(foodStorage);
        int raLenh = spy.tinhBao();
        if (raLenh == Data.PHONG_THU) {
            // ra lệnh phòng thủ
            Soldier soldier = new Soldier(foodStorage);
            soldier.phongThu();

        } else if (raLenh == Data.TAN_CONG) {
            // ra lệnh tấn công
            Knight knight = new Knight(foodStorage);
            knight.tanCong();
        }
    }


    public void dieuHanhDatNuoc(FoodStorage foodStorage) {
        Farmer farmer = new Farmer(foodStorage);
        farmer.trongTrot(foodStorage);
    }


    @Override
    protected void setMucTieuThu() {
        this.mucTieuThu = 10;
    }
}
