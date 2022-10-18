public class ProjectLuasBangunKomplek {

    public static void main(String[] args) {
      //Lingkaran
        Lingkaran L1 = new Lingkaran (21);
        L1.outPut();
      //Persegi
        Persegi p1 = new Persegi(42);
        p1.output();
    }
}
