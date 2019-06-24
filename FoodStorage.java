package GameKing;

public class FoodStorage {
    private int luongThucConTrongKho = 100;

    // muốn kiểm tra mức tiêu hao
    public void tieuhao(int mucTieuHao) {
        luongThucConTrongKho = luongThucConTrongKho - mucTieuHao;
    }

    public void themLuongThuc(int luongThemVao){
        luongThucConTrongKho = luongThucConTrongKho + luongThemVao;
    }


    public int baoCaoLuongThucConLai() {
        // System.out.println("Lương thực còn lại trong kho là : " +luongThucConTrongKho);
        return luongThucConTrongKho;
    }

}
