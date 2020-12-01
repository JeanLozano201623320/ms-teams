/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDrones;
import java.awt.*;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYShapeRenderer;
public class gPerformed2 extends JPanel{
    XYSeries seriesX1 = new XYSeries("Producto 1o2");
    XYSeries seriesX2 = new XYSeries("Producto 3o4");
    XYSeries seriesX3 = new XYSeries("Producto 4o5");
    XYSeries seriesX4 = new XYSeries("Producto 5o6");
    XYSeries seriesX5 = new XYSeries("Producto 6o7");
   
   
    
    private ChartPanel panel;
    private XYSeriesCollection dataset;
    public gPerformed2(){
        XYSeries series = new XYSeries("");
        dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                "drones ",
                "iteraciones->",
                "valor de y ->",
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
    public void actualizar(double[] datosY1,double[] datosY2,double[] datosY3,double[] datosY4,double[] datosY5){
   
        for(int i=0;i<datosY1.length;i++){
            if(datosY1[i]>0)
                seriesX1.add(i,(double)datosY1[i]);
            if(datosY2[i]>0)
                seriesX2.add(i,(double)datosY2[i]);
            if(datosY3[i]>0)
                seriesX3.add(i,(double)datosY3[i]);
            if(datosY4[i]>0)
                seriesX4.add(i,(double)datosY4[i]);
            if(datosY5[i]>0)
                seriesX5.add(i,(double)datosY5[i]);
            
        }
       
        dataset.addSeries(seriesX1);
        dataset.addSeries(seriesX2);
        dataset.addSeries(seriesX3);
        dataset.addSeries(seriesX4);
        dataset.addSeries(seriesX5);

        panel.repaint();
    }
    public void limpiar(){
        dataset.removeAllSeries();
        panel.repaint();
         
    }        
}

