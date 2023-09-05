import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Produto {

    private long codigo;
    private String nome;
    private String descricao;
    private String marca;
    private BigDecimal precoCompra; // null
    private LocalDate dataCompra;
    private LocalDate dataValidade;
    private int quantMinima;
    private int quantAtual;
    private int situacao;

    public Produto() {
        codigo = 0L;
        nome = "sem nome";
        descricao = "sem descricao";
        marca = "sem marca";
        precoCompra = BigDecimal.ZERO; // new BigDecimal(0);
        dataCompra = LocalDate.now();
        dataValidade = LocalDate.now();
        quantMinima = quantAtual = 0;
        situacao = 0;
    }

    public Produto(long codigo, String nome, String descricao, String marca, BigDecimal precoCompra,
            LocalDate dataCompra, LocalDate dataValidade, int quantMinima, int quantAtual, int situacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.precoCompra = precoCompra;
        this.dataCompra = dataCompra;
        this.dataValidade = dataValidade;
        this.quantMinima = quantMinima;
        this.quantAtual = quantAtual;
        this.situacao = situacao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQuantMinima() {
        return quantMinima;
    }

    public void setQuantMinima(int quantMinima) {
        this.quantMinima = quantMinima;
    }

    public int getQuantAtual() {
        return quantAtual;
    }

    public void setQuantAtual(int quantAtual) {
        this.quantAtual = quantAtual;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public boolean isEmFalta() {
        return quantAtual < quantMinima;
    }

    public boolean isVencido() {
        return LocalDate.now().isAfter(dataValidade);
    }

    public Produto obteProduto() {
        Produto novo = new Produto();
        Scanner s = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite o codigo: ");
        novo.setCodigo(Long.parseLong(s.nextLine()));
        System.out.print("Digite o nome: ");
        novo.setNome(s.nextLine());
        System.out.print("Digite a descricao: ");
        novo.setDescricao(s.nextLine());
        System.out.print("Digite a marca: ");
        novo.setMarca(s.nextLine());
        System.out.print("Digite o preco de compra: ");
        novo.setPrecoCompra(new BigDecimal(s.nextLine()));
        System.out.print("Digite a data da compra (DD/MM/AAAA): ");
        novo.setDataCompra(LocalDate.parse(s.nextLine(), dtf));
        System.out.print("Digite a data de validade (DD/MM/AAAA): ");
        novo.setDataValidade(LocalDate.parse(s.nextLine(), dtf));
        System.out.print("Quantidade minima: ");
        novo.setQuantMinima(Integer.parseInt(s.nextLine()));
        System.out.print("Quantidade atual: ");
        novo.setQuantAtual(Integer.parseInt(s.nextLine()));
        System.out.print("Situacao: ");
        novo.setSituacao(Integer.parseInt(s.nextLine()));
        s.close();
        return novo;
    }

    public void mostrar() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Marca: " + marca);
        System.out.println("Preco de compra: " + precoCompra);
        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("Quantidade minima: " + quantMinima);
        System.out.println("Quantidade atual: " + quantAtual);
        System.out.println("Situacao: " + situacao);
    }

}