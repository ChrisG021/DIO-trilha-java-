package api.spring_api_swagger.model;

public class User {
    private Integer id;
    private String name;
    private String login;
    private String password;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", login=" + login + ", password=" + password + "]";
    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
