package main;

public class Canal implements Comparable<Canal>{
    private int numeroDoCanal;
    private String nomeDoCanal;
    private boolean hd;
    
    public int getNumeroDoCanal(){
        return this.numeroDoCanal;
    }
    public void setNumeroDoCanal(int numeroDoCanal){
        this.numeroDoCanal = numeroDoCanal;
    }
    public String getNomeDoCanal(){
        return this.nomeDoCanal;
    }
    public void setNomeDoCanal(String nomeDoCanal){
        this.nomeDoCanal = nomeDoCanal;
    }
    public boolean getHd(){
        return this.hd;
    }
    public void setHd(boolean hd) {
        this.hd = hd;
    }
    public Canal(int numeroDoCanal, String nomeDoCanal, boolean hd){
        this.numeroDoCanal = numeroDoCanal;
        this.nomeDoCanal = nomeDoCanal;
        this.hd = hd;
    }

    @Override
    public int compareTo(Canal outroCanal) {
        if(this.numeroDoCanal < outroCanal.getNumeroDoCanal()){
            return -1;
        } else if(this.numeroDoCanal > outroCanal.getNumeroDoCanal()){
            return 1;
        } else {
            return 0;
        }
    }
    
    public String toString(){
        return "Número do Canal: " + this.numeroDoCanal + ", Nome do Canal: " + this.nomeDoCanal + ", HD: " + this.hd;
    }
}
