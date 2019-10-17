package co.za.assesment.csvreadwrite.services.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import co.za.assesment.csvreadwrite.entity.CSVBean;
import co.za.assesment.csvreadwrite.services.CSVService;

@Service
public class CSVServiceImpl implements CSVService{

	private static final String file ="C:\\Users\\bmollala\\Documents\\realestatetransactions.csv";
	private static final String write_file ="C:\\Users\\bmollala\\Documents\\write_realestatetransactions.csv";
	
	@Override
	public List<CSVBean> getCSVList() {
		return convertToBean();
	}

	@Override
	public String updateList(List<CSVBean> csvList) {
		return writeToCSV1(csvList);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<CSVBean> convertToBean() {

		List<CSVBean>	listOfBeans = null;
		try (Reader reader = Files.newBufferedReader(Paths.get(file));) {

			CsvToBean<CSVBean> csvToBean = new CsvToBeanBuilder(reader)
					.withType(CSVBean.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			listOfBeans = csvToBean.parse();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listOfBeans;

	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String writeToCSV1(List<CSVBean> csvList) {
		String message = "Successfully updated the csv file";
		try {
			// create a write
			Writer writer = Files.newBufferedWriter(Paths.get(file));

			// create a csv writer
			StatefulBeanToCsv<CSVBean> csvWriter = new StatefulBeanToCsvBuilder<CSVBean>(writer)
					.withSeparator(CSVWriter.DEFAULT_SEPARATOR)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.withEscapechar(CSVWriter.DEFAULT_ESCAPE_CHARACTER)
					.withLineEnd(CSVWriter.DEFAULT_LINE_END)
					.withOrderedResults(false)
					.build();


			// write list of objects
			csvWriter.write(csvList);

			// close the writer
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
			message = ex.getMessage();
		}

		return message;
	}
	
	
}
