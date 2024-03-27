
package Taller;

public class Bicicleta { //ESTA ES LA CLASE TODO
    String marca;
    String modelo;    
    int numeroMarchas;

    public Bicicleta(String marca, String modelo, int numeroMarchas) {
        setMarca(marca);
        setModelo(modelo);
        setNumeroMarchas(numeroMarchas);
    }

    public void MostrarDatos()
    {
        System.out.println("datos de la bicicleta:");
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("numero de marchas: " + getNumeroMarchas());
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

   public class Cuadro { //UN COMPONENTE DE LA CLASE TODO
    
    String color;
    String material;
    int peso;

        public Cuadro(String color, String material, int peso) {
            setColor(color);
            setMaterial(material);
            setPeso(peso);
        }
        public void MostrarDatos()
    {
        System.out.println("datos del cuadro:");
        System.out.println("color: " + getColor());
        System.out.println("material: " + getMaterial());
        System.out.println("peso : " + getPeso());
        
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
 public class Rueda {//UN COMPONENTE DE LA CLASE TODO
    
    double diametro;
    String color;
    String tipoLlanta;

    
        public Rueda(double diametro, String color, String tipoLlanta) {
            setDiametro(diametro);
            setColor(color);
            setTipoLlanta(tipoLlanta);
        }

        public void MostrarDatos()
    {
        System.out.println("datos de la rueda:");
        System.out.println("diametro: " + getDiametro());
        System.out.println("color: " + getColor());
        System.out.println("Tipo de llanta: " + getTipoLlanta());
        
    }
    
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }
    
    
    
}
  

   
    }
    

    

