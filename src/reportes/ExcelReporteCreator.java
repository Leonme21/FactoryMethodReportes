package reportes;

import reportes.base.*;

public class ExcelReporteCreator extends ReporteCreator {
    
    @Override
    
    public Reporte crearReporte() {
        
        return new ExcelReporte();
        
    }
    
}
