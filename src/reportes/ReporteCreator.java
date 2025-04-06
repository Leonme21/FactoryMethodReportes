package reportes;

import reportes.base.Reporte;

public abstract class ReporteCreator {
    
    public abstract Reporte crearReporte();

    public void procesar() {
        
        Reporte reporte = crearReporte();
        
        reporte.generar();
        
    }
    
}

