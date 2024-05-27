package gui;

import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import servico.EmpresaServico;

public class GraficoProjecaoViewController implements Initializable {
	

	
	EmpresaServico empresaServico = new EmpresaServico(); // Supondo que você tenha uma classe EmpresaServico
	ProjecaoViewController projecaoViewController = new ProjecaoViewController(empresaServico);
	
	@FXML
	private BarChart<String, Double> barChart;

	@FXML
	private CategoryAxis categoryAxis;

	@FXML
	private NumberAxis numberAxis;

	private String nome;
	private Double emissao;
	
	public GraficoProjecaoViewController() {

	}

	private ObservableList<String> observableListMeses = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		criarGraficoBarras();

	}

	public void findall() {
		emissao = Double.parseDouble(projecaoViewController.getTxtEmissaoDoMes().getText());
		System.out.println(emissao);
	}
	

	private void criarGraficoBarras() {
		
	
		
		categoryAxis.setLabel("Meses");
		numberAxis.setLabel("Emissoes");
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("Emissoes por mês");

		series1.getData().add(new XYChart.Data<>("janeiro", 10));
		series1.getData().add(new XYChart.Data<>("Fevereiro", 20));
		series1.getData().add(new XYChart.Data<>("Março", 30));
		series1.getData().add(new XYChart.Data<>("Abril", 40));
		series1.getData().add(new XYChart.Data<>("maio", 50));
		series1.getData().add(new XYChart.Data<>("Junho", 60));
		series1.getData().add(new XYChart.Data<>("Julho", 70));
		series1.getData().add(new XYChart.Data<>("Julgo", 80));
		series1.getData().add(new XYChart.Data<>("agosto", 90));
		series1.getData().add(new XYChart.Data<>("setembro", 100));
		series1.getData().add(new XYChart.Data<>("outubro", 110));
		series1.getData().add(new XYChart.Data<>("novembro", 120));
		series1.getData().add(new XYChart.Data<>("Dezembro", 130));

		XYChart.Series series2 = new XYChart.Series();
		series2.setName("Meta por mês");
		series2.getData().add(new XYChart.Data<>("janeiro", 10.0));
		series2.getData().add(new XYChart.Data<>("Fevereiro", 22));
		series2.getData().add(new XYChart.Data<>("Março", 30));
		series2.getData().add(new XYChart.Data<>("Abril", 40));
		series2.getData().add(new XYChart.Data<>("maio", 50));
		series2.getData().add(new XYChart.Data<>("Junho", 66));
		series2.getData().add(new XYChart.Data<>("Julho", 70));
		series2.getData().add(new XYChart.Data<>("Julgo", 80));
		series2.getData().add(new XYChart.Data<>("agosto", 99));
		series2.getData().add(new XYChart.Data<>("setembro", 10));
		series2.getData().add(new XYChart.Data<>("outubro", 11));
		series2.getData().add(new XYChart.Data<>("novembro", 12));
		series2.getData().add(new XYChart.Data<>("Dezembro", 13));

		XYChart.Series series3 = new XYChart.Series();
		series3.setName("meta anual");
		series3.getData().add(new XYChart.Data<>("m", 1022));
		// Adicione a série ao gráfico

		barChart.getData().addAll(series1, series2, series3);
	}

	
}
