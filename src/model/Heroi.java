package model;

public class Heroi {
    private String nome;
    private Integer wins;
    private Integer loses;
    private String nivel;


    public Heroi(String nome, Integer wins, Integer loses){
        this.setNome(nome);
        this.setWins(wins);
        this.setLoses(loses);
    }
    public int calculaNivel(int wins, int loses){
        int saldoWins = wins - loses;
        String nivel;
        if(saldoWins <= 10)
            nivel = "Ferro";
        else if(saldoWins <=20)
            nivel = "Bronze";
        else if(saldoWins <=50)
            nivel = "Prata";
        else if(saldoWins <=80)
            nivel = "Ouro";
        else if(saldoWins <=90)
            nivel = "Diamante";
        else if(saldoWins <=100)
            nivel = "Lendário";
        else {
            nivel = "Imortal";
        }
        this.setNivel(nivel);
        return saldoWins;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLoses() {
        return loses;
    }

    public void setLoses(Integer loses) {
        this.loses = loses;
    }

    public static void main(String[] args) {
        Heroi firstHero = new Heroi("Zelda", 102, 17);
        int saldo = firstHero.calculaNivel(firstHero.getWins(), firstHero.getLoses());
        System.out.printf("O Herói %s tem o saldo de %d wins e está no nível %s.",
                firstHero.getNome(),saldo, firstHero.getNivel());
        
    }
}
