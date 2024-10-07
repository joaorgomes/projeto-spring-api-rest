package spring.project_web_api.repository;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import spring.project_web_api.handler.BusinessException;
import spring.project_web_api.handler.CampoObrigatorioException;
import spring.project_web_api.model.Usuario;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getLoguin() == null){
            throw new CampoObrigatorioException("loguin");
        }
        if(usuario.getPassword() == null){
            throw new CampoObrigatorioException("password");
        }
        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void deleById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findtAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }

    public Usuario finByUserName(String userName){
        System.out.println(String.format("FIND/userName - Recebendo o username :%s para localizar um usuário", userName));
        return new Usuario("gleyson","password");
    }


}
