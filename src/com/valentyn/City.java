package com.valentyn;

public class City {
        private String cityName;

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCityName() {
            return cityName;
        }

        public class Street {
            private String streetName;

            public void setStreetName (String streetName){
                this.streetName = streetName;
            }

            public String getStreetName() {
                return streetName;
            }
        }

    public class Avenue {
        private String aveName;

        public void setAveName (String aveName){
            this.aveName = aveName;
        }

        public String getAveName () {
            return aveName;
        }
    }

    public class Square {
        private String sqrName;

        public void setSqrName (String sqrName){
            this.sqrName = sqrName;
        }

        public String getSqrName () {
            return sqrName;
        }
    }
}

