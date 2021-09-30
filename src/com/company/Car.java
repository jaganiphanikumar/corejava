package com.company;

public class Car implements Comparable<Car> {
   private String model;
   private String manfName;
   private Platform platform;

   Car(String model,String manfName,Platform platform){
      this.model =model;
      this.platform = platform;
      this.manfName = manfName;
   }


   public String getModel() {
      return model;
   }



   public String getManfName() {
      return manfName;
   }



   public Platform getPlatform() {
      return platform.getClone();

   }

   @Override
   public boolean equals(Object o){
      if(this.getModel().equals(((Car)o).getModel())) {
         return true;
      }
      return false;
   }


   @Override
   public int compareTo(Car o) {
      if(this.getModel().equals(o.getModel())) {
         return 0;
      }
      return 1;
   }
}
