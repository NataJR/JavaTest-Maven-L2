    public class Animals {

        private String chip;
        private String name;
        private String owner;
        private String address;

        public String getChip() {

            return chip;
        }

        public void setChip(String chip) {

            this.chip = chip;
        }

        public String getName() {

            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getOwner()
        {
            return owner;
        }

        public void setOwner(String owner) {

            this.owner = owner;
         }
        public String getAddress() {

            return address;
         }
        public void setAddress (String address) {

            this.address = address;
         }
        @Override
        public String toString() {
            return "\nChip=" + getChip() + "; Name=" + getName() + "; Animals owner ="
                    + getOwner() + "; Address=" + getAddress();
    }
}


