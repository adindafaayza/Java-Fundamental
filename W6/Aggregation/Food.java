class Food {
    private String name;
    private String expDate;
    private String manufacturer;
    
    public String getName() {
        return name;
    }

    public void setName(String product) {
        this.name = name;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    Food(String name, String manufacturer, String expDate){
        this.name = name;
        this.manufacturer = manufacturer;
        this.expDate = expDate;
    }
}
