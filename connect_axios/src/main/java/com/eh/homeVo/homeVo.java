package com.eh.homeVo;

public class homeVo {
	private String idtest_Table;
	private String test_name;
	
	public homeVo(String idtest_Table, String test_name) {
		this.idtest_Table = idtest_Table;
		this.test_name = test_name;
	}

	public homeVo() {

	}

	public String getIdtest_Table() {
		return idtest_Table;
	}

	public void setIdtest_Table(String idtest_Table) {
		this.idtest_Table = idtest_Table;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	@Override
	public String toString() {
		return "homeVo : [idtest_Table=" + idtest_Table + ", test_name=" + test_name + "]";
	}

	
}
