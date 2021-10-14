/**
 * La clase modela un sencillo pod�metro que registra informaci�n
 * acerca de los pasos, distancia, ..... que una persona
 * ha dado en una semana. 
 * 
 * @author    - pon aqu� tu nombre - 
 */
public class Podometro {
    private final double ZANCADA_HOMBRE = 0.45;
    private final double ZANCADA_MUJER = 0.41;
    private final int SABADO = 6;
    private final int DOMINGO = 7;
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
    private String marca;
    private char sexo;
    private double longitudZancada;
    private double altura;
    private int totalPasosSabado;
    private int totalPasosDomingo;
    private int totalPasosLaborables;
    private double totalDistanciaSemana;
    private double totalDistanciaFinSemana;
    private int caminatasNoche;
    private int tiempo;

    /**
     * Inicializa el pod�metro con la marca indicada por el par�metro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro(String queMarca) {
        marca = queMarca;
        sexo = MUJER;
        longitudZancada = 0;
        altura = 0;
        totalPasosSabado = 0;
        totalPasosDomingo = 0;
        totalPasosLaborables = 0;
        totalDistanciaFinSemana = 0;
        totalDistanciaSemana = 0;
        tiempo = 0;
        caminatasNoche = 0;  

    }

    /**
     * accesor para la marca
     *  
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Simula la configuraci�n del pod�metro.
     * Recibe como par�metros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna adem�s el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {
        sexo = queSexo;
        if (sexo == 'H') {
            longitudZancada = Math.ceil(queAltura * ZANCADA_HOMBRE); 
        }
        else {
            longitudZancada = Math.floor(queAltura * ZANCADA_MUJER);
        }

    }

    /**
     *  Recibe cuatro par�metros que supondremos correctos:
     *    pasos - el n� de pasos caminados
     *    dia - n� de d�a de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - S�bado, 7 - Domingo)
     *    horaInicio � hora de inicio de la caminata
     *    horaFin � hora de fin de la caminata
     *    
     *    A partir de estos par�metros el m�todo debe realizar ciertos c�lculos
     *    y  actualizar� el pod�metro adecuadamente  
     *   
     *   (leer enunciado del ejercicio)
     */
    public void registrarCaminata(int pasos, int dia, int horaInicio,
    int horaFin) {
        tiempo = horaFin - horaInicio;
        switch (dia){
            case 1 : dia = 1;
                    
            case 2 : dia = 2;
                    
            case 3 : dia = 3;
                      
            case 4 : dia = 4;
                            
            case 5 : dia = 5;
                    totalPasosLaborables += pasos;
                    break;         
            case 6 : dia = 6;
                    totalPasosSabado += pasos;
                    break; 
            case 7 : dia = 7;
                    totalPasosDomingo += pasos;
                    break;        
        }
        
        totalDistanciaSemana = totalPasosLaborables * longitudZancada / 100;
        totalDistanciaFinSemana = (totalPasosSabado + totalPasosDomingo)* longitudZancada / 100;
    }

    /**
     * Muestra en pantalla la configuraci�n del pod�metro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {
        System.out.println("Configuraci�n del pod�metro");
        System.out.println("*************************");
        System.out.println();
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo); 
        System.out.println("Longitud zancada: " + longitudZancada); 
    }

    /**
     * Muestra en pantalla informaci�n acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstad�sticas() {
        System.out.println("Estad�sticas");
        System.out.println("*************************");
        System.out.println();
        System.out.println("Distancia recorrida toda la semana: " + totalDistanciaSemana + " km");
        System.out.println("Distancia recorrida fin de semana: " + totalDistanciaFinSemana + " km"); 
        System.out.println();
        System.out.println("N� pasos d�as laborables: " + totalPasosLaborables); 
        System.out.println("N� pasos S�BADO: " + totalPasosSabado); 
        System.out.println("N� pasos DOMINGO: " + totalPasosDomingo); 
        System.out.println();
        System.out.println("N� caminatas realizadas a partir de las 21h.:"  + caminatasNoche);   
        System.out.println();
        System.out.println("Tiempo total caminado en la semana: " + tiempo);
        
    }

    /**
     *  Calcula y devuelve un String que representa el nombre del d�a
     *  en el que se ha caminado m�s pasos - "S�BADO"   "DOMINGO" o  "LABORABLES"
     */
    public  void diaMayorNumeroPasos() {  
        
        
         
    }

    /**
     * Restablecer los valores iniciales del pod�metro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no var�a
     *  
     */    
    public void reset() {
        sexo = MUJER;
        longitudZancada = 0;
        altura = 0;
        totalPasosSabado = 0;
        totalPasosDomingo = 0;
        totalPasosLaborables = 0;
        totalDistanciaFinSemana = 0;
        totalDistanciaSemana = 0;
        tiempo = 0;
        caminatasNoche = 0;
          
    }
}
