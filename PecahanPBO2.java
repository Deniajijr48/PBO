
package pecahanpbo2;

public class PecahanPBO2 {
    public int pembilang, penyebut;
    private Object d2;
    public int getpembilang() {
        return pembilang;
    }
    public int getpenyebut() {
        return penyebut;
    }
    PecahanPBO2(int pembilang, int penyebut) {
        this.penyebut = penyebut;
        this.pembilang = pembilang;
    }
    public PecahanPBO2 tambah(PecahanPBO2 x){
        int data1, data2;
        
        PecahanPBO2 d1;
        d1 = x;
        data1 = x.penyebut;
        data2 = x.pembilang;
        PecahanPBO2 d2 = new PecahanPBO2(5, 6);
        
        System.out.println("Objek2 : ");
        System.out.println(+d2.getpembilang());
        System.out.println("/");
        System.out.println(+d2.getpenyebut());
        System.out.println();
            x.penyebut = data1 * d2.penyebut;
            x.pembilang = d2.penyebut*data2 + data1*d2.pembilang;
            return x;
    }
    public static void main(String[] args) {
        PecahanPBO2 x;
        int a, b;
        PecahanPBO2 d1 = new PecahanPBO2(3,2);
        System.out.print("objek1 : ");
        System.out.print(+d1.getpembilang());
        System.out.print("/");
        System.out.print(+d1.getpenyebut());
        System.out.println();
        //pecahan hasil = new pecahan(x, y);
        x = d1.tambah(d1);
        a = x.pembilang;
        b = x.penyebut;
        System.out.print( "hasil : " +a);
        System.out.print("/");
        System.out.print(+b);
        System.out.println();
        
    }
}
