package co.za.assesment.csvreadwrite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.za.assesment.csvreadwrite.entity.CSVBean;
import co.za.assesment.csvreadwrite.services.CSVService;

@RestController
public class CSVController {

	@Autowired
	 private CSVService csvService;
	  
	 public void setInvoiceService(CSVService csvService) {
	  this.csvService = csvService;
	 }
	 
	 @GetMapping("/api/csv")
	 public List<CSVBean> getCSVList() {
	  List<CSVBean> csvList = csvService.getCSVList();
	  return csvList;
	 }
	  
	 @PostMapping("/api/updateList")
	 public String updateList(@RequestBody List<CSVBean> list) {
	  return csvService.updateList(list);
	 }
}
