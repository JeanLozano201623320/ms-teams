/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jballs;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class gPerformed extends JPanel{
XYSeries seriesX = new XYSeries("Producto1");
XYSeries seriesY = new XYSeries("Producto2");
private ChartPanel panel;
private XYSeriesCollection dataset;
public gPerformed(){
XYSeries series = new XYSeries("");
dataset = new XYSeriesCollection();
dataset.addSeries(series);
JFreeChart chart = ChartFactory.createXYLineChart(
"Rendimiento de los Drones",
"Iteracciones->",
"Minimos ->",
dataset,
PlotOrientation.VERTICAL,
false,
false,
false
);
panel = new ChartPanel(chart);
setLayout(new java.awt.BorderLayout());
add(panel);
validate();
}
public void actualizar(double[] datosX,double[] datosY){
for(int i=0;i<datosX.length;i++){
seriesX.add(i,(double)datosX[i]);
seriesY.add(i,(double)datosY[i]);
}
dataset.addSeries(seriesX);
dataset.addSeries(seriesY);
panel.repaint();
}
public void limpiar(){
dataset.removeAllSeries();
panel.repaint();
}
}