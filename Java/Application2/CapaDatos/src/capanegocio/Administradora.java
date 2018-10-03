package capanegocio;
import capadatos.*;

import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.MultipartRequest;
import javax.servlet.http.HttpServletRequest;
/*import javax.servlet.http.HttpServletRequestWrapper;*/

public class Administradora {
    
    public Administradora() {
        super();
    }
    
    public void ConsultarAlicuota(String usuario, String password, String CUIT){
        clsConectWS conex = new clsConectWS(); 
        clsContribuyente cont = new clsContribuyente(); 
        
        conex.setUsuario(usuario);
        conex.setPass(password);
        
        cont.setCUIT(CUIT);
        
        HttpServletRequest svRequest;
        MultipartRequest mpRequest = new MultipartRequest();
        mpRequest.setRequest(request);

        String campoTexto = (String) mpRequest.getParameter("campoform");
        MultipartRequest.File uploadedFile = mpRequest.getFileParameter("form_inputfile");
        
        
    }
    
}
