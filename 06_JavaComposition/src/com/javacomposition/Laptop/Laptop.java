/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javacomposition.Laptop;

import com.javacomposition.GraphicCard.GraphicCard;
import com.javacomposition.Processor.Processor;

public class Laptop {

    private String displayScreen;
    private String keyboard;
    private boolean coolingFan;
    private String ram;
    private String hardDisk;
    private Processor processor;
    private GraphicCard graphicCard;

    public Laptop() {
        displayScreen = "15.6 inch";
        keyboard = "Backlit";
        coolingFan = true;
        ram = "8GB";
        hardDisk = "1TB";
        processor = new Processor();
        graphicCard = new GraphicCard();
    }

    public Laptop(String displayScreen, String keyboard, boolean coolingFan, String ram, String hardDisk, Processor processor, GraphicCard graphicCard) {
        this.displayScreen = displayScreen;
        this.keyboard = keyboard;
        this.coolingFan = coolingFan;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.graphicCard = graphicCard;
    }

    public String getDisplayScreen() {
        return displayScreen;
    }

    public void setDisplayScreen(String displayScreen) {
        this.displayScreen = displayScreen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isCoolingFan() {
        return coolingFan;
    }

    public void setCoolingFan(boolean coolingFan) {
        this.coolingFan = coolingFan;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String showInfo() {
        return "Laptop [displayScreen=" + displayScreen + ", keyboard=" + keyboard + ", coolingFan=" + coolingFan
                + ", ram=" + ram + ", hardDisk=" + hardDisk + ", processor=" + processor.getProcessorBrand() + ", graphicCard="
                + graphicCard.getGraphicCardBrand() + "]";
    }

    

}
