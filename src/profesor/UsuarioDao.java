package profesor;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private static UsuarioDao instance;
    private List<Usuario> usuarios;

    public UsuarioDao() {
        usuarios = new ArrayList<>();
    }
    
    public static UsuarioDao getInstance() {
        if (instance == null) {
            instance = new UsuarioDao();
        }
        return instance;
    }

    
    public int buscar(String usuario){
    for (int i = 0; i < usuarios.size(); i++) {
        if (usuarios.get(i).getUsuario().equals(usuario)) {
            return i; // Retorna el índice del usuario encontrado
        }
    }
    return -1; // Retorna -1 si el usuario no fue encontrado
}

    
//        int n=1;
//        for (int i=0; i < usuarios.size(); i++){
//            if(usuarios.get(i).getUsuario().equals(usuario)){
//                n=i;
//                break;
//            }           
//        }
//        return n;
//    }
    
    public boolean insertar(Usuario usuario){
        if(buscar(usuario.getUsuario())==-1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Usuario usuario){
        if(buscar(usuario.getUsuario())!= -1){
            Usuario usuarioaux=obtener(usuario.getUsuario());
            
            usuarioaux.setContrasena(usuario.getContrasena());
            usuarioaux.setNombres(usuario.getNombres());
            usuarioaux.setApellidos(usuario.getApellidos());
            usuarioaux.setCorreo(usuario.getCorreo());
            return true;
        }else{
            return false;
        }       
    }
    
    public boolean eliminar(String usuario) {
    int indice = buscar(usuario);
    if (indice != -1) {
        usuarios.remove(indice);
        return true;
    } else {
        return false;
    }
}

    
    public Usuario obtener(String usuario){
    int indice = buscar(usuario);
    if (indice != -1 && !usuarios.isEmpty()) {
        return usuarios.get(indice);
    } else {
        return null;
    }
}
 
}
