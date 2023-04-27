package com.example.myreallyproject;

     public class Image_class {
        private String sourse;
        private String[] properties = new String[3];
         public Image_class(String sourse, String[] properties) {
             this.sourse = sourse;
             this.properties = properties;
         }

         public String getSourse() {
             return sourse;
         }

         public void setSourse(String sourse) {
             this.sourse = sourse;
         }

         public String[] getProperties() {
             return properties;
         }

         public void setProperties(String[] properties) {
             this.properties = properties;
         }
     }
