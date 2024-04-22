package classes;

import java.util.ArrayList;

public class Dados {
    // declaração do ArrayList - sintaxe
   // ArrayList<tipo de dados>  nome_vetor = new ArrayList<>();
    
 //declarando o ArrayList vet_dados com os dados da classe Servicos_campos
static ArrayList<Dados> vet_dados = new ArrayList<Dados>();

// atributos ou variaveis de instancias
private int cod;   // codigo produto
private double preco; // preço produto
private int estoque; // qtd estoque
private String descricao;  
private String tipo;  // tipo produto

//metodos getters e setters
    public int getCod() {
        return cod;
    }

    public void setCod (int cod) {
        this.cod = cod;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
    
}
