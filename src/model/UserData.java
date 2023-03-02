package model;

public class UserData {

        private Long id;
        private String name;
        private String phone;
        private String address;
        private String email;

        public void User() {

        }

        public UserData() {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.email = email;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }


        public String getName() {
            return name;
        }

        public void setNome(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }



