package com.james.ssm.po;

import java.util.Date;

public class Watchtask {

    private Integer id;

    private Date watchdate;

    private Integer watchman;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getWatchdate() {
        return watchdate;
    }

    public void setWatchdate(Date watchdate) {
        this.watchdate = watchdate;
    }

    public Integer getWatchman() {
        return watchman;
    }

    public void setWatchman(Integer watchman) {
        this.watchman = watchman;
    }
}