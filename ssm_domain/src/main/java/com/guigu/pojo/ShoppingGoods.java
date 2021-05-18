package com.guigu.pojo;

public class ShoppingGoods extends Z_Goods {
    private Integer Number;

    private Integer gwId;

    private Integer sHId;

    public ShoppingGoods() {
    }

    @Override
    public String toString() {
        return "ShoppingGoods{" +
                "Number=" + Number +
                ", gwId=" + gwId +
                ", sHId=" + sHId +
                '}';
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public Integer getGwId() {
        return gwId;
    }

    public void setGwId(Integer gwId) {
        this.gwId = gwId;
    }

    public Integer getsHId() {
        return sHId;
    }

    public void setsHId(Integer sHId) {
        this.sHId = sHId;
    }

    public ShoppingGoods(Integer number, Integer gwId, Integer sHId) {
        Number = number;
        this.gwId = gwId;
        this.sHId = sHId;
    }
}