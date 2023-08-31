import java.math.BigDecimal;
import java.security.InvalidAlgorithmParameterException;
import java.time.LocalDate;
import java.security.InvalidParameterException;

public class Produto {
    private long codigo;
    private String nome;
    private String descricao;
    private BigDecimal precocompra;
    private LocalDate datacompra;
    private LocalDate datavalidade;
    private int situacao;
    private String marca;
    private int quantminima;
    private int quantatual;



    // contrutores

    public Produto(){
    }


    public Produto(long codigo, String nome, String descricao, BigDecimal precocompra, LocalDate datacompra, int situacao, String marca, int quantminima, int quantatual){

    }
 // set e get 


    public void setCodigo(){
        if (codigo > 0){
            throw new IllegalArgumentException();
        } else {
            this.codigo = codigo;
        }
    }

    public long getCodigo(long codigo){
        return codigo;
    }


    public void setNome(){
        this.nome = nome;
    }

    public String getNome(String Nome){
        return nome;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

    public String getDescricao(String descricao){
        return descricao;
    }

    public void precocompra(){
        if(precocompra.compareTo(BigDecimal.ZERO) >= 0){
            this.precocompra = precocompra;
        }else{
            throw new IllegalArgumentException();
    }

    }
    

    public BigDecimal getPrecocompra(){
        return precocompra;
    }

    public void setDatacompra(){
        this.datacompra = LocalDate.now();
    }

    public boole setDatavalidade(){
        LocalDate hoje;
        hoje = LocalDate.now();
        return datavalidade.isBefore(hoje);
    }

    public 

}
