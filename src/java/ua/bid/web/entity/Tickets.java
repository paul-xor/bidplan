/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pasmo
 */
@Entity
@Table(name = "tickets", catalog = "bid_plan2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"tid"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tickets.findAll", query = "SELECT t FROM Tickets t"),
    @NamedQuery(name = "Tickets.findById", query = "SELECT t FROM Tickets t WHERE t.id = :id"),
    @NamedQuery(name = "Tickets.findByTid", query = "SELECT t FROM Tickets t WHERE t.tid = :tid"),
    @NamedQuery(name = "Tickets.findByOmid", query = "SELECT t FROM Tickets t WHERE t.omid = :omid"),
    @NamedQuery(name = "Tickets.findByOpportunity", query = "SELECT t FROM Tickets t WHERE t.opportunity = :opportunity"),
    @NamedQuery(name = "Tickets.findByCustomer", query = "SELECT t FROM Tickets t WHERE t.customer = :customer"),
    @NamedQuery(name = "Tickets.findByCountry", query = "SELECT t FROM Tickets t WHERE t.country = :country"),
    @NamedQuery(name = "Tickets.findByContact", query = "SELECT t FROM Tickets t WHERE t.contact = :contact"),
    @NamedQuery(name = "Tickets.findByCaseOwner", query = "SELECT t FROM Tickets t WHERE t.caseOwner = :caseOwner"),
    @NamedQuery(name = "Tickets.findByStatus", query = "SELECT t FROM Tickets t WHERE t.status = :status"),
    @NamedQuery(name = "Tickets.findByStart", query = "SELECT t FROM Tickets t WHERE t.start = :start"),
    @NamedQuery(name = "Tickets.findByEnd", query = "SELECT t FROM Tickets t WHERE t.end = :end")})
public class Tickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tid", nullable = false, length = 15)
    private String tid;
    @Basic(optional = false)
    @Column(name = "omid", nullable = false, length = 8)
    private String omid;
    @Basic(optional = false)
    @Column(name = "opportunity", nullable = false, length = 45)
    private String opportunity;
    @Basic(optional = false)
    @Column(name = "customer", nullable = false, length = 45)
    private String customer;
    @Basic(optional = false)
    @Column(name = "country", nullable = false, length = 45)
    private String country;
    @Basic(optional = false)
    @Column(name = "contact", nullable = false, length = 45)
    private String contact;
    @Basic(optional = false)
    @Column(name = "caseOwner", nullable = false, length = 45)
    private String caseOwner;
    @Basic(optional = false)
    @Column(name = "status", nullable = false, length = 10)
    private String status;
    @Basic(optional = false)
    @Column(name = "start", nullable = false, length = 10)
    private String start;
    @Basic(optional = false)
    @Column(name = "end", nullable = false, length = 10)
    private String end;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conTid")
    private Set<Deliverables> deliverablesSet;

    public Tickets() {
    }
    
    /*
    public Tickets(Integer id) {
        this.id = id;
    }
    */
    
    public Tickets(String tid, String omid, String opportunity, String customer, String country, String contact, String caseOwner, String start, String end, String status) {
        
        this.tid = tid;
        this.omid = omid;
        this.opportunity = opportunity;
        this.customer = customer;
        this.country = country;
        this.contact = contact;
        this.caseOwner = caseOwner;
        this.start = start;
        this.end = end;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getOmid() {
        return omid;
    }

    public void setOmid(String omid) {
        this.omid = omid;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCaseOwner() {
        return caseOwner;
    }

    public void setCaseOwner(String caseOwner) {
        this.caseOwner = caseOwner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @XmlTransient
    public Set<Deliverables> getDeliverablesSet() {
        return deliverablesSet;
    }

    public void setDeliverablesSet(Set<Deliverables> deliverablesSet) {
        this.deliverablesSet = deliverablesSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tickets)) {
            return false;
        }
        Tickets other = (Tickets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.bid.web.entity.Tickets[ id=" + id + " ]";
    }
    
}
