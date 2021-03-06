package skodb2.db;

import java.sql.Date;

public class Sko {

    private int id;
    private String namn;
    private int pris;
    private int storlek;
    private String färg;
    private int lagerstatus;
    private Date created;
    private Date lastUpdated;

    public String toStringForCustomer(){
        return "namn='" + namn + '\'' +
                ", pris=" + pris +
                ", storlek=" + storlek +
                ", färg='" + färg + '\'' +
                ", lagerstatus=" + lagerstatus;
    }


    @Override
    public String toString() {
        return "Sko{" +
                "id=" + id +
                ", namn='" + namn + '\'' +
                ", pris=" + pris +
                ", storlek=" + storlek +
                ", färg='" + färg + '\'' +
                ", lagerstatus=" + lagerstatus +
                ", created=" + created +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getStorlek() {
        return storlek;
    }

    public void setStorlek(int storlek) {
        this.storlek = storlek;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public int getLagerstatus() {
        return lagerstatus;
    }

    public void setLagerstatus(int lagerstatus) {
        this.lagerstatus = lagerstatus;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
