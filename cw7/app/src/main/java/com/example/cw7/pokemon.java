package com.example.cw7;

public class pokemon {
   private String name;
   private int image;
   private int attack;
   private int defence;
   private int total;

   public pokemon(String name, int image, int attack, int defence, int total) {
      this.name = name;
      this.image = image;
      this.attack = attack;
      this.defence = defence;
      this.total = total;
   }

   public String getName() {
      return name;
   }

   public int getImage() {
      return image;
   }

   public int getAttack() {
      return attack;
   }

   public int getDefence() {
      return defence;
   }

   public int getTotal() {
      return total;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setImage(int image) {
      this.image = image;
   }

   public void setAttack(int attack) {
      this.attack = attack;
   }

   public void setDefence(int defence) {
      this.defence = defence;
   }

   public void setTotal(int total) {
      this.total = total;
   }
}

