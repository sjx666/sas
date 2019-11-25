package cn.bdqn.hello.spring.boot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smbms_role")
public class SmbmsRole {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色编码
     */
    @Column(name = "roleCode")
    private String rolecode;

    /**
     * 角色名称
     */
    @Column(name = "roleName")
    private String rolename;

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
     * 获取角色编码
     *
     * @return roleCode - 角色编码
     */
    public String getRolecode() {
        return rolecode;
    }

    /**
     * 设置角色编码
     *
     * @param rolecode 角色编码
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    /**
     * 获取角色名称
     *
     * @return roleName - 角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置角色名称
     *
     * @param rolename 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
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
}