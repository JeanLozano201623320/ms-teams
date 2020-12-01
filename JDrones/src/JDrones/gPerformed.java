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
public class gPerformed extends JPanel{
    XYSeries seriesX1 = new XYSeries("Producto1");
    XYSeries seriesX2 = new XYSeries("Producto2");
    XYSeries seriesX3 = new XYSeries("Producto3");
    XYSeries seriesX4 = new XYSeries("Producto4");
    XYSeries seriesX5 = new XYSeries("Producto5");
    XYSeries seriesX6 = new XYSeries("Producto6");
    XYSeries seriesX7 = new XYSeries("Producto7");
    XYSeries seriesX8 = new XYSeries("Producto8");
    XYSeries seriesX9 = new XYSeries("Producto9");
    XYSeries seriesX10 = new XYSeries("Producto10");
   
    
    private ChartPanel panel;
    private XYSeriesCollection dataset;
    public gPerformed(){
        XYSeries series = new XYSeries("");
        dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                "",
                "valor de x->",
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
    public void actualizar(double[] datosX1,double[] datosY1,double[] datosX2,double[] datosY2,double[] datosX3,double[] datosY3,double[] datosX4,double[] datosY4,double[] datosX5,double[] datosY5,double[] datosX6,double[] datosY6,double[] datosX7,double[] datosY7,double[] datosX8,double[] datosY8,double[] datosX9,double[] datosY9,double[] datosX10,double[] datosY10){
        for(int i=0;i<datosX1.length;i++){
            if(datosX1[i]>0&&datosY1[i]>0)
                seriesX1.add((double)datosX1[i],(double)datosY1[i]);
            if(datosX2[i]>0&&datosY2[i]>0)
                seriesX2.add((double)datosX2[i],(double)datosY2[i]);
            if(datosX3[i]>0&&datosY3[i]>0)
                seriesX3.add((double)datosX3[i],(double)datosY3[i]);
            if(datosX4[i]>0&&datosY4[i]>0)
                seriesX4.add((double)datosX4[i],(double)datosY4[i]);
            if(datosX5[i]>0&&datosY5[i]>0)
                seriesX5.add((double)datosX5[i],(double)datosY5[i]);
            if(datosX6[i]>0&&datosY6[i]>0)
                seriesX6.add((double)datosX6[i],(double)datosY6[i]);
            if(datosX7[i]>0&&datosY7[i]>0)
                seriesX7.add((double)datosX7[i],(double)datosY7[i]);
            if(datosX8[i]>0&&datosY8[i]>0)
                seriesX8.add((double)datosX8[i],(double)datosY8[i]);
            if(datosX9[i]>0&&datosY9[i]>0)
                seriesX9.add((double)datosX9[i],(double)datosY9[i]);
            if(datosX10[i]>0&&datosY10[i]>0)
                seriesX10.add((double)datosX10[i],(double)datosY10[i]);  
        }
        /* 
        for(int i=0;i<datosX1.length;i++){
            if(datosX1[i]>0&&datosY1[i]>0)
                seriesX1.add(i,(double)datosY1[i]);
            if(datosX2[i]>0&&datosY2[i]>0)
                seriesX2.add(i,(double)datosY2[i]);
            if(datosX3[i]>0&&datosY3[i]>0)
                seriesX3.add(i,(double)datosY3[i]);
            if(datosX4[i]>0&&datosY4[i]>0)
                seriesX4.add(i,(double)datosY4[i]);
            if(datosX5[i]>0&&datosY5[i]>0)
                seriesX5.add(i,(double)datosY5[i]);
            if(datosX6[i]>0&&datosY6[i]>0)
                seriesX6.add(i,(double)datosY6[i]);
            if(datosX7[i]>0&&datosY7[i]>0)
                seriesX7.add(i,(double)datosY7[i]);
            if(datosX8[i]>0&&datosY8[i]>0)
                seriesX8.add(i,(double)datosY8[i]);
            if(datosX9[i]>0&&datosY9[i]>0)
                seriesX9.add(i,(double)datosY9[i]);
            if(datosX10[i]>0&&datosY10[i]>0)
                seriesX10.add(i,(double)datosY10[i]);   
        }*/
       
        dataset.addSeries(seriesX1);
        dataset.addSeries(seriesX2);
        dataset.addSeries(seriesX3);
        dataset.addSeries(seriesX4);
        dataset.addSeries(seriesX5);
        dataset.addSeries(seriesX6);
        dataset.addSeries(seriesX7);
        dataset.addSeries(seriesX8);
        dataset.addSeries(seriesX9);
        dataset.addSeries(seriesX10);
        
        
        panel.repaint();
    }
    public void limpiar(){
        dataset.removeAllSeries();
        panel.repaint();
         
    }        
}
