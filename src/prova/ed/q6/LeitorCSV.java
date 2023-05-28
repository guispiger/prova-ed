package prova.ed.q6;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class LeitorCSV {
	public ArrayList<Bagagem> lerArquivo() {
		ArrayList<Bagagem> bagagens = new ArrayList<>();
		int cont = 0;
		
		try {
			FileReader arquivoGenerico = new FileReader("bagagens.csv");
			CSVFormat config = CSVFormat.Builder.create().setHeader("id", "proprietario", "peso").setSkipHeaderRecord(true).build();
			List<CSVRecord> records = config.parse(arquivoGenerico).getRecords();
			for (CSVRecord csvRecord : records) {
				String id = csvRecord.get("id");
				String proprietario = csvRecord.get("proprietario");
				BigDecimal peso = new BigDecimal(csvRecord.get("peso"));
								
				Bagagem b = new Bagagem(id, proprietario, peso);
				
				bagagens.add(b);
				cont++;
			}
			
			
		} catch (IOException e) {
			System.out.println("Erro, arquivo não localizado!!");
		}
		System.out.println(String.format("%s Bagagens processsadas!!", cont));
		
		return bagagens;
	}
}
