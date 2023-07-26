package profesor;




public class UsuarioLogic {
     private static UsuarioDao usuariodao = UsuarioDao.getInstance();
//   private static UsuarioDao usuariodao = new UsuarioDao();
   
    public static boolean autentificar(String usuario, String contrasena){    
        Usuario usuarioConsulta = obtener(usuario);
        if (usuarioConsulta != null && usuarioConsulta.getContrasena().equals(contrasena)) {
            return true;
        } else {
            return false;
        }
    }
   
   public static boolean insertar(Usuario usuario){
       //return usuariodao.insertar(usuario);
    if (usuariodao.buscar(usuario.getUsuario()) == -1) {
        usuariodao.insertar(usuario);
        return true;
    } else {
        return false;
    }
}
          
   public static boolean modificar(Usuario usuario){
       return usuariodao.modificar(usuario);
       
   }
   
   public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario);
   }
   
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario);
       
   }
   
} 


