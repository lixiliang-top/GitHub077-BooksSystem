package cn.kgc.ssm.pojo;

import java.util.Date;

public class Books {
    private Integer bookid;

    private String bookcode;

    private String bookname;

    private Integer booktype;

    private String bookatuthor;

    private String publishpress;

    private Date publishdate;

    private Integer isborrow;

    private String createdby;

    private Date creationtime;

    private Date lastupdatetime;

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookcode='" + bookcode + '\'' +
                ", bookname='" + bookname + '\'' +
                ", booktype=" + booktype +
                ", bookatuthor='" + bookatuthor + '\'' +
                ", publishpress='" + publishpress + '\'' +
                ", publishdate=" + publishdate +
                ", isborrow=" + isborrow +
                ", createdby='" + createdby + '\'' +
                ", creationtime=" + creationtime +
                ", lastupdatetime=" + lastupdatetime +
                '}';
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode == null ? null : bookcode.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

    public String getBookatuthor() {
        return bookatuthor;
    }

    public void setBookatuthor(String bookatuthor) {
        this.bookatuthor = bookatuthor == null ? null : bookatuthor.trim();
    }

    public String getPublishpress() {
        return publishpress;
    }

    public void setPublishpress(String publishpress) {
        this.publishpress = publishpress == null ? null : publishpress.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Integer getIsborrow() {
        return isborrow;
    }

    public void setIsborrow(Integer isborrow) {
        this.isborrow = isborrow;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}