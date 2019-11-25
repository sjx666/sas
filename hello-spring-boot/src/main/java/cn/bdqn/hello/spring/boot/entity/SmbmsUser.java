package cn.bdqn.hello.spring.boot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smbms_user")
public class SmbmsUser {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户编码
     */
    @Column(name = "userCode")
    private String usercode;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private String username;

    /**
     * 用户密码
     */
    @Column(name = "userPassword")
    private String userpassword;

    /**
     * 性别（1:女、 2:男）
     */
    private Integer gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 手机
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户角色（取自角色表-角色id）
     */
    @Column(name = "userRole")
    private Long userrole;

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
     * 图片路径
     */
    @Column(name = "idPicPath")
    private String idpicpath;

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
     * 获取用户编码
     *
     * @return userCode - 用户编码
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * 设置用户编码
     *
     * @param usercode 用户编码
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    /**
     * 获取用户名称
     *
     * @return userName - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return userPassword - 用户密码
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * 设置用户密码
     *
     * @param userpassword 用户密码
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    /**
     * 获取性别（1:女、 2:男）
     *
     * @return gender - 性别（1:女、 2:男）
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别（1:女、 2:男）
     *
     * @param gender 性别（1:女、 2:男）
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取手机
     *
     * @return phone - 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机
     *
     * @param phone 手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取用户角色（取自角色表-角色id）
     *
     * @return userRole - 用户角色（取自角色表-角色id）
     */
    public Long getUserrole() {
        return userrole;
    }

    /**
     * 设置用户角色（取自角色表-角色id）
     *
     * @param userrole 用户角色（取自角色表-角色id）
     */
    public void setUserrole(Long userrole) {
        this.userrole = userrole;
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
     * 获取图片路径
     *
     * @return idPicPath - 图片路径
     */
    public String getIdpicpath() {
        return idpicpath;
    }

    /**
     * 设置图片路径
     *
     * @param idpicpath 图片路径
     */
    public void setIdpicpath(String idpicpath) {
        this.idpicpath = idpicpath;
    }
}