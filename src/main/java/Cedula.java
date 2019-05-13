public class Cedula {

    private int valorDaCedula;
    private int quantidadeDeCedulas;

    public Cedula (int valorDaCedula, int quantidadeDeCedulas){
        this.valorDaCedula = valorDaCedula;
        this.quantidadeDeCedulas = quantidadeDeCedulas;
    }

    public int getValorDaCedula() {
        return valorDaCedula;
    }

    public void setValorDaCedula(int valorDaCedula) {
        this.valorDaCedula = valorDaCedula;
    }

    public int getQuantidadeDeCedulas() {
        return quantidadeDeCedulas;
    }

    public void setQuantidadeDeCedulas(int quantidadeDeCedulas) {
        this.quantidadeDeCedulas = quantidadeDeCedulas;
    }
}
