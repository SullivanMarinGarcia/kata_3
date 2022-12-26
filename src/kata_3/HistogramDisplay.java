package kata_3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
        //execute();
        createPanel();
    }

    
    
    public void execute(){
        this.setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histogram JFreeChart", "Dominio Emails", "Nº emails", dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(6, "", "ulpgc.es");
        dataSet.addValue(2, "", "gmail.com");
        dataSet.addValue(5, "", "hotmail.es");
        dataSet.addValue(7, "", "yahoo.es");
        return dataSet;
    }
    
    
}
