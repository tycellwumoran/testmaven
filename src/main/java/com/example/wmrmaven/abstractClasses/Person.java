package com.example.wmrmaven.abstractClasses;

public abstract class Person
{
   protected abstract String getDescription();
   private String name;

   public Person(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   @Override
   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              '}';
   }
}
