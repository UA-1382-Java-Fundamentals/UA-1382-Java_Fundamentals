package Task07.Practikal_task2;

 abstract class Staff extends Person{

    private int salar;

   public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public  void print(){
        System.out.println("I am a ..." );
    }

    public abstract void salary();
}
