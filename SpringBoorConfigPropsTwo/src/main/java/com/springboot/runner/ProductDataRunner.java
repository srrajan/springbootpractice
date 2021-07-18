package com.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="product.app")
public class ProductDataRunner implements CommandLineRunner {
private String pname ;
private Integer pd;
private int pdq;
private Integer pprice;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPd() {
		return pd;
	}
	public void setPd(Integer pd) {
		this.pd = pd;
	}
	public int getPdq() {
		return pdq;
	}
	public void setPdq(int pdq) {
		this.pdq = pdq;
	}
	public Integer getPprice() {
		return pprice;
	}
	public void setPprice(Integer pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "ProductDataRunner [pname=" + pname + ", pd=" + pd + ", pdq=" + pdq + ", pprice=" + pprice + "]";
	}
	
}
