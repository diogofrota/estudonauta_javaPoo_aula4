public class Caneta {

    public String modelo;
    private float ponta;
    private String cor;
    private Boolean tampada;
    private String capa;
    private String estojo;


    // metodo construtor
    public Caneta(String c, String e){
        this.cor = "azul";
        this.tampada = true;
        this.capa = c;
        this.estojo = e;

    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }
    // usei o float pq estou fazendo um retorno
    public float getPonta() {
        return this.ponta;
    }

    // o void é usado na funcão quando não retorna nada.
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("o modelo da caneta é: " + this.getModelo());
        System.out.println("A ponta da caneta é: " + this.ponta);
        System.out.println("A cor da  caneta é: " + this.cor);
        System.out.println("A caneta está tampada: " + this.tampada);
        System.out.println("A capa da  caneta é: " + this.capa);
        System.out.println("O estojo da caneta é: " + this.estojo);
    }

}
