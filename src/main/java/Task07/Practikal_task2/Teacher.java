package Task07.Practikal_task2;

 class Teacher extends Staff {

    public static final String TYPE_PERSON = "Teacher";

     public Teacher() {
     }

     public Teacher(String name, int salar) {
        super.setName(name);
        super.setSalar(salar);
    }

     public void salary(){
            System.out.println(TYPE_PERSON + " salary is "+ getSalar());
        }

     public  void print(){
         System.out.println("I am a ..." + TYPE_PERSON);
     }
}
