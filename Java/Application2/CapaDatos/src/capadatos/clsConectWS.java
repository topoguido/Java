package capadatos;


public class clsConectWS {
    
    private String usuario;
    private String pass;
    private String pathWS;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPathWS(String pathWS) {
        this.pathWS = pathWS;
    }

    public String getPathWS() {
        return pathWS;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getPathFile() {
        return pathFile;
    }
    private String pathFile;
    
    
    
    public clsConectWS() {
        super();
        this.pathWS = "https: //dfe.test.arba.gov.ar/DomicilioElectronico/SeguridadCliente/dfeServicioConsulta.do";
        
    }
}
