package cn.bdqn.hello.spring.boot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smbms_address")
public class SmbmsAddress {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 联系人姓名
     */
    private String contact;

    /**
     * 收货地址明细
     */
    @Column(name = "addressDesc")
    private String addressdesc;

    /**
     * 邮编
     */
    @Column(name = "postCode")
    private String postcode;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 创建者
     */
    @Column(name = "createdBy")
    private Long createdby;

    /**
     * 创建时间
     */
    @Column(name = "creationDate")
    private Date creationdate;

    /**
     * 修改者
     */
    @Column(name = "modifyBy")
    private Long modifyby;

    /**
     * 修改时间
     */
    @Column(name = "modifyDate")
    private Date modifydate;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private Long userid;

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
     * 获取联系人姓名
     *
     * @return contact - 联系人姓名
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人姓名
     *
     * @param contact 联系人姓名
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取收货地址明细
     *
     * @return addressDesc - 收货地址明细
     */
    public String getAddressdesc() {
        return addressdesc;
    }

    /**
     * 设置收货地址明细
     *
     * @param addressdesc 收货地址明细
     */
    public void setAddressdesc(String addressdesc) {
        this.addressdesc = addressdesc;
    }

    /**
     * 获取邮编
     *
     * @return postCode - 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编
     *
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取联系人电话
     *
     * @return tel - 联系人电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置联系人电话
     *
     * @param tel 联系人电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取创建者
     *
     * @return createdBy - 创建者
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * 设置创建者
     *
     * @param createdby 创建者
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
     * 获取修改者
     *
     * @return modifyBy - 修改者
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * 设置修改者
     *
     * @param modifyby 修改者
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * 获取修改时间
     *
     * @return modifyDate - 修改时间
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * 设置修改时间
     *
     * @param modifydate 修改时间
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 获取用户ID
     *
     * @return userId - 用户ID
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }
}