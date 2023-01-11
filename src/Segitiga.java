public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga(){

    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getAlas(){
        return this.alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public double getLuas(){
        return 0.5*getAlas()*getTinggi();
    }


    public String getBangunDatar(){
        return "Segitiga";
    }

    void display(){
        super.display();
        System.out.println("Luasnya adalah : "+getLuas());
    }
}
