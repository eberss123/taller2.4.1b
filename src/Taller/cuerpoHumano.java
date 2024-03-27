
package Taller;


public class cuerpoHumano {
     String tipoSangre;
   String tonoPiel;
   String sexo;

    public cuerpoHumano(String tipoSangre, String tonoPiel, String sexo) {
        setTipoSangre(tipoSangre);
        setTonoPiel(tonoPiel);
        setSexo(sexo);
    }
   
  public void mostrardatoshuman(){
       System.out.println("\nDatos del cuerpo humano:");
                System.out.println("Tipo de sangre: " + getTipoSangre());
                System.out.println("Tono de piel: " +  getTonoPiel());
                System.out.println("Sexo: " + getSexo());
                
                
                
  }
              
    public  String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTonoPiel() {
        return tonoPiel;
    }

    public void setTonoPiel(String tonoPiel) {
        this.tonoPiel = tonoPiel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public class Pulmon {
        
    int capacidadPulmonar;
    int volumenCorriente;
    int elasticidadPulmonar;

    public void mostrardatospulmon()
    {
        System.out.println("\nDatos del pulmón:");
                System.out.println("Tamaño: " + getCapacidadPulmonar());
                System.out.println("Peso: " + getVolumenCorriente());
                System.out.println("Elasticidad: " + getElasticidadPulmonar());
    }
        public Pulmon(int capacidadPulmonar, int volumenCorriente, int elasticidadPulmonar) {
            setCapacidadPulmonar(capacidadPulmonar);
            setVolumenCorriente(volumenCorriente);
            setElasticidadPulmonar(elasticidadPulmonar);
        }
    
    

    public int getCapacidadPulmonar() {
        return capacidadPulmonar;
    }

    public void setCapacidadPulmonar(int capacidadPulmonar) {
        this.capacidadPulmonar = capacidadPulmonar;
    }

    public int getVolumenCorriente() {
        return volumenCorriente;
    }

    public void setVolumenCorriente(int volumenCorriente) {
        this.volumenCorriente = volumenCorriente;
    }

    public int getElasticidadPulmonar() {
        return elasticidadPulmonar;
    }

    public void setElasticidadPulmonar(int elasticidadPulmonar) {
        this.elasticidadPulmonar = elasticidadPulmonar;
    }
    
    
}

    public class Higado {
    int tamano;
    int peso;
    int enzimas;

    
    public void mostrardatoshigado(){
         System.out.println("\nDatos del hígado:");
                System.out.println("Tamaño: " + getTamano());
                System.out.println("Peso: " + getPeso());
                System.out.println("Enzimas: " + getEnzimas());
    }
        public Higado(int tamano, int peso, int enzimas) {
            setTamano(tamano);
            setPeso(peso);
            setEnzimas(enzimas);
        }

    
    
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEnzimas() {
        return enzimas;
    }

    public void setEnzimas(int enzimas) {
        this.enzimas = enzimas;
    }
    
    
    
}

    public class Corazon {
    int frecuenciaCardiaca;
    int presionSanguinea;
    int ritmoCardiaco;

        public Corazon(int frecuenciaCardiaca, int presionSanguinea, int ritmoCardiaco) {
            setFrecuenciaCardiaca(frecuenciaCardiaca);
            setPresionSanguinea(presionSanguinea);
            setRitmoCardiaco(ritmoCardiaco);
            
        }
    
    
    public void mostrardatoscorazon()
    {
        System.out.println("\nDatos del corazón:");
                System.out.println("Frecuencia cardiaca: " + getFrecuenciaCardiaca());
                System.out.println("Presión sanguínea: " + getPresionSanguinea());
                System.out.println("Ritmo cardiaco: " + getRitmoCardiaco());
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getPresionSanguinea() {
        return presionSanguinea;
    }

    public void setPresionSanguinea(int presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
    
    
}

    public class Apendice {
     int tamano;
    int peso;
    String salud;
    

    public Apendice(int tamano, int peso, String salud) {
        setTamano(tamano);
        setPeso(peso);
        setSalud(salud);
    }
    
    public void mostrardatospandice()
    {
        System.out.println("\nDatos del apéndice:");
                System.out.println("Tamaño: " + getTamano());
                System.out.println("Peso: " + getPeso());
                System.out.println("Estado de salud: " + getSalud());
    }
    
    

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }
    
    
}

    
    
}

