public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){

    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public String getBangunDatar(){
        return "Persegi";
    }

    public double getLuas(){
        return sisi*sisi;
    }


    void display(){
        super.display();
        System.out.println("Luasnya adalah : "+getLuas());
    }

}