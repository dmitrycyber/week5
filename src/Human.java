public abstract class Human implements Singer {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public Human (int age, String name){
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
}
