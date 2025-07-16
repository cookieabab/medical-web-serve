package com.company.medical.domain;

import com.company.medical.domain.superdomain.SuperDomain;

public class Meta extends SuperDomain {
    private String title;//菜单title

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}