public class SchoolProject {
    // Example method to add data
    public void addData(String name, int age) {
        System.out.println("Adding data: " + name + ", age: " + age);
    }

    // Example method to remove data
    public void removeData(String name) {
        if (name.equals("*")) {
            System.out.println("Removing all data");
        } else {
            System.out.println("Removing data: " + name);
        }
    }

    // Example method to update data
    public void updateData(int age) {
        System.out.println("Updating data: " + age);
    }
}
