package GameKing.GroupCharacter;

import GameKing.FoodStorage;

public abstract class Character {
    protected int mucTieuThu;

    Character(FoodStorage foodStorage){
        setMucTieuThu();
        foodStorage.tieuhao(mucTieuThu);
    }

    protected abstract void setMucTieuThu();
}
