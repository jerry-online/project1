package com.sr;

/**
 * @author jerry
 * @create 2021-04-22 21:05
 */
public class Mymodel {
    private String idno ;
    private String username ;

    public Mymodel() {
    }

    public String getIdno() {
        return idno;
    }

    public String getUsername() {
        return username;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Mymodel{" +
                "idno='" + idno + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
