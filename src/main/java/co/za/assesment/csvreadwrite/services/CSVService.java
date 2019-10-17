package co.za.assesment.csvreadwrite.services;

import java.util.List;

import co.za.assesment.csvreadwrite.entity.CSVBean;

public interface CSVService {

	public List<CSVBean> getCSVList();
	
	public String updateList(List<CSVBean> csvList);
}
