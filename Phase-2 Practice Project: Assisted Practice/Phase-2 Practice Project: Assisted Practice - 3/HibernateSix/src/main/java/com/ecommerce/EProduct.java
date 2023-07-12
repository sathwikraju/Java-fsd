package com.ecommerce;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ex.PDescription;

import java.util.Map;


@Entity
@Table(name = "eproduct")
public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        private List<Color> colors;
        private Set<Finance> finance;
        private PDescription pdescrip;
		private Set<String> screensizes;
		private OS os;
		private List<OS> osList;
        
        public EProduct() {
                
        }
        
        public OS getOs() {return os;}
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        public List<Color> getColors() { return this.colors;}
        public Set<Finance> getFinance() { return this.finance;}
        public PDescription getPdescrip() { return this.pdescrip;}
        public Set<String> getScreensizes() {return screensizes;}
        @OneToMany(mappedBy = "EProduct")
        private List<OS> ScreenSizes;
        public List<OS> getOsList() {
            return osList;
        }

        public void setScreensizes(Set<String> screensizes) {this.screensizes = screensizes;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        public void setColors(List<Color> colors) { this.colors = colors;}
        public void setFinance(Set<Finance> finance) { this.finance = finance;}
        public void setPdescrip(PDescription pdescrip) { this.pdescrip = pdescrip;}
        public void setOs(OS os) {this.os = os;}
        public void setOsList(List<OS> osList) {
            this.osList = osList;
        }
        
}
