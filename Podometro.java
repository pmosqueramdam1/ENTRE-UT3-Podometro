/**
 * La clase modela un sencillo podómetro que registra información
 * acerca de los pasos, distancia, ..... que una persona
 * ha dado en una semana. 
 * 
 * @author    - pon aquí tu nombre - 
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
    private int totalDistanciaSemana;
    private int totalDistanciaFinSemana;
    private int caminatasNoche;
    private int tiempo;

    /**
     * Inicializa el podómetro con la marca indicada por el parámetro.
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
     * Simula la configuración del podómetro.
     * Recibe como parámetros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna además el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {
        sexo = queSexo;

        if (sexo == 'H') {
            altura = Math.ceil(queAltura * ZANCADA_HOMBRE); 
        }
        else {
            altura = Math.floor(queAltura * ZANCADA_MUJER);
        }

    }

    /**
     *  Recibe cuatro parámetros que supondremos correctos:
     *    pasos - el nº de pasos caminados
     *    dia - nº de día de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - Sábado, 7 - Domingo)
     *    horaInicio – hora de inicio de la caminata
     *    horaFin – hora de fin de la caminata
     *    
     *    A partir de estos parámetros el método debe realizar ciertos cálculos
     *    y  actualizará el podómetro adecuadamente  
     *   
     *   (leer enunciado del ejercicio)
     */
    public void registrarCaminata(int pasos, int dia, int horaInicio,
    int horaFin) {
        tiempo = horaFin - horaInicio;
        tiempo = tiempo / 100;
        switch (dia){
            case 1 : dia = 1;
                    totalPasosLaborables += pasos;
                    break;
            case 2 : dia = 2;
                    totalPasosLaborables += pasos;
                     break;
            case 3 : dia = 3;
                    totalPasosLaborables += pasos;
                    break;  
            case 4 : dia = 4;
                    totalPasosLaborables += pasos;
                    break;         
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
        totalDistanciaSemana = totalPasosLaborables;
        totalDistanciaFinSemana = totalPasosSabado + totalPasosDomingo;
    }

    /**
     * Muestra en pantalla la configuración del podómetro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {

    }

    /**
     * Muestra en pantalla información acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstadísticas() {

    }

    /**
     *  Calcula y devuelve un String que representa el nombre del día
     *  en el que se ha caminado más pasos - "SÁBADO"   "DOMINGO" o  "LABORABLES"
     */
    public int diaMayorNumeroPasos() {
        return totalPasosDomingo;
    }

    /**
     * Restablecer los valores iniciales del podómetro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no varía
     *  
     */    
    public void reset() {

    }
}
