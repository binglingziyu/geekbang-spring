package com.ihubin.geekbangspring.ioc.overview.dependency.domain;

import com.ihubin.geekbangspring.ioc.overview.annotation.Super;

/**
 * 超级用户
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
