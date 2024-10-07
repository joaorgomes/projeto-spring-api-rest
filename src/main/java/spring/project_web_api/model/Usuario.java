package spring.project_web_api.model;

public class Usuario {
    private Integer id;
    private String loguin;
    private String password;


    public Usuario(){}

    public Usuario(String loguin, String password) {
        this.loguin = loguin;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "loguin='" + loguin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
