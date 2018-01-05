package package1;

/**
 * Java Object: Elemento
 *
 * Developed by: Salvatore Antonio Addimando
 */
class Elemento{
    //Attributi della classe
    private String N;
    private int nOssid[];
    private String nome_elemento;
    private String radice;
    private double massa_atomica;
    private double eleneg;
    private boolean metallo;
    private boolean biatom;
    private String gruppo;

    //Costruttore
    public Elemento(String N, int nOssid[], String nome_elemento, double massa_atomica, double eleneg, boolean metallo, boolean biatom, String gruppo){
        this.N = N;
        this.nOssid = nOssid;
        this.nome_elemento = nome_elemento;
        this.massa_atomica = massa_atomica;
        this.eleneg = eleneg;
        this.metallo = metallo;
        this.biatom = biatom;
        this.gruppo = gruppo;
    }

    //Costruttore per una radice
    public Elemento(String N, int nOssid[], String nome_elemento, String radice, double massa_atomica, double eleneg, boolean metallo, boolean biatom, String gruppo){
        this.N = N;
        this.nOssid = nOssid;
        this.nome_elemento = nome_elemento;
        this.radice = radice;
        this.massa_atomica = massa_atomica;
        this.eleneg = eleneg;
        this.metallo = metallo;
        this.biatom = biatom;
        this.gruppo = gruppo;
    }


    //GETTERS & SETTERS: servono per accedere alle variabili dall'esterno della classe, dato che sono state tipizzate con private

    //N
    public String getN(){
        return this.N;
    }
    public void setN(String N){
        this.N = N;
    }

    //NOME_ELEMENTO
    public String getNomeElemento(){
        return this.nome_elemento;
    }
    public void setNomeElemento(String nome_elemento){
        this.nome_elemento = nome_elemento;
    }

    //NOSSID[]
    public int[] getNOssid(){
        return this.nOssid;
    }
    public void setNOssid(int nOssid[]){
        this.nOssid = nOssid;
    }

    //MASSA_ATOMICA
    public double getMassaAtomica(){
        return this.massa_atomica;
    }
    public void setMassaAtomica(double massa_atomica){
        this.massa_atomica = massa_atomica;
    }

    //ELENEG
    public double getEleneg(){
        return this.eleneg;
    }
    public void setEleneg(double eleneg){
        this.eleneg = eleneg;
    }

    //METALLO
    public boolean isMetallo(){
        return this.metallo;
    }
    public void setMetallo(boolean metallo){
        this.metallo = metallo;
    }

    //BIATOM
    public boolean isBiatom(){
        return this.biatom;
    }
    public void setBiatom(boolean biatom){
        this.biatom = biatom;
    }

    //GRUPPO
    public String getGruppo(){
        return this.gruppo;
    }
    public void setGruppo(String gruppo){
        this.gruppo = gruppo;
    }

    //RADICE
    public String getRadice() {
        return this.radice;
    }
    public void setRadice(String radice) {
        this.radice = radice;
    }
}
