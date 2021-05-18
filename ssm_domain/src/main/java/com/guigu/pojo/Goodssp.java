package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

public class Goodssp {
    private Integer spId;

    private Integer spTypeId;

    private String goodsName;

    private String price;

    private Integer sl;

    private String purchasePrice;

    private String color;

    private String size;

    private Date thTime;

    private Date ysTime;

    private String cpAdress;

    private String gysId;

    private String guiGe;

    private String spStat;

    private Integer sHId;

    private String img;

    private Integer gwId;

    private Integer gwStat;

    public Goodssp() {
    }

    @Override
    public String toString() {
        return "Goodssp{" +
                "spId=" + spId +
                ", spTypeId=" + spTypeId +
                ", goodsName='" + goodsName + '\'' +
                ", price='" + price + '\'' +
                ", sl=" + sl +
                ", purchasePrice='" + purchasePrice + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", thTime=" + thTime +
                ", ysTime=" + ysTime +
                ", cpAdress='" + cpAdress + '\'' +
                ", gysId='" + gysId + '\'' +
                ", guiGe='" + guiGe + '\'' +
                ", spStat='" + spStat + '\'' +
                ", sHId=" + sHId +
                ", img='" + img + '\'' +
                ", gwId=" + gwId +
                ", gwStat=" + gwStat +
                '}';
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSpTypeId() {
        return spTypeId;
    }

    public void setSpTypeId(Integer spTypeId) {
        this.spTypeId = spTypeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getThTime() {
        return thTime;
    }

    public void setThTime(Date thTime) {
        this.thTime = thTime;
    }

    public Date getYsTime() {
        return ysTime;
    }

    public void setYsTime(Date ysTime) {
        this.ysTime = ysTime;
    }

    public String getCpAdress() {
        return cpAdress;
    }

    public void setCpAdress(String cpAdress) {
        this.cpAdress = cpAdress;
    }

    public String getGysId() {
        return gysId;
    }

    public void setGysId(String gysId) {
        this.gysId = gysId;
    }

    public String getGuiGe() {
        return guiGe;
    }

    public void setGuiGe(String guiGe) {
        this.guiGe = guiGe;
    }

    public String getSpStat() {
        return spStat;
    }

    public void setSpStat(String spStat) {
        this.spStat = spStat;
    }

    public Integer getsHId() {
        return sHId;
    }

    public void setsHId(Integer sHId) {
        this.sHId = sHId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getGwId() {
        return gwId;
    }

    public void setGwId(Integer gwId) {
        this.gwId = gwId;
    }

    public Integer getGwStat() {
        return gwStat;
    }

    public void setGwStat(Integer gwStat) {
        this.gwStat = gwStat;
    }

    public Goodssp(Integer spId, Integer spTypeId, String goodsName, String price, Integer sl, String purchasePrice, String color, String size, Date thTime, Date ysTime, String cpAdress, String gysId, String guiGe, String spStat, Integer sHId, String img, Integer gwId, Integer gwStat) {
        this.spId = spId;
        this.spTypeId = spTypeId;
        this.goodsName = goodsName;
        this.price = price;
        this.sl = sl;
        this.purchasePrice = purchasePrice;
        this.color = color;
        this.size = size;
        this.thTime = thTime;
        this.ysTime = ysTime;
        this.cpAdress = cpAdress;
        this.gysId = gysId;
        this.guiGe = guiGe;
        this.spStat = spStat;
        this.sHId = sHId;
        this.img = img;
        this.gwId = gwId;
        this.gwStat = gwStat;
    }
}