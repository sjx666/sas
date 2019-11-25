package cn.bdqn.hello.spring.boot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smbms_provider")
public class SmbmsProvider {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 供应商编码
     */
    @Column(name = "proCode")
    private String procode;

    /**
     * 供应商名称
     */
    @Column(name = "proName")
    private String proname;

    /**
     * 供应商详细描述
     */
    @Column(name = "proDesc")
    private String prodesc;

    /**
     * 供应商联系人
     */
    @Column(name = "proContact")
    private String procontact;

    /**
     * 联系电话
     */
    @Column(name = "proPhone")
    private String prophone;

    /**
     * 地址
     */
    @Column(name = "proAddress")
    private String proaddress;

    /**
     * 传真
     */
    @Column(name = "proFax")
    private String profax;

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
     * 更新时间
     */
    @Column(name = "modifyDate")
    private Date modifydate;

    /**
     * 更新者（userId）
     */
    @Column(name = "modifyBy")
    private Long modifyby;

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
     * 获取供应商编码
     *
     * @return proCode - 供应商编码
     */
    public String getProcode() {
        return procode;
    }

    /**
     * 设置供应商编码
     *
     * @param procode 供应商编码
     */
    public void setProcode(String procode) {
        this.procode = procode;
    }

    /**
     * 获取供应商名称
     *
     * @return proName - 供应商名称
     */
    public String getProname() {
        return proname;
    }

    /**
     * 设置供应商名称
     *
     * @param proname 供应商名称
     */
    public void setProname(String proname) {
        this.proname = proname;
    }

    /**
     * 获取供应商详细描述
     *
     * @return proDesc - 供应商详细描述
     */
    public String getProdesc() {
        return prodesc;
    }

    /**
     * 设置供应商详细描述
     *
     * @param prodesc 供应商详细描述
     */
    public void setProdesc(String prodesc) {
        this.prodesc = prodesc;
    }

    /**
     * 获取供应商联系人
     *
     * @return proContact - 供应商联系人
     */
    public String getProcontact() {
        return procontact;
    }

    /**
     * 设置供应商联系人
     *
     * @param procontact 供应商联系人
     */
    public void setProcontact(String procontact) {
        this.procontact = procontact;
    }

    /**
     * 获取联系电话
     *
     * @return proPhone - 联系电话
     */
    public String getProphone() {
        return prophone;
    }

    /**
     * 设置联系电话
     *
     * @param prophone 联系电话
     */
    public void setProphone(String prophone) {
        this.prophone = prophone;
    }

    /**
     * 获取地址
     *
     * @return proAddress - 地址
     */
    public String getProaddress() {
        return proaddress;
    }

    /**
     * 设置地址
     *
     * @param proaddress 地址
     */
    public void setProaddress(String proaddress) {
        this.proaddress = proaddress;
    }

    /**
     * 获取传真
     *
     * @return proFax - 传真
     */
    public String getProfax() {
        return profax;
    }

    /**
     * 设置传真
     *
     * @param profax 传真
     */
    public void setProfax(String profax) {
        this.profax = profax;
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
}