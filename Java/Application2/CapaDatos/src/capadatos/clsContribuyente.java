package capadatos;

import java.util.Date;

public class clsContribuyente {
    
    private String CUIT;
    private float alicuota;
    private Date vigenciaDesde;
    private Date vigenciaHasta;
    
    public void setCUIT(String CUIT_Cont){
        this.CUIT = CUIT_Cont;
        }
    
    public void setAlicuota (float Alicuota_Cont){
        this.alicuota = Alicuota_Cont;
        }
    
    public void setVigenciaDesde(Date VigenciaD_Cont){
        this.vigenciaDesde = VigenciaD_Cont;
        }
    
    public void setVigenciaHasta(Date VigenciaH_Cont){
        this.vigenciaHasta = VigenciaH_Cont;
    }
    
    public String getCUIT(){
        return this.CUIT;
    }
    public float getAlicuota(){
        return this.alicuota;
    }
    public Date getVigenciaDesde(){
        return this.vigenciaDesde;
    }
    public Date getVigenciaHasta(){
        return this.vigenciaHasta;
    }
    
    public clsContribuyente() {
        super();
    }
}
