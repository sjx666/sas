package cn.bdqn.hello.spring.boot.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "smbms_bill")
public class SmbmsBill {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账单编码
     */
    @Column(name = "billCode")
    private String billcode;

    /**
     * 商品名称
     */
    @Column(name = "productName")
    private String productname;

    /**
     * 商品描述
     */
    @Column(name = "productDesc")
    private String productdesc;

    /**
     * 商品单位
     */
    @Column(name = "productUnit")
    private String productunit;

    /**
     * 商品数量
     */
    @Column(name = "productCount")
    private BigDecimal productcount;

    /**
     * 商品总额
     */
    @Column(name = "totalPrice")
    private BigDecimal totalprice;

    /**
     * 是否支付（1：未支付 2：已支付）
     */
    @Column(name = "isPayment")
    private Integer ispayment;

    /**
     * 创建者（userId）
     */
    @Column(name = "createdBy")
    private Long createdby;

    /**
     * 创建时间
     */
    @Column(name = "creationDate")
    private Date creationdate;

    /**
     * 更新者（userId）
     */
    @Column(name = "modifyBy")
    private Long modifyby;

    /**
     * 更新时间
     */
    @Column(name = "modifyDate")
    private Date modifydate;

    /**
     * 供应商ID
     */
    @Column(name = "providerId")
    private Long providerid;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账单编码
     *
     * @return billCode - 账单编码
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * 设置账单编码
     *
     * @param billcode 账单编码
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    /**
     * 获取商品名称
     *
     * @return productName - 商品名称
     */
    public String getProductname() {
        return productname;
    }

    /**
     * 设置商品名称
     *
     * @param productname 商品名称
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * 获取商品描述
     *
     * @return productDesc - 商品描述
     */
    public String getProductdesc() {
        return productdesc;
    }

    /**
     * 设置商品描述
     *
     * @param productdesc 商品描述
     */
    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    /**
     * 获取商品单位
     *
     * @return productUnit - 商品单位
     */
    public String getProductunit() {
        return productunit;
    }

    /**
     * 设置商品单位
     *
     * @param productunit 商品单位
     */
    public void setProductunit(String productunit) {
        this.productunit = productunit;
    }

    /**
     * 获取商品数量
     *
     * @return productCount - 商品数量
     */
    public BigDecimal getProductcount() {
        return productcount;
    }

    /**
     * 设置商品数量
     *
     * @param productcount 商品数量
     */
    public void setProductcount(BigDecimal productcount) {
        this.productcount = productcount;
    }

    /**
     * 获取商品总额
     *
     * @return totalPrice - 商品总额
     */
    public BigDecimal getTotalprice() {
        return totalprice;
    }

    /**
     * 设置商品总额
     *
     * @param totalprice 商品总额
     */
    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * 获取是否支付（1：未支付 2：已支付）
     *
     * @return isPayment - 是否支付（1：未支付 2：已支付）
     */
    public Integer getIspayment() {
        return ispayment;
    }

    /**
     * 设置是否支付（1：未支付 2：已支付）
     *
     * @param ispayment 是否支付（1：未支付 2：已支付）
     */
    public void setIspayment(Integer ispayment) {
        this.ispayment = ispayment;
    }

    /**
     * 获取创建者（userId）
     *
     * @return createdBy - 创建者（userId）
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * 设置创建者（userId）
     *
     * @param createdby 创建者（userId）
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * 获取创建时间
     *
     * @return creationDate - 创建时间
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * 设置创建时间
     *
     * @param creationdate 创建时间
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * 获取更新者（userId）
     *
     * @return modifyBy - 更新者（userId）
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * 设置更新者（userId）
     *
     * @param modifyby 更新者（userId）
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * 获取更新时间
     *
     * @return modifyDate - 更新时间
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * 设置更新时间
     *
     * @param modifydate 更新时间
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 获取供应商ID
     *
     * @return providerId - 供应商ID
     */
    public Long getProviderid() {
        return providerid;
    }

    /**
     * 设置供应商ID
     *
     * @param providerid 供应商ID
     */
    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }
}