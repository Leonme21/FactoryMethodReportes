package reportes;

public class App {
    
    public static void main(String[] args) {
        
        ReporteCreator creador;

        creador = new PDFReporteCreator();
        creador.procesar();

        creador = new ExcelReporteCreator();
        creador.procesar();

        creador = new HTMLReporteCreator();
        creador.procesar();
    }
}
