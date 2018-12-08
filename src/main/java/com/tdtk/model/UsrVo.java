package com.tdtk.model;

public class UsrVo {
    
    private Integer usr_id;
    private String usr_name;
    private Integer prc_id;
    
    private Integer mng_id;
    private String mng_name;
    private String mng_psw;
    
    public UsrVo(){}
    public UsrVo(Integer prc_id,  String mng_name,Integer mng_id) {
        this.prc_id = prc_id;
        this.mng_id = mng_id;
        this.mng_name = mng_name;
    }
    

    public Integer getUsr_id() {
        return usr_id;
    }
    
    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }
    
    public String getUsr_name() {
        return usr_name;
    }
    
    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }
    
    public Integer getPrc_id() {
        return prc_id;
    }
    
    public void setPrc_id(Integer prc_id) {
        this.prc_id = prc_id;
    }
    
    public Integer getMng_id() {
        return mng_id;
    }
    
    public void setMng_id(Integer mng_id) {
        this.mng_id = mng_id;
    }
    
    public String getMng_name() {
        return mng_name;
    }
    
    public void setMng_name(String mng_name) {
        this.mng_name = mng_name;
    }
    
    public String getMng_psw() {
        return mng_psw;
    }
    
    public void setMng_psw(String mng_psw) {
        this.mng_psw = mng_psw;
    }
    
    
    @Override
    public String toString() {
        return "UsrVo{" +
                "usr_id=" + usr_id +
                ", usr_name='" + usr_name + '\'' +
                ", prc_id=" + prc_id +
                ", mng_id=" + mng_id +
                ", mng_name='" + mng_name + '\'' +
                ", mng_psw='" + mng_psw + '\'' +
                '}';
    }
}
