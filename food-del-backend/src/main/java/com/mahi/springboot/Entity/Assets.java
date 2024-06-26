package com.mahi.springboot.Entity;
import java.sql.Blob;

import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	

	@Entity
	
	public class Assets {
	 
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private Integer assetId;
		private String assetName;
		private String assetPath;
		public Integer getAssetId() {
			return assetId;
		}
		public void setAssetId(Integer assetId) {
			this.assetId = assetId;
		}
		public String getAssetName() {
			return assetName;
		}
		public void setAssetName(String assetName) {
			this.assetName = assetName;
		}
		public String getAssetPath() {
			return assetPath;
		}
		public void setAssetPath(String assetPath) {
			this.assetPath = assetPath;
		}
		public Assets(Integer assetId, String assetName, String assetPath) {
			super();
			this.assetId = assetId;
			this.assetName = assetName;
			this.assetPath = assetPath;
		}
		public Assets() {
			super();
		}
		
		
	}

