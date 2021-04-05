package guru.springframework.sfgdi.datasource;

public class FakeDataSource {

    private String username;
    private String password;
    private String jdbcurl;


    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcurl;
    }

    public void setJdbcUrl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }
}
