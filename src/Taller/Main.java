
package Taller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Que programa desea ejecutar?");
        System.out.println("1. Programa de Bicicleta");
        System.out.println("2. Programa de Cuerpo Humano");
        
        int opcion = lectura.nextInt();
        lectura.nextLine(); 
        
        switch (opcion) {
            case 1:
                System.out.println("Ha elegido el programa de Bicicleta:");
                System.out.println();
                System.out.println("Desea agregar una bicicleta personalizada?");
                String opcionBicicleta = lectura.nextLine();
                
                if (opcionBicicleta.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la marca de la bicicleta:");
                    String marca = lectura.nextLine();
                    
                    System.out.println("Ingrese el modelo de la bicicleta:");
                    String modelo = lectura.nextLine();
                    
                    System.out.println("De cuantas marchas desea la bicicleta?");
                    int marchas = lectura.nextInt();
                    lectura.nextLine(); 
                    
                    Bicicleta bici1 = new Bicicleta(marca, modelo, marchas);
                    bici1.MostrarDatos();
                    
                    System.out.println();
                    
                    System.out.println("¿Desea agregar un cuadro personalizado?");
                    String opcionCuadro = lectura.nextLine();
                    
                    if (opcionCuadro.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese el color: ");
                        String color = lectura.nextLine();
                        
                        System.out.println("Ingrese el material: ");
                        String material = lectura.nextLine();
                        
                        System.out.println("Ingrese el peso: ");
                        int peso = lectura.nextInt();
                        lectura.nextLine(); 
                        
                        Bicicleta.Cuadro cuadro1 = bici1.new Cuadro(color, material, peso);
                        cuadro1.MostrarDatos();
                        
                        System.out.println();
                        
                        System.out.println("Desea agregar unas llantas personalizadas?");
                        String opcionLlantas = lectura.nextLine();
                        
                        if (opcionLlantas.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el diámetro: ");
                            int diametro = lectura.nextInt();
                            lectura.nextLine(); 
                            
                            System.out.println("Ingrese el color de las llantas: ");
                            String colorLlantas = lectura.nextLine();
                            
                            System.out.println("Ingrese el tipo de llanta: ");
                            String tipoLlantas = lectura.nextLine();
                            
                            Bicicleta.Rueda rueda1 = bici1.new Rueda(diametro, colorLlantas, tipoLlantas);
                            rueda1.MostrarDatos();
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Ha elegido el programa de Cuerpo Humano.");
                System.out.println("Ingrese los datos del cuerpo humano:");
        System.out.print("Tipo de sangre: ");
        String tipoSangre = lectura.nextLine();
        System.out.print("Tono de piel: ");
        String tonoPiel = lectura.nextLine();
        System.out.print("Sexo: ");
        String sexo = lectura.nextLine();

        // Crear instancia de CuerpoHumano
        cuerpoHumano humano = new cuerpoHumano(tipoSangre, tonoPiel, sexo);
        humano.mostrardatoshuman();

        // Solicitar datos del pulmón
        System.out.println("\nIngrese los datos del pulmón:");
        System.out.print("Tamaño del pulmon: ");
        int capacidadPulmonar = lectura.nextInt();
        System.out.print("Volumen corriente: ");
        int volumenCorriente = lectura.nextInt();
        System.out.print("Elasticidad pulmonar: ");
        int elasticidadPulmonar = lectura.nextInt();

        // Crear instancia de Pulmon
        cuerpoHumano.Pulmon pulmon = humano.new Pulmon(capacidadPulmonar, volumenCorriente, elasticidadPulmonar);
        pulmon.mostrardatospulmon();

        // Solicitar datos del hígado
        System.out.println("\nIngrese los datos del higado:");
        System.out.print("Tamaño del higado: ");
        int tamanoHigado = lectura.nextInt();
        System.out.print("Peso del hígado: ");
        int pesoHigado = lectura.nextInt();
        System.out.print("Cantidad de enzimas: ");
        int enzimas = lectura.nextInt();

        // Crear instancia de Higado
        cuerpoHumano.Higado higado = humano.new Higado(tamanoHigado, pesoHigado, enzimas);
        higado.mostrardatoshigado();

        // Solicitar datos del corazón
        System.out.println("\nIngrese los datos del corazón:");
        System.out.print("Frecuencia cardíaca: ");
        int frecuenciaCardiaca = lectura.nextInt();
        System.out.print("Presión sanguínea: ");
        int presionSanguinea = lectura.nextInt();
        System.out.print("Ritmo cardíaco: ");
        int ritmoCardiaco = lectura.nextInt();

        // Crear instancia de Corazon
        cuerpoHumano.Corazon corazon = humano.new Corazon(frecuenciaCardiaca, presionSanguinea, ritmoCardiaco);
        corazon.mostrardatoscorazon();

        // Solicitar datos del apéndice
        System.out.println("\nIngrese los datos del apéndice:");
        System.out.print("Tamaño del apéndice: ");
        int tamanoApendice = lectura.nextInt();
        System.out.print("Peso del apéndice: ");
        int pesoApendice = lectura.nextInt();
        lectura.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("Estado de salud del apéndice: ");
        String saludApendice = lectura.nextLine();

        // Crear instancia de Apendice
        cuerpoHumano.Apendice apendice = humano.new Apendice(tamanoApendice, pesoApendice, saludApendice);
        apendice.mostrardatospandice();

        // Cerrar el Scanner
        lectura.close();
                break;
            default:
                System.out.println("Opcion no válida.");
        }
    }
}
