package GameKing.GroupCharacter;

import GameKing.FoodStorage;
import GameKing.GroupCharacter.Character;

import java.util.Scanner;

public class Spy extends Character {

    private int ketQuaDoTham;

    Spy(FoodStorage foodStorage) {
        super(foodStorage);
    }

    @Override
    protected void setMucTieuThu() {
        this.mucTieuThu = 3;
    }

    // Nếu tấn công la 2, phòng thủ 3
    int tinhBao() {
        // Kết quả do thám Spy
        System.out.println("Kết quả do tham là : ");
        System.out.println("Nếu do thám báo tấn công điền 2 " + "\n" + "Nếu do thám báo phòng thủ điền 3");


        try {
            Scanner sc = new Scanner(System.in);
            ketQuaDoTham = sc.nextInt();
            if (ketQuaDoTham != 2 && ketQuaDoTham != 3){
                System.out.println("Mời bạn nhập lại.");
                tinhBao();
            }

        } catch (Exception io) {
            //io.printStackTrace();
            System.out.println("xảy ra lỗi.");
            tinhBao();

        }
        return ketQuaDoTham;

    }



}
