package reportes;

import reportes.base.*;

public class HTMLReporteCreator extends ReporteCreator {
    
    @Override
    
    public Reporte crearReporte() {
        
        return new HTMLReporte();
        
    }
    
}
