/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javacomposition.Processor;

public class Processor {
    private String processorBrand;
    private String processorModel;
    private String processorGeneration;
    private String processorCores;
    private String processorThreads;

    
    
    // public Processor() {
    //     // processorBrand = "Intel";
    //     // processorModel = "i7";
    //     // processorGeneration = "10th";
    //     // processorCores = "6";
    //     // processorThreads = "12";
    // }

    public Processor(String processorBrand, String processorModel, String processorGeneration, String processorCores, String processorThreads) {
        this.processorBrand = processorBrand;
        this.processorModel = processorModel;
        this.processorGeneration = processorGeneration;
        this.processorCores = processorCores;
        this.processorThreads = processorThreads;
    }

    public String getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getProcessorGeneration() {
        return processorGeneration;
    }

    public void setProcessorGeneration(String processorGeneration) {
        this.processorGeneration = processorGeneration;
    }

    public String getProcessorCores() {
        return processorCores;
    }

    public void setProcessorCores(String processorCores) {
        this.processorCores = processorCores;
    }

    public String getProcessorThreads() {
        return processorThreads;
    }

    public void setProcessorThreads(String processorThreads) {
        this.processorThreads = processorThreads;
    }

    public String showInfo() {
        return "Processor [processorBrand=" + processorBrand + ", processorModel=" + processorModel
                + ", processorGeneration=" + processorGeneration + ", processorCores=" + processorCores
                + ", processorThreads=" + processorThreads + "]";
    }

    

    
    

}
