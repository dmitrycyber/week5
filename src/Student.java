public class Student extends Human {
        private double point;

        public Student (double point, int age, String name) {
            super(age, name);
            this.point = point;
        }
        public void setHumanAge (int age) {
            setAge(age);
        }

        public double getPoint() {
            return point;
        }

        public void setPoint(double point) {
            this.point = point;
        }

        public void sing () {
            System.out.println("Sing");
        }

        public void dance(){
            System.out.println("Dance");
        }

        @Override
        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }
            if (!(object instanceof Student)) {
                return false;
            }
            Student student = (Student) object;
            return this.getName().equals(student.getName()) && this.getAge() == student.getAge() &&
                    this.getPoint() == student.getPoint();
        }



}
