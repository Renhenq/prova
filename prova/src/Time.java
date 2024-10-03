public class Time {
    private String nome;
    private Jogador t1;
    private Jogador t2;
    private Jogador sub;

    public Time(String nome, Jogador t1, Jogador t2, Jogador sub) {
        this.nome = nome;
        this.t1 = new Jogador(t1.getNome(), t1.getIdade(), t1.getAltura(), t1.getPeso());
        this.t2 = new Jogador(t2.getNome(), t2.getIdade(), t2.getAltura(), t2.getPeso());
        this.sub = new Jogador(sub.getNome(), sub.getIdade(), sub.getAltura(), sub.getPeso());
    }

    public Time(String nome, Jogador t1, Jogador t2) {
        this.nome = nome;
        this.t1 = new Jogador(t1.getNome(), t1.getIdade(), t1.getAltura(), t1.getPeso());
        this.t2 = new Jogador(t2.getNome(), t2.getIdade(), t2.getAltura(), t2.getPeso());
    }

    public float calcIdadeMedia(){
        int soma = t1.getIdade() + t2.getIdade();
        float media;
        if(sub != null){
            soma = soma + sub.getIdade();
            media = soma / 3;
        } else {
            media = soma/2;
        }
        return media;
    }

    @Override

    public String toString() {
        if(sub == null){
            return "Time{\n" +
                    "nome do time ='" + nome + '\'' +
                    ",\n titular 1 =" + t1.toString() +
                    ",\n titular 2 =" + t2.toString() +
                    '}';
        } else {
            return "Time{\n" +
                    "nome do time ='" + nome + '\'' +
                    ",\n titular 1 =" + t1.toString() +
                    ",\n titular 2 =" + t2.toString() +
                    ",\n substituto =" + sub.toString() +
                    '}';
        }

    }


}
