package reportes;

import reportes.base.*;

public class PDFReporteCreator extends ReporteCreator {
    
    @Override
    
    public Reporte crearReporte() {
        
        return new PDFReporte();
        
    }
    
}
