public class Personaxe {
    private int vida;
    private int x;
    private int y;
    private String nome;

    public boolean estaVivo(){
        return vida > 0;

    }

    public Personaxe (String nome,int x, int y){
        this.nome=nome;
        this.x=x;
        this.y=y;
        this.vida=100;
        if (estaVivo()){
            System.out.println("Estoy vivo");
        }
    }

    
}
