/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pasmo
 */
@Entity
@Table(name = "deliverables", catalog = "bid_plan2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deliverables.findAll", query = "SELECT d FROM Deliverables d"),
    @NamedQuery(name = "Deliverables.findByDID", query = "SELECT d FROM Deliverables d WHERE d.dID = :dID"),
    @NamedQuery(name = "Deiveables.findByTid", query = "SELECT d FROM Deliverables d WHERE d.conTid = :conTid"),
    @NamedQuery(name = "Deliverables.findByOwner", query = "SELECT d FROM Deliverables d WHERE d.owner = :owner"),
    @NamedQuery(name = "Deliverables.findByDeliverable", query = "SELECT d FROM Deliverables d WHERE d.deliverable = :deliverable"),
    @NamedQuery(name = "Deliverables.findByDescreption", query = "SELECT d FROM Deliverables d WHERE d.descreption = :descreption"),
    @NamedQuery(name = "Deliverables.findByDstart", query = "SELECT d FROM Deliverables d WHERE d.dstart = :dstart"),
    @NamedQuery(name = "Deliverables.findByDend", query = "SELECT d FROM Deliverables d WHERE d.dend = :dend"),
    @NamedQuery(name = "Deliverables.findByDstatus", query = "SELECT d FROM Deliverables d WHERE d.dstatus = :dstatus")})
public class Deliverables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dID", nullable = false)
    private Integer dID;
    @Basic(optional = false)
    @Column(name = "owner", nullable = false, length = 45)
    private String owner;
    @Basic(optional = false)
    @Column(name = "deliverable", nullable = false, length = 45)
    private String deliverable;
    @Column(name = "descreption", length = 255)
    private String descreption;
    @Column(name = "dstart")
    @Temporal(TemporalType.DATE)
    private Date dstart;
    @Column(name = "dend")
    @Temporal(TemporalType.DATE)
    private Date dend;
    @Column(name = "dstatus", length = 45)
    private String dstatus;
    @JoinColumn(name = "conTid", referencedColumnName = "tid", nullable = false)
    @ManyToOne(optional = false)
    private Tickets conTid;

    public Deliverables() {
    }

    public Deliverables(Integer dID) {
        this.dID = dID;
    }

    public Deliverables(Integer dID, String owner, String deliverable) {
        this.dID = dID;
        this.owner = owner;
        this.deliverable = deliverable;
    }

    public Integer getDID() {
        return dID;
    }

    public void setDID(Integer dID) {
        this.dID = dID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDeliverable() {
        return deliverable;
    }

    public void setDeliverable(String deliverable) {
        this.deliverable = deliverable;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public Date getDstart() {
        return dstart;
    }

    public void setDstart(Date dstart) {
        this.dstart = dstart;
    }

    public Date getDend() {
        return dend;
    }

    public void setDend(Date dend) {
        this.dend = dend;
    }

    public String getDstatus() {
        return dstatus;
    }

    public void setDstatus(String dstatus) {
        this.dstatus = dstatus;
    }

    public Tickets getConTid() {
        return conTid;
    }

    public void setConTid(Tickets conTid) {
        this.conTid = conTid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dID != null ? dID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deliverables)) {
            return false;
        }
        Deliverables other = (Deliverables) object;
        if ((this.dID == null && other.dID != null) || (this.dID != null && !this.dID.equals(other.dID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.bid.web.entity.Deliverables[ dID=" + dID + " ]";
    }
    
}
