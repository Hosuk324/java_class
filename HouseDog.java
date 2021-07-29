public class HouseDog extends Dog{
    public HouseDog(String name){
        this.setName(name);
    }
    public HouseDog(int type){
        if (type ==1){
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
    public void sleep(){
        System.out.println(this.name+"zzz in house");
    }
    public void sleep(int hour){
        System.out.println(this.name+"zzz in house"+ hour + " hours");
    }
    public static void main(String[] args) {
        HouseDog dog = new HouseDog("Happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    }
}
