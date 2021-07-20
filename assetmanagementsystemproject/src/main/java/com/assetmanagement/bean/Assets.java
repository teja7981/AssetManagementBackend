package com.assetmanagement.bean;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assets")
public class Assets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "asset_auto", strategy = "increment")
	@GeneratedValue(generator ="asset_auto")
	

	@Column(name="asset_id")
	private long assetid;
	
	@Column(name="asset_name")
	private String assetName;
	
	@Column(name="category")
	private String category;

	public long getAssetid() {
		return assetid;
	}

	public void setAssetid(long assetid) {
		this.assetid = assetid;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Assets [assetid=" + assetid + ", assetName=" + assetName + ", category=" + category + "]";
	}
	
	


	

}
