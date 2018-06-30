public class StudentManagerTest {
    public static void main(String[] args) {
        Student andy = new Student( " Andy " , 23);
        StudentManager studentManager = new StudentManager();
//        System.out.println(andy.getInformation());
//        System.out.println("name: " + andy.getName());
//        System.out.println("tuoi: " + andy.getAge());
        studentManager.add(andy);
        System.out.println("add " + andy.getInformation());
        studentManager.displayAll();

        Student booby = new Student("Booby", 25);
        studentManager.add(booby);
        System.out.println("them " + booby.getInformation());
        studentManager.displayAll();

        Student samy = new Student("Samy", 22);
        studentManager.add(samy);
        System.out.println("Them " + samy.getInformation());
        studentManager.displayAll();
    }

}
