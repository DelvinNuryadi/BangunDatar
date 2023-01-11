public class BangunDatar {
    private String BangunDatar;
    private double luas;

    public BangunDatar(){

    }

    public String getBangunDatar(){
        return null;
    }

    public void setBangunDatar(String BangunDatar){
        this.BangunDatar = BangunDatar;
    }

    public void setLuas(double luas){
        this.luas = luas;
    }

    public double getLuas(){
        return luas;
    }


    void display(){
        System.out.println("Menghitung luas : "+getBangunDatar());
    }
    
}