public class Horista extends Empregado {
    private int horas;

    public Horista(String nome, String endereco, int horas) {
        super(nome, endereco);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void calcularSalario() {
        salario = horas * 50;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(String.format("TIPO: %-20s", "Horista"));
    }
}
