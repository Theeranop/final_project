package com.example.bmi.model;

public class Body {
    private int height;
    private int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float calculateBmi(){
        float height = this.height / 100f;
        float bmi = this.weight / (height * height);
        return bmi;
    }
    public String getResultText(){
        float bmi =calculateBmi();
        String resultText = null;
        if (bmi < 18.5)
            resultText = "น้ำหนักน้อยเกินไป";
        else if(bmi >= 18.5 && bmi <= 22.99)
            resultText = "น้ำหนักปกติ";
        else if(bmi > 22.99 && bmi <= 24.99)
            resultText ="น้ำหนักเกิน(ท้วม)";
        else if(bmi > 24.99 && bmi <= 29.99)
            resultText ="อ้วนระดับ1(อ้วนระยะเริ่มต้น)";
        else if(bmi > 29.99 && bmi <= 39.99)
            resultText ="อ้วนระดับ2(อ้วนมาก)";
        else
            resultText = "อ้วนระดับ3(อ้วนระดับรุนแรงมาก)";
        return resultText;
    }
}
