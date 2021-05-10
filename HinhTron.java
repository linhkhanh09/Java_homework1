package fs.apidef.identifyservice.java.java_homework1;

public class HinhTron {
    int r = 8;
    double pi = 3.14;

    double dienTichHinhTron() {
        double s = r * r * pi;
        System.out.println("Diện tích hình tròn = " + s);
        return s;
    }

    double chuViHinhTron() {
        double c = r * 2 * pi;
        System.out.println("Chi vi hình tròn = " + c);
        return c;
    }
}
