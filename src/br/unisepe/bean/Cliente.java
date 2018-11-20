package br.unisepe.bean;
public class Cliente { //Váriaveis
    String nome, genero;
    float peso, altura, imc;
    String imc_texto;
    
    public void avaliaImc() {//cálculo imc
        float limite = 25.3f;
        if (this.imc < 18.5)
            this.imc_texto = "Magro(a)"+ "\n" + "\n" + "Dica: Seu IMC está abaixo do normal, "
                    + "\n" + "procure um nutricionista para " + "\n" + "regularizar sua alimentação.";// resultado se menor que o ideal
        if (this.genero.equals("Homem")){// genero do usuario
            limite = 26.11f;
        }
        if ((this.imc >= 18.5) && (this.imc <= limite)) 
            this.imc_texto = "Normal";// resultado ideal
        if (this.imc > limite)
            this.imc_texto = "Acima do Peso" + "\n" + "\n" + "Dica: Seu IMC está acima do normal, "
                    + "\n" + "procure praticar exercicíos e " + "\n" + "regularizar sua alimentação.";// resultado acima do ideal
    }
        
    public Cliente (String nome, String genero, float altura, float peso) { // envia dados para classe telaimc
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.imc = peso / (altura * altura);
        this.avaliaImc();
    }
    public String getImc_texto() { //get and setters
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
