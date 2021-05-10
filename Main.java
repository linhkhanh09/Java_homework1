package fs.apidef.identifyservice.java.java_homework1;

public class Main {

    public static void main(String args[]) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.dientichHCN();
        hcn.chiviHCN();

        HinhTron hinhtron = new HinhTron();
        double s = hinhtron.dienTichHinhTron();
        double c = hinhtron.chuViHinhTron();
    }
}
