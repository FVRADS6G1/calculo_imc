package br.unisepe.bean;
public class Cliente {
    String nome, genero;
    float peso, altura, imc;
    String imc_texto;
    
    public void avaliaImc() {
        float limite = 25.3f;
        if (this.imc < 18.5)
            this.imc_texto = "Magro(a)";
        if (this.genero.equals("Homem")){
            limite = 26.11f;
        }
        if ((this.imc >= 18.5) && (this.imc <= limite)) 
            this.imc_texto = "Normal";
        if (this.imc > limite)
            this.imc_texto = "Acima do peso";
    }
        
    public Cliente (String nome, String genero, float altura, float peso) {
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.imc = peso / (altura * altura);
        this.avaliaImc();
    }
    public String getImc_texto() {
        return imc_texto;
    }
    
    public String getNome() {
        return nome;
    }
    public float getPeso() {
        return peso;
    }
    public float getAltura() {
        return altura;
    }
    public String getGenero() {
        return genero;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
