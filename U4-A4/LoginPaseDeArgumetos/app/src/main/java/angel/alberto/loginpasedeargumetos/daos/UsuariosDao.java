package angel.alberto.loginpasedeargumetos.daos;

import java.util.HashSet;
import java.util.Set;

import angel.alberto.loginpasedeargumetos.models.Usuario;

public class UsuariosDao {
    private Set<Usuario> listaUsuariosDao;

    public UsuariosDao() {
        listaUsuariosDao = new HashSet<>();
    }

    public Set<Usuario> listaUs(){
        listaUsuariosDao.add(new Usuario("Betoneytor", "12345", "Alberto Angel","Aguado Reyes",
                                         "S15120071","Sistemas","7"));
        listaUsuariosDao.add(new Usuario("B", "B", "Aquiles","Voy",
                                         "S15120033","Sistemas","12"));
        listaUsuariosDao.add(new Usuario("Mandil", "ON", "Armando","XD",
                                         "S15120000","Gastronomia","3"));


        return listaUsuariosDao;
    }

    public  Usuario usuarioExist(final Usuario usAValidar){
        listaUsuariosDao=listaUs();
       // listaUsuariosDao.stream().anyMatch(usr -> usr.getUsuario().equals(usAValidar.getUsuario()));
        for (Usuario usr:listaUsuariosDao) {
            if (usr.getUsuario().equals(usAValidar.getUsuario()) &&
                    usr.getPassword().equals(usAValidar.getPassword()) ){
                return usr;

            }
        }
        return null;
        //boolean rex=listaUsuariosDao.contains(usAValidar);
        //return rex;
    }
}
