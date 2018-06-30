public class StudentManager {
    private Student[] students = new Student[20];
    private int size;

    public StudentManager() {

    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }
        public void displayAll () {
            if (size == 0) {
                System.out.println("Khong co hoc sinh");

            } else if (size == 1) {
                System.out.println("Mot hoc sinh trong list");
                System.out.println(students[0].getInformation() + "");
                System.out.println();
            }else{
                System.out.println("Day la " + size + " students list: ");
                for (int i = 0; i < size; i++) {
                    System.out.println(students[i].getInformation() + ",");
                }
                System.out.println();
            }
        }
    }



