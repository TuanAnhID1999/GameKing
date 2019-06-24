package GameKing.GroupCharacter;

import GameKing.Data;
import GameKing.FoodStorage;

import java.util.Scanner;

public class Knight extends Character {

    private int loaiVuKhi;

    Knight(FoodStorage foodStorage) {
        super(foodStorage);
    }

    @Override
    protected void setMucTieuThu() {
        this.mucTieuThu = 8;
    }

    void tanCong() {
        // Loại vũ khí
        System.out.println("Loại vũ khí kĩ sĩ muốn dùng.");
        System.out.println("Loại vũ khí kĩ sĩ muốn dùng là giáo 5 " + "\n" + "Loại vũ khí kĩ sĩ muốn dùng là gươm là 6.");
        try {
            Scanner scanner = new Scanner(System.in);
            loaiVuKhi = scanner.nextInt();
            if (loaiVuKhi != 5 && loaiVuKhi != 6){
                System.out.println("Moi ban nhap lai");
                tanCong();
            }
            if (loaiVuKhi == Data.TAN_CONG_BANG_GIAO) {
                System.out.println("Kị sĩ tấn công bằng giáo.");
            } else if (loaiVuKhi == Data.TAN_CONG_BANG_GUOM) {
                System.out.println("Kĩ sĩ tấn công bằng gươm.");
            }
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("Co loi xay ra");
            tanCong();
        }
    }

}
