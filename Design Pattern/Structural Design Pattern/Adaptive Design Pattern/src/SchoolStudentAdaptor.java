public class SchoolStudentAdaptor implements Student {
        private SchoolStudent student;
        public SchoolStudentAdaptor(SchoolStudent student){
            this.student=student;
        }


        @Override
        public String getName() {
            return this.student.getName();
        }

        @Override
        public String getSurName() {
            return this.student.getSurName();
        }

        @Override
        public String getEmail() {
            return this.student.getEmail();
        }

}
