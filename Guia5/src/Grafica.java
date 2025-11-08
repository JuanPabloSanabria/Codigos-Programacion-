import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica {
    //Torta
    public static void mostrarGraficoTorta(JScrollPane panel, int aprobados, int reprobados) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Aprobados", aprobados);
        dataset.setValue("Reprobados", reprobados);

        JFreeChart chart = ChartFactory.createPieChart(
                "Porcentajimport org.jfree.chart.ChartFactory;\n" +
"import org.jfree.chart.JFreeChart;\n" +
"import org.jfree.data.general.DefaultPieDataset;\n" +
"import javax.swing.JScrollPane;\n" +
"import org.jfree.chart.ChartPanel;\n" +
"import org.jfree.chart.plot.PlotOrientation;\n" +
"import org.jfree.data.category.DefaultCategoryDataset;\n" +
"\n" +
"public class Grafica {\n" +
"    //Torta\n" +
"    public static void mostrarGraficoTorta(JScrollPane panel, int aprobados, int reprobados) {\n" +
"        DefaultPieDataset dataset = new DefaultPieDataset();\n" +
"        dataset.setValue(\"Aprobados\", aprobados);\n" +
"        dataset.setValue(\"Reprobados\", reprobados);\n" +
"\n" +
"        JFreeChart chart = ChartFactory.createPieChart(\n" +
"                \"Porcentaje de Aprobados/Reprobados\",\n" +
"                dataset,\n" +
"                true, \n" +
"                true, \n" +
"                false);\n" +
"\n" +
"        panel.setViewportView(new ChartPanel(chart));\n" +
"    }\n" +
"    //XY\n" +
"    public static void mostrarGraficoXY(JScrollPane panel, DefaultCategoryDataset dataset, String titulo) {\n" +
"        JFreeChart chart = ChartFactory.createLineChart(\n" +
"                titulo, \"Evaluaciones\", \"Notas\",\n" +
"                dataset,\n" +
"                PlotOrientation.VERTICAL,\n" +
"                false, \n" +
"                true,\n" +
"                false);\n" +
"        panel.setViewportView(new ChartPanel(chart));\n" +
"    }\n" +
"}e de Aprobados/Reprobados",
                dataset,
                true, 
                true, 
                false);

        panel.setViewportView(new ChartPanel(chart));
    }
    //XY
    public static void mostrarGraficoXY(JScrollPane panel, DefaultCategoryDataset dataset, String titulo) {
        JFreeChart chart = ChartFactory.createLineChart(
                titulo, "Evaluaciones", "Notas",
                dataset,
                PlotOrientation.VERTICAL,
                false, 
                true,
                false);
        panel.setViewportView(new ChartPanel(chart));
    }
}