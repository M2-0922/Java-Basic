/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javacomposition.GraphicCard;

public class GraphicCard {
    
    private String graphicCardBrand;
    private String graphicCardModel;
    private String graphicCardMemory;
    private String graphicCardMemoryType;

    public GraphicCard() {
        graphicCardBrand = "Nvidia";
        graphicCardModel = "GTX 1650";
        graphicCardMemory = "4GB";
        graphicCardMemoryType = "GDDR6";
    }

    public GraphicCard(String graphicCardBrand, String graphicCardModel, String graphicCardMemory, String graphicCardMemoryType) {
        this.graphicCardBrand = graphicCardBrand;
        this.graphicCardModel = graphicCardModel;
        this.graphicCardMemory = graphicCardMemory;
        this.graphicCardMemoryType = graphicCardMemoryType;
    }

    public String getGraphicCardBrand() {
        return graphicCardBrand;
    }

    public void setGraphicCardBrand(String graphicCardBrand) {
        this.graphicCardBrand = graphicCardBrand;
    }

    public String getGraphicCardModel() {
        return graphicCardModel;
    }

    public void setGraphicCardModel(String graphicCardModel) {
        this.graphicCardModel = graphicCardModel;
    }

    public String getGraphicCardMemory() {
        return graphicCardMemory;
    }

    public void setGraphicCardMemory(String graphicCardMemory) {
        this.graphicCardMemory = graphicCardMemory;
    }

    public String getGraphicCardMemoryType() {
        return graphicCardMemoryType;
    }

    public void setGraphicCardMemoryType(String graphicCardMemoryType) {
        this.graphicCardMemoryType = graphicCardMemoryType;
    }

    
    
}
